/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_16_ejercicio_arreglos;

/**
 *
 * @author Ana Paulina Villegas
 */
public class EVA1_16_EJERCICIO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arregloElementos = new int[50];
        int[] arregloCopia =new int [50];
        
        for (int i = 0; i < arregloElementos.length; i++) {
            arregloElementos[i] = ((int)(Math.random() * 100)) +1 ;   
            System.out.print(arregloElementos[i] + " ");
        }
               
        System.out.println("");
        for (int i = 0; i < arregloElementos.length; i++) {
            if (arregloElementos[i]%2==0) {
                
            }
            
        }
        
        
        
        }
   

}