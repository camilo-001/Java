import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLTransactionRollbackException;

public class NestedConditions {

    public static void main(String[] args) {

        int promedio = 6;

        // Diseñaremos un sistema de notas donde la nota minima para pasar es 7

        if (promedio >= 7) {

            if (promedio == 10) {
                System.out.println("Muchas felicitacione");
            } else {
                System.out.println("felciddades");
            }
        } else {
            System.out.println("debes volver a estudiar amigo");

        }
    }
}

