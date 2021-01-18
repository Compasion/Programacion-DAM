/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino2;

/**
 *
 * @author casa
 */
public class ficha {
    int v1;
    int v2;
    ficha (int x, int y){
        v1=x;
        v2=y;
    }

    public int getV1() {
        return v1;
    }

    public int getV2() {
        return v2;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public void setV2(int v2) {
        this.v2 = v2;
    }
    
}
