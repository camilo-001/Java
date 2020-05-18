public class Cast {

    public static void main(String[] args) {

        /*En oprerciones nos encontraremos que necesitamos operar con diferentes tipos de datos
         * ya sea entre sumar un float con un int o cualquier otro. En este caso usaremos cast
         * lo cual nos permitirá realizar dichas operaciones*/

        float variableX = 5.5f;
        int variableY = 50;
        int variableZ = 25;

        int resultado = (int) variableX + variableY; /*Analicemos que la variable resultado es de tipo entero
        al igual que la variable y pero la variable x es de tipo decimal entonces lo que hicimos fue usar cast
        para modificar su tipo de dato (int) si no tuviese el cast el IDE nos arrojaria un erro. al convertir
        el tipo de dato vemos que ya nos arroja el resultado un numero entero quitando el decimal restante*/

        System.out.println(resultado); /* El resultado deberia ser 55.5 pero como hemos usado el cast para cambiar
        el tipo de dato el valor que nos arroja es un entero puesto que ha eliminado el decimal 5*/

        float resultado2 = variableX + variableZ; /* En este caso no se presenta esta situación ya que el resultado
        hemos definido que sea en tipo decimal es decir que no tendremos que usar el cast ya que estamos operando
        un decimal con un entero y el resultado viene dado en decimal. Veremos que el IDE no nos arroja ningun error*/

        System.out.println(resultado2);
    }
}
