/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_17_ejercicio_arreglos_3;

/**
 *
 * @author Ana Paulina Villegas
 */
public class EVA1_17_EJERCICIO_ARREGLOS_3 {

    /**
     * @param args the command line arguments
     */
    
   
    
    public static void main(String[] args) {
         int matriz[][]  =new int [5][5];
            imprimirMatriz(matriz);
    }    
       public static void imprimirMatriz(int[][] arreglo) {
         int matriz[][]  =new int [5][5];
         int matrizCopia []= new int [matriz.length];
           for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
             {  matriz[i][j] = ((int)(Math.random()*100) +1);    
   
             }
        }
    } 
           for (int i = 0; i < matrizCopia.length; i++) {
               for (int j = 0; j <matrizCopia[i].length; j++) {
                   matrizCopia[i] = matriz[(matriz.length -1) -i];
               }
               
           }
           
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print("[" + matriz[i][j] + "]");
                }
                System.out.println("");      
    }
            System.out.println("");
}
    }
