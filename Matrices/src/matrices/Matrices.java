/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

/**
 *
 * @author casa
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] m1={{1,2,3,4},{5,6,7,8}};
        int[][] m2 = new int[4][2];
        
        for (int i=0; i<m1.length;i++){
            for (int j=0; j<m1[0].length; j++){
                m2[j][i]=m1[i][j];
            }
        }
        for (int i=0; i<m1.length;i++){
            for (int j=0; j<m1[0].length; j++){
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }
        for (int i=0; i<m2.length;i++){
            for (int j=0; j<m2[0].length; j++){
                System.out.print(m2[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
}
