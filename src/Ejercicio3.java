import java.util.Scanner;
/**
 * @author Christian Silvero
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de Variables:
        String persona1;
        String persona2;
        String persona3;
        int edadPersona1;
        int edadPersona2;
        int edadPersona3;
        float sumaEdades;
        float promedio;
        int maxEdad;
        String personaMaxEdad;
        int sumaRestoEdades;
        
        //Entrada de datos:
        //1) Permita ingresar de uno en uno 3 nombres de persona y una edad.
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique nombre y edad de la persona 1: ");
        persona1 = sc.nextLine();
        edadPersona1 = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Indique nombre y edad de la persona 2: ");
        persona2 = sc.nextLine();
        edadPersona2 = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Indique nombre y edad de la persona 2: ");
        persona3 = sc.nextLine();
        edadPersona3 = sc.nextInt();
        sc.nextLine();
        
        
        //Salida de datos:
        //2) Imprima por consola los valores de cada nombre y su edad correspondiente.
        System.out.println("\nPersona 1: "+ persona1 + " | Edad: " + edadPersona1);
        System.out.println("Persona 2: "+ persona2 + " | Edad: " + edadPersona2);
        System.out.println("Persona 3: "+ persona3 + " | Edad: " + edadPersona3);
        
        //3) Calcule el promedio de las 3 edades ingresadas y preséntelo por consola.
        sumaEdades = edadPersona1 + edadPersona2 + edadPersona3;
        promedio =  sumaEdades / 3;
        System.out.println("\nEl promedio de edades es: " + promedio);
        
        //4) Calcule utilizando “if” la edad mayor y preséntelo por consola.
        if(edadPersona1 > edadPersona2 && edadPersona1 > edadPersona3)
        {
            maxEdad = edadPersona1;
            personaMaxEdad = persona1;
        }
        else if(edadPersona2 > edadPersona3)
        {
            maxEdad = edadPersona2;
            personaMaxEdad = persona2;
        }
        else
        {
            maxEdad = edadPersona3;
            personaMaxEdad = persona3;
        }
        System.out.println("\nLa mayor edad es: " + maxEdad + " de " + personaMaxEdad);
        
        //5) Calcule si la edad mayor calculada es mayor a la suma del resto de las edades.
        sumaRestoEdades = (int)(sumaEdades - maxEdad);
        System.out.println("\n¿La edad mayor es mas grande que la suma del resto de las edades?");
        if(maxEdad > sumaRestoEdades)
        {
            System.out.println("¡SI! " + maxEdad + ">" + sumaRestoEdades);
        }
        else
        {
            System.out.println("¡NO! " + maxEdad + "<" + sumaRestoEdades);
        }
    }
}
