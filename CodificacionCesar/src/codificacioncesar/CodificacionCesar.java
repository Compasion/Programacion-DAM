/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codificacioncesar;
import java.util.Scanner;
/**
 *
 * @author casa
 */
public class CodificacionCesar {

    public static String PedirMensaje(){
       String m;
       Scanner sc =new Scanner(System.in);
       System.out.println("Dame el menssaje");
       m=sc.nextLine();
       return m;
    } 
    public static int buscar(char a){
     char[] abc={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
     int p=-1;
     for (int i=0; i<abc.length;i++){
         if (abc[i] == a) p=i;
     }
     return p;
    }
    public static String codificarMensaje(String m){
     String aux="";
     int posicion;
     String[] abc={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
     for (int i=0; i<m.length();i++){
         posicion= buscar(m.charAt(i));
         posicion=((posicion+3)%27);
         aux= aux+ abc[posicion];
     }
     
     return aux;
    }
    public static String decodificarMensaje(String m){
     String aux="";
     int posicion;
     String[] abc={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
     for (int i=0; i<m.length();i++){
         posicion= buscar(m.charAt(i));
         posicion=((posicion-3)%27);
         if (posicion<0) posicion=posicion+27;
         aux= aux+ abc[posicion];
     }
     
     return aux;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String mensaje = PedirMensaje().toLowerCase();
        String codificado = codificarMensaje(mensaje);
        System.out.println("Mensaje:      " + mensaje);
        System.out.println("Codificado:   " + codificado);
        System.out.println("Decodificado: " + decodificarMensaje(codificado));
    }
    
}
