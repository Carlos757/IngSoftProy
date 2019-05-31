/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class metodos {
    /*objeto de tipo conexion*/

    conexion C = new conexion();
    Connection CC = C.conex();
    PreparedStatement us;
    String sql, usuario = "";
    
    
    public boolean verifica(int Id){
        boolean activo = false;
        try{
            sql = "SELECT Estatus FROM `equipos` WHERE `idEquipos` ="+Id;
            us = CC.prepareStatement(sql);
            ResultSet res = us.executeQuery();
            while (res.next()) {
                System.out.println(res.getString("Estatus")); 
                String res1 = res.getString("Estatus"); 
                if(res1.equals("Activa"))
                {
                    activo = true;
                }
            }
            res.close();
        
        }catch (Exception e) {
            System.out.println("Hubo un error "+ e);
        }
         return activo;
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
    
    
    

}











