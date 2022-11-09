package eva2_6_arbol_binario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APVT
 */
public class ArbolBinario {
    private Nodo root;

    public ArbolBinario() {
        this.root = null;
    }
    // metodo publico para el usuario
    public void agregar(int valor){
           // Que el nodo recibido es null
          //Arbol vacio
        if (root==null)
            root = new Nodo(valor);
        else
        agregarRecur(valor, root);
    }
    
    //Metodo recursivo agregar
    private void agregarRecur(int valor, Nodo nodoActual){
        /*
        verificar si el lado (nodo) es null
        si es null, ahi va el valor
        si no 
        repetir recursion
        */
        Nodo nuevo = new Nodo(valor);
        
        
        if (valor < nodoActual.getValor()){//Va a la izq
            if (nodoActual.getIzquierda()==null)   // null = vacio
            nodoActual.setIzquierda(nuevo);
            else
                agregarRecur(valor, nodoActual.getIzquierda());
            
        }else if (valor > nodoActual.getValor()){ //Va a la der
         if (nodoActual.getDerecha()==null)
            nodoActual.setDerecha(nuevo);
            else
                agregarRecur(valor, nodoActual.getDerecha());
        }else{
            System.out.println("");
        }
        
    }
    //impresion de valores 
    //in order 
    
    public void inOrder(){
        inOrderRecu(root);
        System.out.println("");
    }
    private void inOrderRecu(Nodo nodo){
        if(nodo != null){
            
            inOrderRecu(nodo.getIzquierda());
            System.out.print(nodo.getValor() + "-");
            inOrderRecu(nodo.getDerecha());
            
        }
        
    }
    
     public void posOrder(){
        posOrderRecu(root);
        System.out.println("");
    }
    private void posOrderRecu(Nodo nodo){
        if(nodo != null){
            
            posOrderRecu(nodo.getIzquierda());
            posOrderRecu(nodo.getDerecha());
            System.out.print(nodo.getValor() + "-");
            
            
        }
        
    }
    
      public void preOrder(){
        preOrderRecu(root);
        System.out.println("");
    }
    private void preOrderRecu(Nodo nodo){
        if(nodo != null){
            
            System.out.print(nodo.getValor() + "-");
            preOrderRecu(nodo.getIzquierda());
            preOrderRecu(nodo.getDerecha());
          
            
            
        }
        
    }
    
     
}
