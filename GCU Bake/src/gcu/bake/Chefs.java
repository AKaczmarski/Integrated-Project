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
    
    //*******************
}
