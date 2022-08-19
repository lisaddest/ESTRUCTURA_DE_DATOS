/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1._3_heap;

/**
 *
 * @author Ana Paulina Villegas
 */
public class EVA1_3_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=10;
        // obj y ob2 guardan referencias (direccion)
        //en java las direcciones de memoria se les llama referencias
        //eb otros lenguajes los llamamos apuntadores
        Prueba obj= new Prueba();
        Prueba obj2= new Prueba();
        System.out.println(x);
        System.out.println(obj.valor);
        System.out.println(obj2);
    }
    
}

class Prueba{
    public int valor = 100;
    
}