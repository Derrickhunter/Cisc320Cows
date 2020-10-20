import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.File;  // Import the File class

public class Main{
    
//  List: Ready file 
// Arraylist : 
// Buffered /
     /*
    TODO:
    1) enter main method
    2) enter file reader
    3) enter arrayList
    */

    
    public static void main(String args[]){
     

        try {
            FileReader myObj = new FileReader("filename.txt");//Input file
            Scanner myReader = new Scanner(myObj); //Read file
            while (myReader.hasNextLine()) { //While file has next line 
              String data = myReader.nextLine(); // Read in line
              parseLine(data); // Parse using delimeter
            }
            myReader.close(); //Close scanner
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

    }

    private static void parseLine(String data){
        String arg1, arg2, arg3,arg4;
        Scanner sc = new Scanner(data);
        sc.useDelimiter(" ");

        // Check if there is another line of input
        while(sc.hasNext()){
            arg1 = sc.next();
            arg2 = sc.next();
            arg3 = sc.next();
            arg4 = sc.next();
            System.out.println("arg1  - " + arg1 + " arg2 - " + arg2 + 
                " arg3 - " + arg3 + " arg4 - " + arg4 );  
        }
        sc.close();
     }
}
    




