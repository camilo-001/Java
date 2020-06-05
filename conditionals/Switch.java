import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;
import java.sql.SQLTransactionRollbackException;

public class Switch {

    public static void main(String[] args) {

        // Estructura del condicional switch

        String ColorLuz = "Rojo";

        switch (ColorLuz.toLowerCase()) {
            case "verde":
                System.out.println("siga");
                break;

            case "amarillo":
                System.out.println("puede arrancar");
                break;

            case "rojo":
                System.out.println("pare");
                break;

            default:
                System.out.println("no se encuentra la opción");
        }

        /* Cabe aclarar que el break es opcional. Esto quiere decir que segun lo requieras puedes usarlo,
        * un ejemplo es cuandos casos o sea dos condiciones comparten un mismo codigo entonces estos do*/
    }
}

