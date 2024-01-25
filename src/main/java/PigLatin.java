import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PigLatin {
    
    public void tester() {
        // String[] lines = loadStrings("words.txt");
        String[] lines = new String[8]; 
        try{
            File myFile = new File("words.txt");
            Scanner myReader = new Scanner(myFile);
            int counter = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                lines[counter] = data;
                counter++;
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
	    System.out.println("there are " + lines.length + " lines");
	    for (int i = 0 ; i < lines.length; i++) {
	        System.out.println(pigLatin(lines[i]));
	    }
    }
    public int findFirstVowel(String sWord) {
        return -1;
    }

    public String pigLatin(String sWord) {
    	if(sWord.substring(0, 2).equals("qu"))
     	 return(sWord.substring(2, sWord.length()) + "quay");
    //code for words starting with "qu"
    
    	int v = 0;
    	for(int i = 0; i < sWord.length(); i++){
     	 for(int o = 0; o < vowels.length; o++){
    	    if(sWord.charAt(i) == vowels[o])
    	      v++;
   	   }
   	 }
	    
	if(v == 0)
		return(sWord + "ay");
 	   //code for words made entirely of consonants
    
	    for(int i = 0; i < vowels.length; i++){
	      if(sWord.charAt(0) == vowels[i])
	        return(sWord + "way");
	    }  
	    //code for words starting w/ a vowel
    
	    return sWord.substring(1, sWord.length()) + sWord.substring(0, 1) + "ay";
	    //if not any other cases, it's a word that starts w/ a consonant.
  }
    }
}//end PigLatin class
