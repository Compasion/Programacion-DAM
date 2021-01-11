/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author casa
 */
public class Listas {
 //listas 
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> ejemploLista = new ArrayList<String>();
        ejemploLista.add("Juan");
        ejemploLista.add("PEPE");
        ejemploLista.add("Maria");
        ejemploLista.add("PEPE2");
        
        System.out.println(ejemploLista);
        
        
        
        System.out.println("Tamaño: " + ejemploLista.size());
        System.out.println("Elemento 0: " + ejemploLista.get(0));
        
        ejemploLista.remove(0);
        System.out.println("Elemento 0: " + ejemploLista.get(0));
        
        ejemploLista.remove("Juan");
        
        System.out.println(ejemploLista);
        
      
        for (int i = 0; i <= ejemploLista.size() - 1; i++) {
                   System.out.println(ejemploLista.get(i));
        }
        
        Iterator i = ejemploLista.iterator();
         while(i.hasNext())
        {
            System.out.println(i.next());
        }
         ejemploLista.isEmpty(); // true o false
         ejemploLista.contains("José"); //esta jose true o false
         ejemploLista.set(1, "Félix");
         ejemploLista.set(ejemploLista.size()-1, "Félix");
         System.out.println(ejemploLista);
         System.out.println(ejemploLista.subList(0, 2));
        ejemploLista.clear();
    } //fin main 
       
}//fin clase
