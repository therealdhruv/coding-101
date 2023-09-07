package file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;




public class Dem {
    public static void main(String[] args) {

        // code to create a new file
        

        File sc = new File("dem.txt");
        try {
            sc.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file!");
            e.printStackTrace();
        }
            
        
         
        // // code to write into a file 'dem.txt'
        // // we'll use FileWriter
        // try {
        //     FileWriter sc = new FileWriter("dem.txt");
        //     sc.write("Arjun bada madarchod hai");
        //     sc.close();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        
        
        
        
        
        // // code to read a file
        // File newF = new File("dem.txt");
        
        // try {
            
        //     Scanner sc = new Scanner(newF);
            
        //     while (sc.hasNextLine()) {
        //         String line = sc.nextLine();
        //         System.out.println(line);
        //     }
            
        //     sc.close();
            
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }
        
        
        
        
        
        
        
        // // code to delete a file
        // File myFile = new File("dem.txt");
        // if (myFile.delete()) {
        //     System.out.println(myFile.getName() + "has been successfully deleted!");
        // } else {
        //     System.out.println("Nope! error occured");
        // }
        
        
       
        
        
    }
}