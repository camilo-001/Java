import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLTransactionRollbackException;

public class StringFormats2 {
    // metodo format
    public static void main(String[] args) {
        String mensaje = "lococolombia";

        mensaje = String.format("Bienvenido a %s", mensaje); /*Lo que hace format es crear un formato a partir de otro
        pero definiendo un formato previo. En este caso la primera parte entre las comillas es el formarto
        el %s será reemplazado por el string que reciviremos en este caso mensaje */

        System.out.println(mensaje);

        /* como vemos al imprimir aparece que ha tomado el formato previo y lo ha añadido al nuevo string. Format es
         * util cuando no sabemos que string reciviremos como en este caso es mensaje. Nosotros tambien podemos darle
         * formato a las variables  */

        float numero = 18.4525f;
        String nuevoMensaje = String.format("%.2f", numero); /*hemos definido un formato para nuestra variable numero
        %.2f hemos definido que solo al imprimir nos mustre dos decimales pero tambien podemos definir las que queramos*/

        System.out.println(nuevoMensaje); /* como vemos imprime el valor de nuestra variable numero con solo dos
        decimales*/

        /* si quisieramos utilizar diferentes variables en un mismo texto podriamos hacerlo de la siguiente manera*/

        String Texto = "El resultado es: ";
        int entero = 24;

        String NuevoTexto = String.format("%S %d", Texto, entero); /*Primero hemos definido nuestro formato en el cual
        hemos establecido que reciviremos un string %s y un numero entero %d y luego establecemos cuales de estos serán
        que son las variables Texto y entero */
        System.out.println(NuevoTexto);

        /*otro metodo para imprimir un string con formato es la siguiente pero se recomienda para cuando no requerimos
         * que ese resultado que retorna sea almacenado*/

        System.out.printf("%S %d", Texto, entero); /* usamos el System.out.printf que a diferencia del usado normalmente
        define un formato establecido si ejecutamos obtendremos el mismo resultado que con el ejemplo anterior*/

        int cantidad = 10;
        boolean mayor = cantidad > 5;

        String resultado = String.format("La cantidad es mayor a %d : %b",cantidad, mayor); /*Para booleanos usamos
        %b  */
        System.out.println(resultado);


    }

}
