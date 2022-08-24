/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_arreglos;

/**
 *
 * @author Ana Paulina Villegas
 */
public class EVA1_4_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    
    //TDA tipos abstractos de dato (objetos y clases)
    //arreglos en java --> objetos --> tda
    
    // funciones e identificadores --> empiezan x minuscula
    //funciones --> indican una accion --> verbos
    //clases --> empiezan en mayuscula
   
    public static void main(String[] args) {
        // TODO code application logic here
        // tipo de dato [] identificador = new tipo de dato [tamaño]
        //ARREGLOS DE ENTEROS PARA CAPTURAR EDADES:
        int[] arregloEdades, arregloSalario, arregloCali;         //corchetes antes del identificador los convierten a todos arreglos
        double arregloPromedio[], porcentaje;                     // solo arregloPromedio es arreglo
        //LOS ARREGLOS SON OBJETOS
        arregloEdades = new int [50];                     // [INTEGER] DA UN MAXIMO O MINIMO VALOR QUE PUEDE DECLARAR UN ENTERO
       
        System.out.println(arregloEdades);
        for (int i = 0; i < arregloEdades.length; i++) {
            arregloEdades[i] = (int) (Math.random() * 100);               //random no genera valores enteros
            
        }
        for (int i = 0; i < arregloEdades.length; i++) {
            System.out.println("[" + i + "] =" + arregloEdades[i]);
            
        }
    }
           
    
    
}
