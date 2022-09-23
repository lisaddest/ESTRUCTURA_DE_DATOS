/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_19_gcd;

/**
 *
 * @author Ana Paulina Villegas
 */
public class EVA1_19_GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(gcd(181, 7));
    }
    
    
    public static int gcd(int dividiendo, int divisor){
        int residuo;
        residuo= dividiendo%divisor;
        
        if (residuo == 0){  //me detengo, encontre el mcd
        return divisor;
        
    } else{
            return gcd(divisor, residuo);
            
            }
    }
}
