/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo_61_vectores;

/**
 *
 * @author casa
 */
public class ejercicio {
    final int NUMERO = 16;
    int[] padre= new int[NUMERO];
    boolean[] marca= new boolean[NUMERO];
    int[][] grafo= {
        {0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
        {1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0},
        {0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0},
        {0,1,0,0,1,0,0,0,1,1,0,0,0,0,0,0},
        {0,0,1,0,0,0,0,1,0,0,1,0,0,0,0,0},
        {0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0},
        {0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1},
        {0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0},
        {0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0},
        {0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0},
    };
    boolean hay_anillo;
    public void lanzar(){
        hay_anillo= false;
        for (int i=0; i < NUMERO; i++){
            marca[i]= false;
            padre[i]=-1;
        }
        for (int i=0; i< NUMERO; i++){
            if (!hay_anillo){
                System.out.println("Anillo!!");
                break;
            }else{
                if (marca[i]== false){
                   marcar_prof(i); 
                }
            }
        }
    
    }
    public void marcar_prof(int v){
        marca[v]=true;
        for(int i=0;i< NUMERO; i++){
            if (grafo[v][i]!= 0){ //son adyacentes
                if (grafo[i][v] != 0){ //son adyacente dobres o reciprocos
                    if (marca[i]==false){
                        padre[i]=v;
                        marcar_prof(i);
                    }
                    else{
                        if (padre[v]!= i){
                            System.out.print("Anillo");
                            hay_anillo=true;
                            break;
                        }
                    }
                }
            }
        }
    
    }
}
