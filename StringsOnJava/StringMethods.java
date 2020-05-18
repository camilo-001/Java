

public class StringMethods {

    public static void main(String[] args) {
        //String no es un tipo de dato primitivo es una CLASE

        String mensaje = "Hola a todos"; // esta es la forma de declarar un string
        System.out.println(mensaje);

        int cantidad = mensaje.length(); /*Uno de los metodos de un string es lenght el cual nos permite contar
        los cartaceter en un string. Tambien cuenta los espacion*/
        System.out.println(cantidad);

        boolean SubString = mensaje.contains("todos"); /*contains nos retorna un booleano ya que queremos averiguar
        si la cadena contiene un substring especifico o un caracter así que nos dirá si lo contiene o no*/
        System.out.println(SubString);

        boolean start = mensaje.startsWith("H"); /*stratsWith nos permite saber si el string comienza con un caracter
        especifico o con un substring */
        System.out.println(start);

        boolean end = mensaje.endsWith("s"); // endsWith nos permite saber con que termina
        System.out.println(end);

        String nuevoMensaje = mensaje.concat(" Uribe es un paraco"); /* contacat nos permite concatenar un string con otro
        es decir que podemos unir dos strings en uno solo*/

        System.out.println(nuevoMensaje);




    }

}
