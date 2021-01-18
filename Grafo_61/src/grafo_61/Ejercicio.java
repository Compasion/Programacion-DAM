/*
 * Ejercicio 61

Dado un grafo dirigido, llamamos anillo a una serie de tres o más nodos conectados en
forma de ciclo en los dos sentidos. Por ejemplo, en el grafo dirigido de la introducido en introducir grafo
 se ha destacado el único anillo que contiene. Inspirándote en el método del recorrido
en profundidad, diseña y analiza un algoritmo eficiente que indique si un grafo
dirigido contiene o no al menos un anillo. 
 */
package grafo_61;

import java.util.ArrayList;
import java.util.List;

/**
 /* Hay_Anillo:=Falso; - - aún no se ha encontrado ningún anillo
        para cada v ∈ VÉRTICES(G) hacer
        Marca(v):= Falso; Padre(v):= “*”
        fin para;
        para cada v ∈ VÉRTICES(G) hacer
        si Hay_Anillo
        entonces Salir;
        sino si Marca(v)= Falso; entonces MARCAR_PROF(v);
        fin si;
        fin para;
*/

public class Ejercicio {
   
    boolean hay_anillo=false;
    List<vertices> grafo = new ArrayList<>();
    
    public void creargrado(){
        //introducimos el grafo de ejemplo
        vertices v0 =new vertices(0);
        vertices v1 =new vertices(1);
        vertices v2 =new vertices(2);
        vertices v3 =new vertices(3);
        vertices v4 =new vertices(4);
        vertices v5 =new vertices(5);
        vertices v6 =new vertices(6);
        vertices v7 =new vertices(7);
        vertices v8 =new vertices(8);
        vertices v9 =new vertices(9);
        vertices v10 =new vertices(10);
        vertices v11 =new vertices(11);
        vertices v12 =new vertices(12);
        vertices v13 =new vertices(13);
        vertices v14 =new vertices(14);
        vertices v15 =new vertices(15);
        
        v0.aniadiadyacente(v1);
        v0.aniadiadyacente(v4);
        
        v1.aniadiadyacente(v0);
        v1.aniadiadyacente(v2);
        
        v2.aniadiadyacente(v1);
        v2.aniadiadyacente(v6);
        v2.aniadiadyacente(v5);
        
        v3.aniadiadyacente(v2);
        
        v4.aniadiadyacente(v1);
        v4.aniadiadyacente(v5);
        
        v5.aniadiadyacente(v2);
        v5.aniadiadyacente(v4);
        v5.aniadiadyacente(v8);
        v5.aniadiadyacente(v9);
        
        v6.aniadiadyacente(v2);
        v6.aniadiadyacente(v7);
        v6.aniadiadyacente(v10);
        
        v7.aniadiadyacente(v3);
        v7.aniadiadyacente(v6);
        v7.aniadiadyacente(v11);
        
        v9.aniadiadyacente(v5);
        v9.aniadiadyacente(v10);
        
        v10.aniadiadyacente(v6);
        v10.aniadiadyacente(v9);
        
        v11.aniadiadyacente(v7);
        v11.aniadiadyacente(v15);
        
        v12.aniadiadyacente(v8);
        v12.aniadiadyacente(v13);
        
        v13.aniadiadyacente(v10);
        v13.aniadiadyacente(v11);
        
        v14.aniadiadyacente(v13);
        
        v15.aniadiadyacente(v10);
        v15.aniadiadyacente(v11);
        grafo.add(v0);
        grafo.add(v1);
        grafo.add(v2);
        grafo.add(v3);
        grafo.add(v4);
        grafo.add(v5);
        grafo.add(v6);
        grafo.add(v7);
        grafo.add(v8);
        grafo.add(v9);
        grafo.add(v10);
        grafo.add(v11);
        grafo.add(v12);
        grafo.add(v13);
        grafo.add(v14);
        grafo.add(v15);
        
        
          
    }
    
    public void lanzar(){
       /* for (int i=0;i < grafo.size();i++){
            grafo.get(i).visitado = false;
        }*/
        for (int i=0;i < grafo.size();i++){
            if (hay_anillo){
                System.out.println("ANILLO!!!");
                break;
            }else{
                if (!(grafo.get(i).isVisitado())){
                    marcar_prof(i);
                }
            }
        }
    }
    
    public void marcar_prof(int x){
        grafo.get(x).setVisitado(true);
        List<vertices> adyacente = new ArrayList<>();
        adyacente = grafo.get(x).getAdyacentes();
        for (int i=0; i< adyacente.size(); i++){
            if (adyacente.get(i).isVisitado()){
                if (grafo.get(x).getPadre() != adyacente.get(i).getNombre()){
                   System.out.println("Anillo");
                   hay_anillo = true;
                   break;
                }
            }else{
                grafo.get(x).adyacentes.get(i).setPadre(grafo.get(x).getNombre());
            }
        }
    }
    
}
