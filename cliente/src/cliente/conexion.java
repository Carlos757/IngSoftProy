
package cliente;

import java.net.InetAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Rios
 */
public class conexion {
        Connection con = null;
        String ip = "",id="";
    public Connection conex (){
        try{
        //ip = "198.168.0.4";   //Aqui va la ip de la pc con el servidor
        Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://"+ip+"/ciber","root","");
            System.out.println("Conexion establecida");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
            id = JOptionPane.showInputDialog(null, "INGRESE EL ID DEL EQUIPO:", "NUMERO DE EQUIPO", 1);
            cliente.pc = Integer.parseInt(id);
            ip = JOptionPane.showInputDialog(null, "INGRESE EL IP DEL SERVIDOR:", "CONECTAR A SERVIDOR", 1);
            conex();
        }
        return con;
    }
}


































