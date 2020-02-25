/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcu.bake;

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
public class Customers {
    //Variables
    private static int CCounter=0;
    private static int CustomerID=000000;
    private final String CuEmail; //unchangeable
    private String CuPassword;
    private String CuPhoneNo;
    private String CuFirstName;
    private String CuLastName;
    //*******************
    
    //Contructors
    public Customers(String email, String pswd, String phoneNo, String firstname, String lastname){
        CustomerID += CCounter;
        CuPassword = pswd;
        CuEmail = email;
        CuPhoneNo = phoneNo;
        CuFirstName = firstname;
        CuLastName = lastname;
        CCounter++;
        
        try {
            /* Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("users.txt"), "utf-8"));
            writer.write(email+";"+pswd+";"+"0"); writer.write(System.getProperty("line.separator"));
            writer.close(); */
           String str = (email+";"+pswd+";"+"0"); 
        appendStrToFile("users.txt", str); 

        } catch (/*IOException e*/Exception e){
         e.printStackTrace();  
        }
    }
    //*******************
    
    //Getters
    public int getCCounter(){
        return this.CCounter;
    }
    public int getCuID(){
        return this.CustomerID;
    }
    public String getCuPassword(){
        return this.CuPassword;
    }
    public String getCuEmail(){
        return this.CuEmail;
    }
    public String getCuPhoneNo(){
        return this.CuPhoneNo;
    }
    //*******************
    
    //Setters
    public void setCuPassword(String passwd){
        this.CuPassword = passwd;
    }
    public void setCuPhoneNo(String ph){
        this.CuPhoneNo = ph;
    }
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
