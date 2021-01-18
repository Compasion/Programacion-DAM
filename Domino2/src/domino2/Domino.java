/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino2;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author casa
 */
public class Domino {
    List<ficha> fichas = new ArrayList<>();
    List<Integer> solucion = new ArrayList<>();
    
    public void crearfichas(){
        for(int i=0; i<=6; i++){
            for (int j=i; j<=6; j++){
                ficha f = new ficha(i,j);
                fichas.add(f);
            }
        }
    }
    public  void insertarSolucion(int x,int i){
       solucion.add(x);
       solucion.add(i);
    }
    public void quitarSolucion(){
        solucion.remove(solucion.size()-1);
        solucion.remove(solucion.size()-1);
    }
    public boolean HaySolucion(int valor){
        boolean haysolucion=true;
        for (int i = 0; i <= fichas.size() - 1; i++) {
            if (fichas.get(i).getV1()== valor || fichas.get(i).getV2() == valor){
                haysolucion = false;
                break;
            }
        }
        return haysolucion;
    }
    public boolean validaFicha(int y, int x){
        boolean hay = false;
        for (int i = 0; i <= fichas.size() - 1; i++) {
            if (((fichas.get(i).getV1()== y && fichas.get(i).getV2() == x)) || 
                    ((fichas.get(i).getV1()== x && fichas.get(i).getV2() == y))){
                hay=true;
                break;
            }
        }
        return hay;
    }
    public void quitarFicha(int y, int x){
        for (int i = 0; i <= fichas.size() - 1; i++) {
            if (((fichas.get(i).getV1()== y && fichas.get(i).getV2() == x)) || 
                    ((fichas.get(i).getV1()== x && fichas.get(i).getV2() == y))){
                fichas.remove(i);
                break;
            }
        }
    }
    public void aniadirFicha(int y, int x){
                ficha f = new ficha(y,x);
                fichas.add(f);
    }
    public void imprimir(){
        System.out.println("Solucion___________" + (solucion.size()/2));
        
        int j=0;
        for(int i=0; i<solucion.size(); i++){
            System.out.print(solucion.get(i));
            j++;
            if (j==2) {
                j=0;
                System.out.print("-");
            }
        }
        System.out.println("");
    }
     public void recursivo(int x){
        if ((fichas.isEmpty()) || (HaySolucion(x))){
                //System.out.print("Trabajo con" + x);
                //if (solucion.size()== 28){
                    imprimir();
               // }
        }
        else{
            for(int i=0; i<7; i++){
                if (validaFicha(x,i)){
                    insertarSolucion(x,i);
                    quitarFicha(x,i);
                    recursivo(i);
                    aniadirFicha(x,i);
                    quitarSolucion();
                    
                }
            }
        }
     
     }
    
    public void lanzar(){
        crearfichas();
        //ficha f = new ficha(0,0);
        insertarSolucion(1,4);
        quitarFicha(1,4);
        recursivo(4);
    }
}
