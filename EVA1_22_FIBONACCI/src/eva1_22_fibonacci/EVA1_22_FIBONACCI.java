/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_22_fibonacci;

import java.util.Scanner;

/**
 *
 * @author Ana Paulina villegas
 */
public class EVA1_22_FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn= new Scanner (System.in);
        int poscn;
        System.out.println("Escriba la posicion: ");
        poscn= scn.nextInt();
        for (int i = 0; i < poscn; i++) {
            System.out.print(Fibonacci(i) + " , ");   
        }
        
    }
    
    public static int Fibonacci (int num){
        if(num==0){
            return 1;
        } else if (num==1){
            return 1;
        }else{
            return Fibonacci(num-1) +Fibonacci(num-2);
        }
    }
    
}
