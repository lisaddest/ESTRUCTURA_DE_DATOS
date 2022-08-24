/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_foreach;

/**
 *
 * @author Ana Paulina Villegas
 */
public class EVA1_5_FOREACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int[] arregloDatos = new int [50];      
        for (int i = 0; i < arregloDatos.length; i++) {         // for each va del primero al ultimo uno x uno sin dar las posiciones
            arregloDatos[i] = (int) (Math.random() * 100);              
            
        }
        // for each
        for (int arregloDato : arregloDatos) {
            System.out.println("[" + arregloDato + "]");  
        }
    }
    
}
