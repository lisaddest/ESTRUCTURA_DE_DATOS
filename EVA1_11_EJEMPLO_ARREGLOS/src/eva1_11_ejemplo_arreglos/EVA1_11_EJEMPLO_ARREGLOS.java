/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1.pkg11.ejemplos.arreglos;

import java.util.Scanner;

/**
 *
 * @author Ana Paulina Villegas
 */
public class EVA1_11_EJEMPLOS_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               /*Pedir no. de grupo
            pedir no. de estudiantes por grupo
            capturar calificaciones
        imprimir calificaciones
        */
        
        int arregloCali[][];
        //primer dimension --> grupos
        //segunda dimension --> estudiantes x grupo
        //Determinar los grupos
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero de grupos: ");
        int iGpos = input.nextInt();
        arregloCali = new int[iGpos][];
        
        
        //para cada gpo: cuantos estudiantes necesitas?
        for (int i = 0; i < arregloCali.length; i++) {
            System.out.println("Cuantos estudiantes hay en el grupo " + (i+1));
            int iEstu = input.nextInt();
           arregloCali[i] =new int[iEstu]; 
            for (int j = 0; j < arregloCali[i].length; j++) {
                arregloCali[i][j]= input.nextInt();
            }
 
        }
         for (int i = 0; i < arregloCali.length; i++) {
             for (int j = 0; j < arregloCali[i].length; j++) {
                 
             }
        }
        
        
       
       
       }
    
        
    }
    
