

public class StringFormats {

    public static void main(String[] args) {
        //

        String mensaje = "  Hola a todos  ";
        System.out.println(mensaje);

        String Mayus = mensaje.toUpperCase(); /* toUpperCase es un metodo de formato que nos permite
        estandarizar el string en letras mayusculas */
        System.out.println(Mayus);

        System.out.println(mensaje.toUpperCase()); /* Nostros veniamos almacenando los resultados en una variable
        nueva pero solo si queremos visualizar el resultado usando el metodo del formato podemos usar esta forma */

        System.out.println(mensaje.toLowerCase()); /* nos permite estandarizar el string con todas sus letras minusculas*/

        System.out.println(mensaje.trim());/*trim elimina los espacios que se encuentran al inicio y al final del string*/

        System.out.printf(mensaje.toUpperCase().trim());/* tambien podemos realizar concatenaciones de formatos en
        este caso hemos realizado la concatenacion de toUpperCase y trim*/


    }

}
