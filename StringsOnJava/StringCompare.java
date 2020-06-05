import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLTransactionRollbackException;

public class StringCompare {

    public static void main(String[] args) {

        /* Tenemos dos cadenas las cuales pueden ser comparadas. Para realizar dicha tarea tenemos varias
        * formas de hacerlas*/

        String cadena1 = "hola";
        String cadena2 = "Hola";

        // Como vemos las cadenas son diferentes pero un metodo para comprara es el siguiente

        boolean resultado = cadena1.equals(cadena2); /* Hemos usado equals para la tarea de comprar el cual
        nos retornara un valor booleano verdadero o falso */

        System.out.println(resultado); /* veremos como resultado false ya que las cadenas no son iguales ya que
        una empieza con letrea mayuscula y la otra no. Una forma de resolver este caso es el siguiente*/

        String Nuevacadena1 = cadena1.toUpperCase();
        String Nuevacadena2 = cadena2.toUpperCase();

        /* Hemos estandarizado ambas cadenas, hemos establecido una conversion de las cadenas y al visualizar
         el resultado veremos que este ha cambiado */

        resultado = Nuevacadena1.equals(Nuevacadena2);

        /* tambien podremos escribir el anterior codigo de la siguiente manera

           boolean resultado = cadena1.toUpperCase().equals(cadena2.toUpperCase());
         */

        System.out.println(resultado);

        /* Esta fue una manera de comparar las cadenas por medio de estandarizar su contenido. Ahora veremos
        otra forma por la cual podemos hacerlo sin que nuestro codigo se convierta en un tanto complejo*/

        resultado = cadena1.equalsIgnoreCase(cadena2); /* de este modo usadnod el equalsIgnoreCase podremos
        ignorar si las cadenas estan en mayusculas o minisculas */

    }




    }
