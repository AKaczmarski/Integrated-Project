/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcu.bake;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
/**
 *
 * @author akaczm200
 */
public class GCUBake {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Administrators admin;
        admin = new Administrators ("smth@gmail.com", "password", "Adam", "Kaczmarski", null);
        
        System.out.println(admin.getAdminID());
        
        
       // admin.addChef("doopa@gmail.com", null, null, null);
        Chefs chef;
        chef = new Chefs ("doopa@gmail.com", "kasjd", null, null);
        Customers cust;
        cust = new Customers ("jsk@gmail.com","sada",null, null, null);
        System.out.println(chef.getChefId());
        
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
    

