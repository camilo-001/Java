import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLTransactionRollbackException;

public class ElseIf {

    public static void main(String[] args) {

        String colorLuz = "morado";

        if (colorLuz.equals("verde")) {

            System.out.println("siga");

            /* Como vemos nuestro codigo por ahora solo puede manejar solo dos instrucciones o sea dos posibilidades
             es decir que si quisieramos abarcar más de una posibilidad tendriamos que usar lo siguiente*/

        } else if(colorLuz.equals("amarillo")){ // el else if nos permite indicar más de una posibilidad

            System.out.println("Puede ir arrancando su vehiculo");
        }

        else if(colorLuz.equals("rojo")){

            System.out.printf("detengase por favor");
        }

        else {

            System.out.println("Opcion no encontrada");
        }

        /*Como vemos podemos definir más de una sola condición usando el else if con la cual hemos definido
        * los tres colores que conforman un semaforo pero al final dejamos el else que es el que determina que
        * al no cumplirse ninguna de las anteriores condiciones se diga que esa opción no es valida o no ha sido
        * encontrada*/
    }

}
