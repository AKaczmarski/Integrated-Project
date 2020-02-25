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
public class GCUBake {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Administrators admin;
        admin = new Administrators ("smth@gmail.com", "password", "Adam", "Kaczmarski", null);
        Administrators admin2;
        admin2 = new Administrators ("smth@gmail.com", "password", "Adam", "Kaczmarski", null);
        Administrators admin32;
        admin32 = new Administrators ("smth@gmail.com", "password", "Adam", "Kaczmarski", null);
        System.out.println(admin.getAdminID());
        System.out.println(admin32.getAdminID());
        
       // admin.addChef("doopa@gmail.com", null, null, null);
        Chefs chef;
        chef = new Chefs ("doopa@gmail.com", null, null, null);
        System.out.println(chef.getChefId());
        //ddoawklfhsalkfas
    }
    
}
