

public class OperadoresLogicos {

    public static void main(String[] args) {
        /*LOS OPERADORES LOGICOS SON 3 AND OR Y NOT.
        *
        * los operadores son usados para validar sentencias y el resultado es booleano
        * es decir TRUE O FALSE. Cuando usamos AND ambas sentencias deben ser verdaderas
        * para que el resultado sea verdadero a diferencia que con OR solo basta que una
        * sentencia sea verdadera para que el resultado sea verdadera. Al usar NOT lo que
        * hacemos es negar una sentencia.
        * */

        boolean resultado;

        resultado = 5 >= 5 && 2<4; // && es como definimos AND
        System.out.println(resultado);// como resultado vemos que es verdadero ya que ambas sentencias lo son

        resultado = 5 > 5 && 2<4;
        System.out.println(resultado); // vemos que el resultado es falso porque una de las sentencia lo es

        resultado = 5 > 5 || 2<4; // || es como definimos OR
        System.out.println(resultado); // vemos que aunque exista una falsa el resultado es verdadero usando OR

        //NEGACION

        resultado = !(5 >= 5) && 2<4; // ! lo tomamos como NOT
        System.out.println(resultado); /*como resultado vemos falso porque aunque ambas sentencias son verdaderas
        hemos negado la primera sentencia lo que quiere decir que aunque sea verdadera ahora es false
        */

        resultado = !(5 > 5) && 2<4;
        System.out.println(resultado); /*como resultado veremos que es verdadero aunque exista una sentencia falsaverad
        ya que la hemos negado y la negacion de una falsedad da como resultado verdadero */

    }

}
