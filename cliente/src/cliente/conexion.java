
package cliente;

import java.net.InetAddress;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Carlos Rios
 */
public class conexion {
        Connection con = null;
    public Connection conex (){
        try{
        String ip = "192.168.50.64";   //Aqui va la ip de la pc con el servidor
        Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://"+ip+"/ciber","root","hola");
            System.out.println("Conexion establecida");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        return con;
    }
}



















