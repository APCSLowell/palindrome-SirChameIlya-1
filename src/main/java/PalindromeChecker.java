import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PalindromeChecker {
public void tester()
{
  //String lines[] = loadStrings("palindromes.txt");
  String[] lines = new String[6]; 
    try{
        File myFile = new File("palindromes.txt");
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
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      System.out.println(lines[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public boolean palindrome(String word)
{
   String sWord = new String();
  for (int i = 0; i < word.length(); i++){
    if ( Character.isLetter( word.charAt(i) ) ) {
      sWord += word.substring(i,i+1).toLowerCase();
    }
  }
  
  for (int i = 0; i < sWord.length(); i++){
    if (!sWord.substring(i, i+1).equals(sWord.substring(sWord.length()-1 - i,sWord.length() - i)) ){
      return false;
    }
  }
  return true;
}
public String reverse(String str)
{
    String result = "";
  for(int i = str.length()-1; i >= 0 ; i--){
    result += str.substring(i,i+1);
  }
  return result;
}
}
