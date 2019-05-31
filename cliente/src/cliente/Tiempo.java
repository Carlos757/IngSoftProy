/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

/**
 *
 * @author Carlo
 */
public class Tiempo {
    public static void main(String[] args) throws InterruptedException{
        
            int segundos = 0;
            int limite = cliente.tiempo; 
            while(segundos!=limite){
               Thread.sleep(1000);
               segundos++;
               System.out.println(segundos);
            }
            
        
    }
   
}










