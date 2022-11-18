/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_1_ordenamiento;

/**
 *
 * @author APVT
 */
public class EVA3_1_ORDENAMIENTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arregloDatos = new int[15];
        int[] arregloSel = new int[arregloDatos.length];
       int[] arregloIns = new int[arregloDatos.length];
        System.out.println("ARREGLO ORIGINAL");
        llenar(arregloDatos);
        imprimir(arregloDatos);
        System.out.println("SELECTION SORT");
        copiar(arregloDatos, arregloSel);
       imprimir(arregloSel);
        double ini = System.nanoTime();
        selectionSort(arregloSel);
        double fin = System.nanoTime();
       imprimir(arregloSel);
        System.out.println("Selection Sort = " + (fin - ini));  
        
          System.out.println("INSERTION SORT");
        copiar(arregloDatos, arregloIns);
       imprimir(arregloIns);
        ini = System.nanoTime();
        selectionSort(arregloIns);
        fin = System.nanoTime();
       imprimir(arregloIns);
        System.out.println("Selection Sort = " + (fin - ini));
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
     //SELECTION SORT O(n^2)
     //COMPARACIONES
     //INTERCAMBIOS (SWAP)
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
     
     public static void insertionSort(int[] arreglo){
         for (int i = 1; i < arreglo.length; i++) {
             int temp= arreglo[i];                            //es lo que vamos a ordenar
             int insP= i;
             //BUSCAMOS EN QUE PUNTO DEBE DE QUEDAR TEMP
             //ESA POSICION QUEDA ALMACENADA EN InsP
             for (int prev = i-1; prev >=0; prev--) {         // se va a comparar
                 if(arreglo[prev] > temp){
                     //SWAP
                 arreglo[insP] = arreglo[prev];
                 insP--;
                 } else{
                     break;
                 }
             } 
             arreglo[insP] = temp;
             
         }
     }
}
