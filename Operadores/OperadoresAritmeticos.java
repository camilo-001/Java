public class OperadoresAritmeticos {

    public static void  main(String[]args){

        int variableX = 50, variableY =10, resultado; /*Manejaremos 3 variables*/

        resultado = variableX + variableY; /* empleamos las variables para realizar una suma*/

        System.out.println(resultado);

        resultado = variableX - variableY; /* el resultado cambiara al valor de la resta aun que lo estemos usando dos veces
        primero tomara el valor de la suma y se imprime, luego el de la resta y se imprime*/

        System.out.println(resultado);

        resultado = variableX * variableY; /*Multiplicacion*/

        System.out.println(resultado);

        resultado = variableX / variableY; /* División */

        System.out.println(resultado);

        /* Otras operaciones que podemos ejectuar son las de aumentar o disminuir el valor de una variable
        *
        * Utilizando ( ++ y el --) usando el ++ aumentaremos en uno el valor de la variable y el -- lo dismi-
        * nuiremos en uno
        * Ejemplo: variableX ++;
        *          variableX --;
        * Tambien podemos usar el signo = para efectuar opreaciones con la misma variable de una manera más corta
        * Ejemplo: variableX +=10; hemos aumentado en 10 la variable x
        *          variableX -=10; hemos disminuid en 10 la variable x
        *          variablex *=50; hemos multiplicado la variable x por 50
        *          variablex /=5;  hemos dividido la variable x en 5
        * */

        variableX ++;
    }
}
