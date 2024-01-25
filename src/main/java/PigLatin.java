import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PigLatin {
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    
    public void tester() {
        // String[] lines = loadStrings("words.txt");
        String[] lines = new String[8]; 
        try {
            File myFile = new File("words.txt");
            Scanner myReader = new Scanner(myFile);
            int counter = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                lines[counter] = data;
                counter++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("There are " + lines.length + " lines");
        for (int i = 0; i < lines.length; i++) {
            System.out.println(pigLatin(lines[i]));
        }
    }
    
    public int findFirstVowel(String sWord) {
        return -1;
    }

    public String pigLatin(String sWord) {
        if (sWord.substring(0, 2).equals("qu")) {
            return (sWord.substring(2, sWord.length()) + "quay");
        }
        
        int v = 0;
        for (int i = 0; i < sWord.length(); i++) {
            for (int o = 0; o < vowels.length; o++) {
                if (sWord.charAt(i) == vowels[o]) {
                    v++;
                }
            }
        }
        
        if (v == 0) {
            return (sWord + "ay");
        }
        
        for (int i = 0; i < vowels.length; i++) {
            if (sWord.charAt(0) == vowels[i]) {
                return (sWord + "way");
            }
        }
        
        return sWord.substring(1, sWord.length()) + sWord.substring(0, 1) + "ay";
    }
}
