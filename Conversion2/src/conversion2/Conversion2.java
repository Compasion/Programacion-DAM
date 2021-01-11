/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversion2;

/**
 *
 * @author casa
 */
public class Conversion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Conversión automática de tipos o ampliación_______________________________________
        //Por ejemplo, en Java, los tipos de datos numéricos son compatibles entre sí,
        //pero no se admite la conversión automática de tipo numérico a char o boolean.
        //Además, char y boolean no son compatibles entre sí.
         int i = 100; 
         
        //conversion automatica de tipo
        long l = i; 
         
        //conversion automatica de tipo
        float f = l; 
        System.out.println("Valor Int "+i);
        System.out.println("Valor Long "+l);
        System.out.println("Valor Float "+f);
        
        
        //Conversión explícita de tipo o casting_______________________________________________
        //Si queremos asignar un valor de tipo de dato más grande a un tipo de dato más pequeño,
        //realizamos un casteo/casting o lo que se conoce como conversión de tipo explícito.

        //Esto es útil para tipos de datos incompatibles donde la conversión automática no se 
        //puede realizar.
        double d = 100.04; 
         
        //casting de tipo
        long l1 = (long)d;
         
        //casting de tipo
        int i1 = (int)l; 
        System.out.println("Valor Double "+d);
         
        //parte fraccionaria perdida
        System.out.println("Valor Long "+l); 
         
        //parte fraccionaria perdida
        System.out.println("Valor Int "+i); 
        
        byte b; 
        int i4 = 257; 
        double d4 = 323.142;
        System.out.println("Conversion de int a byte."); 
         
        //i%256
        b = (byte) i; 
        System.out.println("i = " + i + " b = " + b);
        System.out.println("\nConversion de double a byte.");
         
        //d%256
        b = (byte) d; 

        System.out.println("d = " + d + " b= " + b);
        
        //Tipo de promoción en Expresiones__________________________________________________________________
        //Java automáticamente promueve cada operando byte o short a int. 
        //Al evaluar expresiones, el valor intermedio puede exceder el rango de operandos 
        //y, por lo tanto, se promoverá el valor de la expresión.
        //Algunas condiciones para la promoción de tipo son:
        //Java automáticamente promueve cada operando byte, short, o char al evaluar una expresión.
        //Si un operando es long, float o double, la expresión se promueve a long, float o double, respectivamente.
        
        byte a0 = 40;
        byte b0 = 50;
        byte c0 = 100;
        int d0 = a0 * b0 / c0;
        
        byte b9 = 42; 
        char c9 = 'a'; 
        short s9 = 1024;
        int i9 = 50000;
        float f9 = 5.67f;
        double d9 = .1234;
         
        // La expresion
        double result = (f9 * b9) + (i9 / c9) - (d9 * s9);
         
        //Resultado después de todas las 'promociones'
        System.out.println("resultado = " + result);
        
        
        //Casting de Tipo explícito en Expresiones________________________________________________
        //Al evaluar expresiones, el resultado se actualiza automáticamente a un tipo de datos 
        //más grande del operando. Pero si almacenamos ese resultado en un tipo de datos más 
        //pequeño, genera un error de tiempo de compilación, por lo que debemos “castear” el resultado.
         byte b6 = 50; 
         
        //casting de tipo int a byte
        //mostraría error si no detallamos (byte)
        b6 = (byte)(b6 * 2); 
        System.out.println(b6);
        
        
    }
    
}
