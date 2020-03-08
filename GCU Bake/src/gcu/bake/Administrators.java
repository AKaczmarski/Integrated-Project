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
import java.util.ArrayList;

/**
 *
 * @author akaczm200
 */
public class Administrators {
    //Variables
    private static int ACounter=0;
    private int AdminID = 500000 ;
    private final String AEmail;
    private String APassword;
    private String AFirstName;
    private String ALastName;
    private String APhoneNo;
    //***********************
    
    //Contructor
    public Administrators (String email,String pswd,String fname,String lname, String ph){
        AdminID += ACounter; 
        AEmail = email;
        APassword = pswd;
        AFirstName = fname;
        ALastName = lname;
        APhoneNo = ph;
        ACounter++;
        
        try {
            /*Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("users.txt"), "utf-8"));
            writer.write(email+";"+pswd+";"+"5"); writer.write(System.getProperty("line.separator"));
            writer.close();*/
        String str = (email+";"+pswd+";"+"5"); 
        appendStrToFile("users.txt", str); 
        } catch (Exception e){
         e.printStackTrace();  
        }
    }
    //***********************
    
    //Getters
    public int getACounter(){
        return this.ACounter;
    }
    public int getAdminID(){
        return this.AdminID;
    }
    public String getAEmail(){
        return this.AEmail;
    }
    public String getAPassword(){
        return this.APassword;
    }
    //***********************
    
    //Setters
    public void setAPhoneNo(String ph){
        this.APhoneNo = ph;
    }
    //***********************
    
    //Methods
    public void addChef(String email, String pswd, String fname, String lname){
        Chefs chef;
        chef = new Chefs (email,pswd,fname,lname);    
    } /*
    public addLesson(){
        
    }
    public removeLesson(String LessonID){
        
    }
    public removeChef(String ChefID){
        
    }
    */
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
        
     //CHEF EXPORT
    /* public static void chefsExport(ArrayList<Chefs> chefs){
        //BufferedWriter out = new BufferedWriter(new FileWriter("dupa.txt",true));
        Writer y = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("../test.txt"),"utf-8"));
        for (Chefs x : chefs){
            y.write(String.valueOf(x.getChefId())+" "+x.getChEmail()+" "+x.getChPassword()+" "+x.getChFirstName()+" "+x.getChLastName()+"\n");
        }
        y.close(); 
    } */
    //*******************
}
  
