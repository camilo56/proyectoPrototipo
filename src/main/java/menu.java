import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;





public class menu {

    Scanner teclado = new Scanner(System.in);




    public static String leerOpcion() {
        var scanner = new Scanner(System.in);
        System.out.println("Ingrese opcion:");
        return scanner.nextLine();
    } // captura opcion de programa ingresada por el usuario

    public static void mostarMenu() {
        System.out.println("**********************************************************");
        System.out.println("*    inicio del programa                                 *");
        System.out.println("*   [1] Registre una cuenta                              *");
        System.out.println("*   [2] Inicie sesion                                    *");
        System.out.println("*   [3] Salir                                            *");
        System.out.println("**********************************************************");
    } //imprime en pantalla las opciones del programa

    public static int leerNumero() {
        var scanner = new Scanner(System.in);
        System.out.println("Ingrese numero:");
        return scanner.nextInt();
    } //permite capturar el número ingresado por usuario

    public static boolean validarNumero(int numero) {
        return true;
    } // valida que el número entero ingresado esté en el rango permitido

    public static void menudatos(){ /*informacion necesaria para cobrar el cargo fijo de luz y agua*/
        System.out.println("**********************************************************");
        System.out.println("*    region de residencia                               *");
        System.out.println("*   [1] Región de Arica y Parinacota." );
                System.out.println  ("[1]  Región de Tarapacá" );
                System.out.println  ("[2]  Región de Antofagasta." );
                System.out.println  ("[3]  Región de Atacama." );
                System.out.println  ("[4]  Región de Coquimbo." );
                System.out.println  ("[5]  Región de Valparaíso." );
                System.out.println  ( "[6]  Región Metropolitana de Santiago." );
                System.out.println  ("[7]  Región del Libertador General Bernardo O’Higgins." );
                System.out.println  (" [8]  Región del Maule.\n [9]  Región del Ñuble.\n [10] Región del Biobío.\n [11] Región de La Araucanía.\n");
                System.out.println  ( "[12] Región de Los Ríos");
                System.out.println  ("[13] Región de Los Lagos." );
                System.out.println  ("[14] Región de Aysén del General Carlos Ibáñez del Campo." );
                System.out.println  ("[15] Región de Magallanes y la Antártica Chilena.");
        System.out.println("**********************************************************");




    }
}

















