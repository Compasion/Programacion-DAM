/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversion;

/**
 *
 * @author casa
 */
public class Conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Conversión de tipo Implícita________________________________________
        byte x = 5;
        int y = x;
        
        //Conversión de tipo Explícita________________________________________
        byte a = 20;
        int s = (int) a;
        
        
        //String a Integer________________________________________
        String cadena="2";
        Integer entero = Integer.valueOf(cadena);
        
        int entero1 = Integer.parseInt(cadena);
        
        //Integer a String________________________________________
        String cadena2 = Integer.toString(entero);
        
        String cadena3 = String.valueOf(entero);
        
        //char a String________________________________________
        char codigo = 'A';
        String cadena7 = Character.toString(codigo);
        
        //String a char________________________________________
        String codigo8= "E";
        char caracter9 = cadena.charAt(0);
        
        
        //String a Double________________________________________

        //double doble = Double.parseDouble(cadena);
        double doble = Double.parseDouble("900.1");

        //Double a String________________________________________
        //String cadena = String.valueOf(doble);
        double totalDoble = 900.5;
        String totalString = String.valueOf(doble);

        //String a Float________________________________________
        //float flotante = Float.parseFloat(cadena);
        float importe = Float.parseFloat("900.5");

        //Float a String________________________________________
        //String cadena = Float.toString(flotante);
        String total = Float.toString(900.1f);

        //String a Boolean________________________________________
        //Boolean boolean = Boolean.valueOf(cadena);
        //boolean boolean = Boolean.parseBoolean(cadena);
        Boolean boolean1 = Boolean.valueOf("true");
        boolean boolean2 = Boolean.parseBoolean("false");

        //Boolean a String________________________________________
        //String cadena = String.valueOf(b);
        //String cadena = Boolean.toString(b);
        //boolean b = true;
        //String cadena = String.valueOf(b);

        boolean b = false;

        String cadena33 = Boolean.toString(b);
        
    }
    
}
