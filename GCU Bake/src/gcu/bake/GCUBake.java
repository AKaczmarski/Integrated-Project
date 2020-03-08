/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcu.bake;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.sql.*;
import java.util.Properties;
/**
 *
 * @author akaczm200
 */
public class GCUBake {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Administrators admin;
        admin = new Administrators ("smth@gmail.com", "password", "Adam", "Kaczmarski", null);
        

    Connection conn = null;
    try {
       
    conn.getConnection("jdbc:derby://localhost:1527/GCUBake","adam","adam");
    } catch (SQLException e) {
        System.out.println(e);
    }    

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
/*
        ArrayList<Chefs> chefs = new ArrayList<>();
        chefs.add(new Chefs("doopa@gmail.com", "kasjd", "Mario", "Kom"));
        chefs.add(new Chefs("doopa@gmail.com", "kasjd", "Thomas", "Pop"));
        chefs.add(new Chefs("doopa@gmail.com", "kasjd", "John", "Nul"));
       
            chefs.forEach((num) -> {
            System.out.println(num.getChefId()+" "+num.getChEmail() + " " + num.getChPassword()+" "+num.getChFirstName()+" "+num.getChLastName());
        });
            */
        /*
        //EXPORT
        //Exports all the instances of chefs to a text file
        Writer y = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("test.txt"),"utf-8"));
        for (Chefs x : chefs){
            y.write(String.valueOf(x.getChefId())+" "+x.getChEmail()+" "+x.getChPassword()+" "+x.getChFirstName()+" "+x.getChLastName()+"\n");
        }
        y.close();
        */
    
        
        //IMPORT
        //https://stackoverflow.com/questions/7133077/how-to-input-the-data-from-a-txt-file-into-a-arraylist-involving-multiple-data
        
        
        
        
        
            /* try {
        Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("filename.txt"), "utf-8"));
        writer.write();
        writer.write(System.getProperty("line.separator"));
        writer.write("jdsa");
        //writer.write(admin32.getACounter().toString());
        writer.close();
        } catch (Exception e){
        System.out.println("messup");
        } */
        
}
        
        
    }
    

