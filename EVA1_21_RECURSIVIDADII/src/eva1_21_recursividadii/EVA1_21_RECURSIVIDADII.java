/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_21_recursividadii;

/**
 *
 * @author Ana Paulina Villegas
 */
public class EVA1_21_RECURSIVIDADII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("MAIN " + A());
    }
    public static String A(){
        return "A " + B();
    }
    public static String B(){
    return "B " + C();
}
    public static String C(){
    return "C";
    }
    
}