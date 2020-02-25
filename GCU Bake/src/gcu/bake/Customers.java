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
public class Customers {
    //Variables
    private int CCounter=0;
    private static int CustomerID=000000;
    private final String CuEmail; //unchangeable
    private String CuPassword;
    private String CuPhoneNo;
    private String CuFirstName;
    private String CuLastName;
    //*******************
    
    //Contructors
    public Customers(String password, String email, String phoneNo, String firstname, String lastname){
        CustomerID += CCounter;
        CuPassword = password;
        CuEmail = email;
        CuPhoneNo = phoneNo;
        CuFirstName = firstname;
        CuLastName = lastname;
        CCounter++;
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
    
    //*******************
    
}
