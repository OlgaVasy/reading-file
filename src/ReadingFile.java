/**
 * Task 3: ReadingFile.java
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {

   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Please enter the text file name: ");
      String fileName = sc.nextLine();

      try{
         sc = new Scanner(new File(fileName));
      }
      catch (FileNotFoundException ex){
         System.err.println(fileName + " not found");
         System.exit(1);
      }
      while (sc.hasNext())      {
         if(sc.hasNextInt())
         {int number = sc.nextInt();}
         else{
         String word = sc.next();
         System.out.println (word);}}
      }
   }

