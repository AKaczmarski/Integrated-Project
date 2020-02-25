/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcu.bake;

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
    }
    //***********************
    
    //Getters
    public int getACounter(){
        return this.ACounter;
    }
    public int getAdminID(){
        return this.AdminID;
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
    //*******************
}
  
