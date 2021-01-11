/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

/**
 *
 * @author casa
 */


public class Matriz {

    public static void matrizletras(){
        final int FILAS=3;
        final int COLUMNAS=5;
        char[][] letras =new char[FILAS][COLUMNAS];
        char letraQueToca='A';
        for (int f=0; f<FILAS; f++){
            for (int c=0; c<COLUMNAS; c++){
                letras[f][c]=letraQueToca;
                letraQueToca++;
            }
        }
        //escribimos las letras
        for (int f=0; f<FILAS; f++){
            for (int c=0; c<COLUMNAS; c++){
                System.out.print(letras[f][c]+" ");
            }
            System.out.println();
        }
    }
    
    public static void matrizasterisco(){
        final int TAM=5;
        char[][] triangulo=new char[TAM][TAM];
        for(int f=0;f<TAM;f++){
            for(int c=0; c<f; c++) triangulo[f][c]=' ';
            for (int c=f; c<TAM; c++) triangulo[f][c]='*';
            
        }
        for (int f=0; f<TAM; f++){
            for (int c=0; c<TAM; c++){
                System.out.print(triangulo[f][c]+" ");
            }
            System.out.println();
        }
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] m1;
        m1= new int[2][2];
        for (int i=0; i<m1.length;i++){
            for (int j=0; j<m1.length;j++)
                m1[i][j]=i;
        }
         for (int i=0; i<m1.length;i++){
            for (int j=0; j<m1.length;j++)
               System.out.println("m["+i+"]["+j+"]=" + m1[i][j]);
        }
        matrizletras();
        matrizasterisco();
    }
    
}
