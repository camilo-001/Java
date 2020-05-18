import javax.print.DocFlavor;
import java.time.temporal.ValueRange;

public class OperadoresRelacionales {

    public static void main(String[] args) {
        //OPERADORES RELACIONALES

        int variableX = 100, variableY = 50, variableZ = 100;

        /*Los operadores realcionales usualmente se usan para determinar comparaciones
        * entre datos es decir si dos datos son iguales, diferentes o si uno es mayor
        * que otro. el resultado siempre vendra dado por un tipo de dato booleano
        * es decir que el resultado será True o False*/

        boolean resultado; // declramos nuestra variable resultado con un tipo de dato boolean
        resultado = variableX == variableY; /* debemos tener en cuenta que el usar un solo = significa
       que asignamos un valor a una variable pero el == es para comparar si dos datos son iguales */

        System.out.println(resultado); // como resultado nos dará false ya sabemos porque

        resultado = variableX > variableY; //
        System.out.println(resultado);

        resultado = variableX == variableZ;
        System.out.println(resultado);

        resultado= variableX != variableY; // para determinar si variables son diferentes usamos el !=
        System.out.println(resultado);

        resultado = variableX <= variableZ;
        System.out.println(resultado);


    }

}
