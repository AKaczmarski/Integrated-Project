/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcu.bake;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
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
        //https://www.sis.pitt.edu/mbsclass/is2560/resources/UsingDerbyandDBMSinServlets.pdf

    Connection conn = null;
    String url = "jdbc:derby://localhost:1527/GCUBake";
    try {
        conn = DriverManager.getConnection(url,"adam","adam");
        System.out.println("yay");
        String sql = "SELECT * FROM \"Chefs\"";
        Statement st = conn.createStatement();
        ResultSet rs = null;
        rs=st.executeQuery(sql);
        while(rs.next()){
            System.out.println(rs.getString("FirstName"));
        }
        rs.close();
        
        st.executeUpdate("INSERT INTO \"ADMINNISTRATORS\"(\"IDADMIN\",\"EMAIL\",\"PASSWORD\",\"FIRSTNAME\",\"LASTNAME\",\"PHONENUMBER\") VALUES (500000,\'smth@gmail.com\', \'password\', \'Adam\', \'Kaczmarski\', null)");
        st.close();
        conn.close();
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
    

