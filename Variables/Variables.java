public class Variables {

    public static void main(String[] args) {

        int version; /*para declarar una variable iniciamos con su tipo de datos seguido del nombre*/

        version = 12; /*para almacenar un valor en un variabel solo tomamos el nombre y le asignamos*/

        System.out.println(version);

        int version2 = 15; /* Otra forma de declarar variables es iniciarlizarlas con un valor */

        int var1 = 1, var2 = 2, var3 = 3, var4 = 4; /* Una forma de declarar en linea*/

        final float constante = 12.5f; /* usamos la palabra final para convertir nuestra variable en constante */

        System.out.println(version2);

        /* TIPOS DE DATOS  */

        float variableFloat = 9.5f; /* Para usar float se debe seguir la siguiente estrucutura */
        double variableDecimal = 9.72823832732; /* A diferencia del float no usamos la f al final*/

        char datos = 'b'; /* Para usar char que es para un caracter */
        char variableNumero = 98; /* Al imprimir ambas variables veremos el mismo caracter
          ya que el 98 equivale a la letra b en minuscula*/

        System.out.println(datos);
        System.out.println(variableNumero);

    }
}