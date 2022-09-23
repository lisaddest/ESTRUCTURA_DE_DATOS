/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_18_recursividad;

/**
 *
 * @author Ana Paulina Villegas
 */
public class EVA1_18_RECURSIVIDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        falsoForDes(5);
        System.out.println("");
        falsoForAse(5, 1);
    }
    
    //Falso for: imprime una lista de 2 nums de mayor a menor ( de manera recursiva)
    //recibo un valor falsoForDes(5) --> "5 - 4 - 3 - 2 -1"
    public static void falsoForDes(int valor){
        // que voy a hacer: imprimir valor
        //lamada recursiva: "falsoForDes(valor - 1)"
        //detener la llamada recursiva "cuando valor=1"
        if(valor>0){
            System.out.print(valor + " - ");
            valor--;
            falsoForDes(valor);
        }
        
    }
    
    public static void falsoForAse (int valor, int ini){
        if(ini<=valor){
            System.out.print(ini + " - ");
            ini++;
            falsoForAse(valor, ini);
        }
    } 
    
}
