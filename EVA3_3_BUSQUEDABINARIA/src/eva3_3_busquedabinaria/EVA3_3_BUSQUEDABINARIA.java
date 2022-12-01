/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_3_busquedabinaria;

import java.util.Scanner;

/**
 *
 * @author APVT
 */
public class EVA3_3_BUSQUEDABINARIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        int[] arregloDatos = new int[15];
        int[] arregloSel = new int[arregloDatos.length];
    
       
        System.out.println("ARREGLO ORIGINAL");
        llenar(arregloDatos);
        imprimir(arregloDatos);
        System.out.println("SELECTION SORT");
        copiar(arregloDatos, arregloSel);
        selectionSort(arregloSel);
       imprimir(arregloSel);
        double ini = System.nanoTime();
        selectionSort(arregloSel);
        double fin = System.nanoTime();
       imprimir(arregloSel);
        System.out.println("Selection Sort = " + (fin - ini));  
      Scanner input = new Scanner(System.in);
        System.out.print("Introduce el valor a buscar: ");
        int buscar = input.nextInt();
        System.out.println("");
        System.out.println("");
        System.out.println("El valor esta en " + busquedaBinaria(arregloSel, buscar));
        
    }
    //LLENAR ARREGLO
    public static void llenar(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
            
        }   
    }
    //IMPRIMIR ARREGLO
     public static void imprimir(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
           if(arreglo[i] < 10)
            System.out.print("[" + arreglo[i]+ "]");
            else
           System.out.print("[" + arreglo[i]+ "]");  
        }
         System.out.println("");       
} //COPIAR ARREGLO  
     public static void copiar(int[] arreglo, int[] copia){
         for (int i = 0; i < arreglo.length; i++) {
             copia[i] = arreglo[i];
         }
     }
     
      public static void selectionSort(int[] arreglo){
         for (int i = 0; i < arreglo.length; i++) {
             int min= i;
             //BUSUCO EL ELEMENTO (POSICION) MAS PEQUEÑO
             for (int j = i+1; j < arreglo.length; j++) {
                 //Buscar el mas pequeño
             if(arreglo[min] > arreglo[j])
                 min = j;
             }
             // SWAP INTERCAMBIAR 
             if(min != i){
                 int temp = arreglo[i];
                 arreglo[i]= arreglo[min];
                 arreglo[min] = temp;
             }
         }
         
     }
      //BUSQUEDA BINARIA 
      public static int busquedaBinaria(int[] datos, int valor){
          return busquedaBinRec(datos,0,datos.length -1, valor);
      }
     
      private static int busquedaBinRec(int[] datos, int ini,int fin, int valor){
          int mitad= ini +((fin-ini)/2);
          int resu = -1;
          if(ini < fin){ //aqui hacemos la busqueda binaria recursiva
              if(valor== datos[mitad]){ //lo encontramos
                  resu= mitad; // posicion donde esta el elemento q buscamos
              } else if(valor < datos[mitad]) {//menor que la mitad, esta a la izq
             resu=   busquedaBinRec(datos,ini,mitad -1, valor);
              }  else                          //mayor que la mitad, esta a la der
             resu=  busquedaBinRec(datos,mitad +1, fin, valor);
          }
          return resu;
            
      }
      
}
