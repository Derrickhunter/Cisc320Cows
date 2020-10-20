import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String args[])throws Exception{ 
        FileReader input = new FileReader("cowstest/input1.txt");
    
    }

    public static ArrayList<String> FileReader(String filename) {
            List<String> record = new ArrayList<String>();
            try{
                    BufferedReader reader = new BufferedReader(new FileReader(filename));
                    String line;
                    reader.readLine();
                    while((line = reader.readLine()) != null){
                            record.add(line);
                    }
                    reader.close();
            } catch(Exception e){
                    System.err.format("error");
                    e.printStackTrace();
            }

            return record;
    }

}
