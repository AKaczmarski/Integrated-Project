/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcu.bake;

import static gcu.bake.Administrators.appendStrToFile;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 *
 * @author akaczm200
 */
public class Chefs {
   
    //Variables
    private static int ChCounter = 0;
    private int ChefID = 200000;
    private final String ChEmail;
    private String ChPassword;
    private String ChFirstName;
    private String ChLastName;
    private String ChPhoneNo;
    //*******************
    
    //Contructor
    
    //This one doesnt require phone number
    public Chefs (String email, String pswd, String fname, String lname){
        ChefID += ChCounter;
        ChEmail = email;
        ChPassword = pswd;
        ChFirstName = fname;
        ChLastName = lname;
        ChPhoneNo = null;
        ChCounter++;
        
        try {
            /* Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("users.txt"), "utf-8"));
            writer.write(email+";"+pswd+";"+"2"); writer.write(System.getProperty("line.separator"));
            writer.close(); */
            String str = (email+";"+pswd+";"+"2"); 
        appendStrToFile("users.txt", str); 
        } catch (Exception e){
         e.printStackTrace();  
        }
    }
    
    public Chefs (String email, String pswd, String fname, String lname, String ph){
        ChefID += ChCounter;
        ChEmail = email;
        ChPassword = pswd;
        ChFirstName = fname;
        ChLastName = lname;
        ChPhoneNo = ph;
        ChCounter++;
    }
    //*******************
    
    //Getters
    public int getChCounter (){
        return this.getChCounter();
    }
    public int getChefId(){
        return this.ChefID;
    }
    //*******************
    
    //Setters
    
    //*******************
    
    //Methods
        public static void appendStrToFile(String fileName, 
                                       String str) 
    { 
        try { 
  
            // Open given file in append mode. 
            BufferedWriter out = new BufferedWriter( 
                   new FileWriter(fileName, true)); 
            out.write(str);
            out.write(System.getProperty("line.separator"));
            out.close(); 
        } 
        catch (IOException e) { 
            System.out.println("exception occoured" + e); 
        } 
    } 
    //*******************
}
