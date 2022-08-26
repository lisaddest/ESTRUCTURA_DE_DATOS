/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_arreglos_multidim;

/**
 *
 * @author Ana Paulina Villegas
 */
public class EVA1_9_ARREGLOS_MULTIDIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrizDatos = new int[3][5];
        System.out.println("FILAS: "+ matrizDatos.length);
        for (int i = 0; i < matrizDatos.length; i++) {  //primer dimension son 3 filas
            System.out.println("COLUMNAS: "+ matrizDatos[i].length);
            for (int j = 0; j < matrizDatos[i].length; j++) { //segunda dimesion son 5 columnas
                matrizDatos[i][j] = 100;
                
            }
            
        }
        System.out.println("");
         for (int i = 0; i < matrizDatos.length; i++) {  //primer dimension son 3 filas
             
            for (int j = 0; j < matrizDatos[i].length; j++) { //segunda dimesion son 5 columnas
                System.out.print("[" + matrizDatos[i][j] + "]");
           }
             System.out.println("");
}
    }
}

