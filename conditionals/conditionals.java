import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLTransactionRollbackException;

public class conditionals {

    public static void main(String[] args) {

        String colorLuz = "verde";

        if (colorLuz.equals("verde")) {

            System.out.println("siga");
        } else {
            System.out.println("no puede seguir");
        }

        /* las condiciones en java se manejan por bloques, siempre que se quiera ejecutar instrucciones
        se hará de esa manera. Explicando su ejecucion nos encontramos que en el primer bloque usamos if
        y definimos la instrucción, si esa instrucción se cumple se ejecutará el codigo de esa sección pero
        si no se cumple pasara a ejecutar el otro bloque el de else */
    }


}
