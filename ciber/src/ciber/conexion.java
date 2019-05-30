
package ciber;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Carlos Rios
 */
public class conexion {
        Connection con = null;
    public Connection conex (){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost/ciber","root","");
            System.out.println("Conexion establecida");
            cyber.c = true;
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        return con;
    }

   
    
    
}





























