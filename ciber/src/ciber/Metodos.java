
package ciber;

import static ciber.cyber.txtGanancias1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos Rios
 */
public class Metodos {
    /*objeto de tipo conexion*/

    public static conexion C = new conexion();
    public static Connection CC = C.conex();
    PreparedStatement us;
    String sql, usuario = "";

    public boolean iniciar(String user, String cont) {
        boolean R = false;
        try {
            Statement st = CC.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Admins;");
            while (rs.next()) {

                if (rs.getString(2).equals(user) && rs.getString(4).equals(cont)) {
                    R = true;
                    usuario = rs.getString("Usuario");
                }
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return R;
    }
    public static String ultimoID(){
        
        String a="";
        try
        {
            
            Statement st = CC.createStatement();
            ResultSet rs = st.executeQuery("select idVentas from ventas order by idVentas desc limit 1;");
        while (rs.next())
        {

              a = rs.getString("idVentas");
              System.out.println(rs);
        }

        }

    catch (SQLException ex)

    {

        JOptionPane.showMessageDialog(null, ex);

    }
        return a;
   }
    public static String ultimoID2(){
        
        String a="";
        try
        {
            
            Statement st = CC.createStatement();
            ResultSet rs = st.executeQuery("select idRentas from rentas order by idRentas desc limit 1;");
        while (rs.next())
        {

              a = rs.getString("idRentas");
              System.out.println(rs);
        }

        }

    catch (SQLException ex)

    {

        JOptionPane.showMessageDialog(null, ex);

    }
        return a;
   }
    
     public void elimina_empleado(int Id){
        try {  
            String sql = "DELETE FROM admins WHERE idAdmins="+Id; 
            us = CC.prepareStatement(sql);
            us.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al eliminar empleado " + e);
        }
    }
     
    
    public void Agregar_empleado(int Id, String Usuario, JComboBox<String> turno,String pass){
         try {
            us = CC.prepareStatement("INSERT INTO admins(idAdmins, Usuario, Turno, Pass) VALUES("
                    + Id + ",'" + Usuario + "','"+turno.getSelectedItem()+"','" + pass + "')");
            us.executeUpdate();
        } catch (SQLException ex) {
             System.out.println("");
        }
    }
    
    public void llena_combobox(JComboBox tabla){
        try {
            sql = "SELECT NombreC FROM clientes";
            us = C.conex().prepareStatement(sql);
            ResultSet res = us.executeQuery();
            while (res.next()) {
                tabla.addItem(res.getString("NombreC"));
            }
            System.out.println("Ya agregó los clientes al combobox");
            res.close();
        } catch (Exception e) {
            System.out.println("no visualiza clientes existentes: " + e);
        }
    }

    public void Mostrarconsultas(DefaultTableModel tabla, String sql) {
        int Nc = tabla.getColumnCount();
        Object[] datos = new Object[Nc];
        try {
            us = CC.prepareStatement(sql);
            ResultSet res = us.executeQuery();
         
            while (res.next()) {
                for (int i = 0; i < Nc; i++) {
                    datos[i] = res.getObject(i + 1);
                }
                tabla.addRow(datos);
            }
            res.close();
        } catch (Exception e) {
            System.out.println("err: "+e);
        }
    }

    public void Agregarequipo(JComboBox<String> tipo_e, int Id, String nombre) {

        try {
            us = CC.prepareStatement("INSERT INTO equipos(idEquipos, Tipo, Estatus, Nequipo) VALUES("
                    + Id + ",'" + tipo_e.getSelectedItem() + "','Espera','" + nombre + "')");
            us.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void nombreproductos(JComboBox<String> elige_prod){
        elige_prod.removeAllItems();
        elige_prod.setVisible(true);
       
        try{
            sql = "SELECT NombreP FROM producto";
            us = CC.prepareStatement(sql);
            ResultSet res = us.executeQuery();
            while (res.next()) {
                elige_prod.addItem(res.getString("NombreP"));
            }
            System.out.println("Ya agregó los productos al combobox");
            res.close();
        
        }catch (Exception e) {
            System.out.println("no visualiza productos existentes: "+ e);
        }
    }
    
    public void Agregarventas(int idClientes, int Producto_idProducto, String Fecha_V,int Admins_idAdmins,int cantidad ,int Precio_final ){
         try{
            String sql ="INSERT INTO ventas (`idClientes`, `idProducto`,`idAdmins`,`Fecha_V` , `Cantidad`, `Precio_final`) VALUES "
                    + "('"+idClientes+"', '"+Producto_idProducto+"', '"+Admins_idAdmins+"', '"+Fecha_V+"', '"+cantidad+"', '"+Precio_final+"');";
                                //no es necesario agregar el idVentas, ya que es autoincrementable
            us = CC.prepareStatement(sql);
            us.executeUpdate();
            us.close();
            System.out.println("Venta agregada");
        }catch(Exception e){
            System.out.println("Error al agregar nueva venta: "+e);
        }
    }
    
    public void clientenuevo(String nombre, String tipo, Integer visitas) {
        try {
            String sql = "INSERT INTO clientes(NombreC,Tipo, Visitas) "
                    + "VALUES('" + nombre + "','" + tipo + "'," + visitas + ")"; //no es necesario agregar el idCliente, 
                            //ya que es autoincrementable
            us = CC.prepareStatement(sql);
            us.executeUpdate();
            System.out.println("Cliente agregado");
        } catch (Exception e) {
            System.out.println("Error al agregar nuevo cliente: " + e);
        }
    }
    
    public Integer vistas(Integer idcliente){
        int visitas=0, vis=0;
        try {
            us = CC.prepareStatement("SELECT Visitas FROM Clientes WHERE idClientes = " + idcliente);
            ResultSet res = us.executeQuery();
            while (res.next()) {
               visitas = res.getInt("Visitas");
               
            }
                vis = visitas+1;
           
            us = CC.prepareStatement("UPDATE Clientes SET Visitas="+vis+" WHERE idClientes = " + idcliente);
            us.executeUpdate();
            System.out.println("Visitas actuales del cliente: "+vis);
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vis;
    }
    
     public Integer idcliente(String sql1){
        int id=0;
        try{
            us = CC.prepareStatement(sql1);
            ResultSet res = us.executeQuery();
            while (res.next()) {
                id =  res.getInt(1);
            }
            System.out.println("id cliente obtenido: "+id);
        }catch(Exception e){
            System.out.println("Error con el idCliente: "+ e);
        } 
        return id;
    }

    public void generarrenta(int id,String H_inicio, String H_fin, int ideq, int idcliente, float monto, String fecha, Object idadmin) {
        try {
            System.out.println("fecha:"+fecha);
            us = CC.prepareStatement("INSERT INTO rentas(idRentas,HoraInicio,HoraFin, idEquipos, idClientes,idAdmins,Fecha_R,`Monto a pagar`)"
                    + "VALUES("+id+",'" + H_inicio + "','" + H_fin + "'," + ideq + "," + idcliente + "," + idadmin  + ",'" + fecha  + "'," + monto + ")");
            us.executeUpdate();
            System.out.println("Renta guardada");
            
            JOptionPane.showMessageDialog(null, "DATOS DE RENTA AGREGADOS.\nID CLIENTE: "+idcliente+
                "\nMONTO A PAGAR: $"+monto+"\nID ADMIN: "+idadmin);
            
            us=CC.prepareStatement("UPDATE equipos SET Estatus='Activa' WHERE idEquipos="+ideq);
            us.executeUpdate();
            System.out.println("Equipo cambiado a 'Activa'");
        } catch (SQLException e) {
            System.out.println("Error al guardar datos: " + e);
        }
    }
    
    public void cambiaestado(String sql){
        try{
            us = CC.prepareStatement(sql);
            us.executeUpdate();
            
            System.out.println("Estado del equipo cambiado a 'Espera'");
            //JOptionPane.showMessageDialog(null, "!ESTADO DEL EQUIPO CAMBIADO¡");
            
        } catch (SQLException e) {
            System.out.println("Error al cambiar estado: " + e);
        }
         
     }

    public void limpiartabla(DefaultTableModel tabla) {
        for (int i = 0; i < tabla.getRowCount(); i++) {
            tabla.removeRow(i);
            i -= 1;
        }
    }

    public String empleado() {
        return usuario;
    }
    
    public  void mostrarreporte( DefaultTableModel tabla, String sql){
        Object[] datos = new Object[6];
        try {
            us = CC.prepareStatement(sql);
            ResultSet res = us.executeQuery();
            while (res.next()) {
                for (int i = 0; i < 6; i++) {
                    datos[i] = res.getObject(i + 1);
                }
                tabla.addRow(datos);
            }
            res.close();
        } catch (Exception e) {
            System.out.println("Error mostrando reporte: "+e);
        }
    }
    
    public Integer idadmin(){
        int idadmin=0;
        String sql;
        try{
            sql="SELECT idAdmins FROM admins WHERE Usuario='"+empleado()+"'";
            us = CC.prepareStatement(sql);
            ResultSet res = us.executeQuery();
            while (res.next()) {
                idadmin =  res.getInt(1);  
            }
            System.out.println("ID Admin: "+ idadmin);
            
        }catch(Exception e){
            System.out.println("Error en idAdmin: "+ e);
        }
        
        return idadmin;
    }
    public Integer ganancias(int opcion){
        int ganancias=0,ganancias1 = 0;
        String sql;
        if(opcion == 0){    
            try{
                sql="SELECT SUM(`Monto a pagar`) as total FROM rentas order by 1";
                us = CC.prepareStatement(sql);
                ResultSet res = us.executeQuery();
                while (res.next()) { 
                    String gan = Integer.toString(res.getInt(1));
                    cyber.txtGanancias1.setText("$ "+gan);
                }
                sql="SELECT SUM(Precio_final) as total FROM ventas v INNER JOIN producto p on p.idProducto = v.idProducto order by 1";
                us = CC.prepareStatement(sql);
                ResultSet res1 = us.executeQuery();
                while (res1.next()) {
                    String gan = Integer.toString(res1.getInt(1));
                    cyber.txtGanancias2.setText("$ "+gan); 
                }

            }catch(Exception e){
                System.out.println("Error en ganancias: "+ e);
            }
        }
        if(opcion == 1){    
            try{
                sql="SELECT SUM(`Monto a pagar`) as total FROM rentas WHERE YEAR(Fecha_R) = YEAR(CURDATE()) AND WEEKOFYEAR(Fecha_R) = (WEEKOFYEAR(CURDATE())-1) order by 1";
                us = CC.prepareStatement(sql);
                ResultSet res = us.executeQuery();
                while (res.next()) { 
                    String gan = Integer.toString(res.getInt(1));
                    cyber.txtGanancias1.setText("$ "+gan);
                }
                sql="SELECT SUM(Precio_final) as total FROM ventas v INNER JOIN producto p on p.idProducto = v.idProducto WHERE YEAR(Fecha_V) = YEAR(CURDATE()) AND WEEKOFYEAR(Fecha_V) = (WEEKOFYEAR(CURDATE())-1) order by 1";
                us = CC.prepareStatement(sql);
                ResultSet res1 = us.executeQuery();
                while (res1.next()) {
                    String gan = Integer.toString(res1.getInt(1));
                    cyber.txtGanancias2.setText("$ "+gan); 
                }

            }catch(Exception e){
                System.out.println("Error en ganancias: "+ e);
            }
        }
        if(opcion == 2){    
           try{
                sql="SELECT SUM(`Monto a pagar`) as total FROM rentas WHERE YEAR(Fecha_R) = YEAR(CURDATE()) AND MONTH(Fecha_R) = (MONTH(CURDATE())-1) order by 1";
                us = CC.prepareStatement(sql);
                ResultSet res = us.executeQuery();
                while (res.next()) { 
                    String gan = Integer.toString(res.getInt(1));
                    cyber.txtGanancias1.setText("$ "+gan);
                }
                sql="SELECT SUM(Precio_final) as total FROM ventas v INNER JOIN producto p on p.idProducto = v.idProducto WHERE YEAR(Fecha_V) = YEAR(CURDATE()) AND MONTH(Fecha_V) = (MONTH(CURDATE())-1) order by 1";
                us = CC.prepareStatement(sql);
                ResultSet res1 = us.executeQuery();
                while (res1.next()) {
                    String gan = Integer.toString(res1.getInt(1));
                    cyber.txtGanancias2.setText("$ "+gan); 
                }

            }catch(Exception e){
                System.out.println("Error en ganancias: "+ e);
            }
        }
        if(opcion == 3){    
            try{
                sql="SELECT SUM(`Monto a pagar`) as total FROM rentas WHERE YEAR(Fecha_R) = YEAR(CURDATE()) AND YEAR(Fecha_R) = (YEAR(CURDATE())) order by 1";
                us = CC.prepareStatement(sql);
                ResultSet res = us.executeQuery();
                while (res.next()) { 
                    String gan = Integer.toString(res.getInt(1));
                    cyber.txtGanancias1.setText("$ "+gan);
                }
                sql="SELECT SUM(Precio_final) as total FROM ventas v INNER JOIN producto p on p.idProducto = v.idProducto WHERE YEAR(Fecha_V) = YEAR(CURDATE()) AND YEAR(Fecha_V) = (YEAR(CURDATE())) order by 1";
                us = CC.prepareStatement(sql);
                ResultSet res1 = us.executeQuery();
                while (res1.next()) {
                    String gan = Integer.toString(res1.getInt(1));
                    cyber.txtGanancias2.setText("$ "+gan); 
                }

            }catch(Exception e){
                System.out.println("Error en ganancias: "+ e);
            }
        }

        return ganancias;
    }
    
    public void elimina_equipo(int Id){
        try {  
            String sql = "DELETE FROM equipos WHERE idEquipos="+Id; 
            us = CC.prepareStatement(sql);
            us.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al eliminar equipo " + e);
        }
    }
}





























