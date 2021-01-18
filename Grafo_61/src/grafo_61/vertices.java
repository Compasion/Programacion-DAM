/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo_61;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author casa
 */
public class vertices {
    List<vertices> adyacentes = new ArrayList<>();
    int nombre;
    boolean visitado;
    int padre;

    public void setNombre(int nombre) {
        this.nombre = nombre;
        this.padre=-1;
        this.visitado=false;
    }

    public void setAdyacentes(List<vertices> adyacentes) {
        this.adyacentes = adyacentes;
    }

    public void setPadre(int padre) {
        this.padre = padre;
    }

    public int getPadre() {
        return padre;
    }

    public List<vertices> getAdyacentes() {
        return adyacentes;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public int getNombre() {
        return nombre;
    }

    public boolean isVisitado() {
        return visitado;
    }
    
    public vertices(int n){
        this.nombre = n;
    }
    
    public void aniadiadyacente(vertices v){
        adyacentes.add(v);
    }
    public void quitaradyacente(vertices v){
        adyacentes.remove(v);
    }
}
