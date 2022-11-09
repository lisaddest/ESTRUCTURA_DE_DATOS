/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_lista_doble;

/**
 *
 * @author moviles
 */
public class ListaDoble {
    private Nodo inicio;
    private Nodo fin;
    private int cont;
    
    
    public ListaDoble(){
         this.inicio = null;
        this.fin = null;
        this.cont=0;
}
     public boolean estaVacia(){ 
        if(inicio == null)
            return true;
        else 
        return false;
    }
    
    
   public void imprimir(){ 
       if(estaVacia())
           System.out.println("LISTA VACIA");
       else{
       Nodo temp = inicio;
       while(temp != null){
          System.out.print(temp.getValor() + " - ");
                temp = temp.getSiguiente();
 
            }
       }
       System.out.println("");
   }
   
    public int tamaLista(){ 
        
        return this.cont; 
    }
    
    
     public void vaciarLista(){ 
        inicio=null;
        fin=null;
        cont=0;
    }
     
     public void agregar(int valor){ 
        Nodo nuevoNodo = new Nodo(valor);
        
        
       // verificar si hay nodos en la lista
        if(inicio == null){//no hay nodos en la lista
            inicio = nuevoNodo;
            fin = nuevoNodo;
        }else{//hay nodos en la lista
            // hay que movernos por la lista
            // usando un nodo temporal hasta
            // el ultimo nodo de la lista
            fin.setSiguiente(nuevoNodo);
            nuevoNodo.setPrevio(fin);
            fin = nuevoNodo;
            
        }
        cont++;
        
    }
     
     public void insertarEn(int valor, int pos) throws Exception{  
        
        int cantNodos = tamaLista();
        //que debemos valorar
        //insertar una posicion no valida
        //posiciones negativas 
        //posiciones mayores a la cantidad de elementos
        
        if ( pos < 0)// posiciones negativas
            throw new Exception("No puede insertarse un nodo en una posicion negativa");
        else if (pos >= cantNodos )//posiciones mayores a la cantidad  de elementos
        throw new Exception(pos + " No es una posicion valida en la lista");
        else{
            Nodo nuevoNodo = new Nodo(valor);
            if(pos == 0){//insertar al inicio de la lista
                nuevoNodo.setSiguiente(inicio);
                inicio.setPrevio(nuevoNodo);
                inicio = nuevoNodo;
            }else{// insertar un nodo en una posicion
                Nodo temp = inicio;
                int cont = 0;
                while(cont < (pos)){
                
                temp = temp.getSiguiente();
                 cont++;
                
            }
                nuevoNodo.setSiguiente(temp);
                nuevoNodo.setPrevio(temp.getPrevio());
                temp.getPrevio().setSiguiente(nuevoNodo);
                temp.setPrevio(nuevoNodo);
                
            }
            this.cont++;
        }
        
    }
     
        public void borrarEn(int pos ) throws Exception{
        int cantNodos = tamaLista();
     if ( pos < 0)
        throw new Exception("No puede insertarse un nodo en una posicion negativa");
        else if (pos >= cantNodos )
        throw new Exception(pos + " No es una posicion valida en la lista");
        else{   
        
       if (cantNodos == 1 )     {
           vaciarLista();
       }else{
           //Borrar el primer nodo
           //borrar nodo intermedio
           //borrar el ultimo nodo
           if (pos == 0) {
               inicio=inicio.getSiguiente();
           }else{
             Nodo temp = inicio;
                int cont = 0;
                while(cont < (pos)){
                temp = temp.getSiguiente();
                 cont++;
                
            }  
                Nodo objPrev = temp.getPrevio();
                Nodo objSig = temp.getSiguiente();
                objPrev.setSiguiente(objSig);
                
                
                if (pos==(cantNodos -1)){
                    fin = objPrev;
                }else{
                    objSig.setPrevio(objPrev);
                }
           }
           this.cont--;
       }
              
            
        }
        
}
     
        public int obtenValorEn(int pos) throws Exception{  
                int cantNodos = tamaLista();
                int Valor = 0;
         if ( pos < 0)
            throw new Exception("No puede insertarse un nodo en una posicion negativa");
        else if (pos >= cantNodos )
        throw new Exception(pos + " No es una posicion valida en la lista");
        else{
             Nodo temp = inicio;
                int cont = 0;
                while(cont < (pos)){
                temp = temp.getSiguiente();
                 cont++;
                
            } 
                Valor = temp.getValor();
                
        }
         return Valor;
    }
    
}
