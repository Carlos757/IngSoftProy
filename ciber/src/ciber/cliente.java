/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciber;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlo
 */
public class cliente {
   
    Socket socket;

    public cliente() {
        try {
            Socket socket= new Socket("127.0.0.1",9999);
            DataOutputStream flujo_salida = new DataOutputStream(socket.getOutputStream());
            flujo_salida.writeInt(cyber.tiempo);
            
            flujo_salida.close();
            
            
        } catch (IOException e1) {
            System.out.println(e1);
        }
    }
}














