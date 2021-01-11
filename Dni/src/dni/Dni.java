/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dni;

import java.util.Scanner;

/**
 *
 * @author casa
 */
public class Dni {
    
    public static boolean esNumero(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException Excepcion) {
            resultado = false;
        }

        return resultado;
    }

    public static boolean comprobar(String n){
        boolean error=false;
        if (n.length()!=9){
            error=true;
        }
        else{
            String numero= n.substring(0,8);
            String letra= (n.substring(8,9)).toUpperCase();
            //int i=letra.indexOf("abcdefghijklmnopqrstuvwxyz", 0);
            int j="TRWAGMYFPDXBNJZSQVHLCKE".indexOf(letra, 0);
            if (-1==j){
                error=true;
            }
            else if (!(esNumero(numero))){
                error=true;
            }
            
        }
        return error;
    }
    public static String Pedirnumero(){
        String n;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Dame el dni con 8 cifras y la letra");
            n=sc.nextLine();
        }while (comprobar(n));
        return n;
    
    }
    public static char Sacarletra(String dni){
        //char l=(dni.substring(8, 9)).charAt(0);
        int numero= Integer.parseInt(dni.substring(0,8));
        char[] cifrado={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int entero=numero%23;
        
        return cifrado[entero];
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String dni;
        dni=Pedirnumero().toUpperCase();
        char letra = Sacarletra(dni);
        if (-1==(int)dni.indexOf(letra)){
            System.out.println("Letra Erronea, su letra es: "+letra);
        }else{
            System.out.println("La letra es correcta");
        }
    }
    
}
