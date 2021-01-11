/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector;

/**
 *
 * @author casa
 */
public class Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Declaracion de arrays
        int v1[];
        int[] v2;
        //creacion de arrays
        
        int[] v3=new int[3];
        v1=new int[2];
        v2=new int[3];
        
        v1[1]=7;
        v2[0]=6;
        v3[1]=v1[1];
        v2[0]=v3[1];
        for (int i=0;i<v2.length;i++){
            v2[i]=i;
        }
        for (int i=0;i<v2.length; i++){
            System.out.println("v["+i+"]="+v2[i]);
        }
    }
    
}
