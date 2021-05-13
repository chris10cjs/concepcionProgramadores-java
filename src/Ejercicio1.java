/*
    a) *Realizar las correcciones de sintaxis necesarias para que la clase Ejercicio1 no
contenga errores de compilación. (Nota: es posible que necesite cambiar tipos de
datos de las variables y nombres de las mismas, realice todas las correcciones
pertinentes).
       *Describa por cada uno de los errores, cuál es su causa y como
corregirlo.

    d) Por último modifique el programa para que muestre por la salida estándar (consola) un
mensaje con el siguiente formato:
Demo de Variables:
    nombreVariable1: valorVariable1
    nombreVariable2: valorVariable2

 */

/**
 *
 * @author chris
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Inicialización de variables
        //error: solo se asigna y no se inicializa la variable
        //solución: asignarle un valor
        int numero = 10;
        boolean compila = false;
        char cadena = 'c';
        long numeroLong = 12345678;
        //error: incompatibilidad de tipo de datos
        //posibles soluciones: casteo o cambio de tipo de dato
        int numeroInt = (int)numeroLong;
        double radio = 0.0;
        //error: un valor de float debe finalizar con 'f'
        //solucion: agregar 'f' al final del valor
        final float PI = 3.1415f;
        //error: short no admite el valor
        //solución: modificar el tipo de dato
        int numeroShort = 1234567;
        //error: el nombre de una variable no puede contener espacios ni el simbolo '&'
        //solucion: eliminar el simbolo y el espacio
        String mensaje = "Inicialización de variables";
// Bloque de código
        //error: variable local asignada dentro del bloque de código
        //solución: eliminar los {} para que tome el dato

        byte numeroByte = -128;
        
// Mostrar valores
        System.out.println("PI: " + PI);
        System.out.println("numberoByte: " + numeroByte);
        System.out.println("numero: " + numero);
        
        System.out.println("Tipo: boolean | nombre: compila | valor: " + compila);
        System.out.println("Tipo: char | nombre: cadena | valor: " + cadena);
        System.out.println("Tipo: long | nombre: numeroLong | valor: " + numeroLong);
        System.out.println("Tipo: int | nombre: numeroInt | valor: " + numeroInt);
        System.out.println("Tipo: double | nombre: radio | valor: " + radio);
        System.out.println("Tipo: int | nombre: numeroShort | valor: " + numeroShort);
        System.out.println("Tipo: String | nombre: mensaje | valor: " + mensaje);
    }
}
