

public class WhileDoWhile {

    public static void main(String[] args) {

        //ciclo while evalua primero la estrucción y luego ejecuta el codigo

        int i = 1;

        while (i <10 ){ // mientras i sea menor que 10
            System.out.println(i); // ejecute este codigo
            i++; // y aumente en 1 a i
        }

        // ciclo do while ejecuta el codigo primero

        int o = 123;

        do{
            System.out.println(o);
            o++;
        }while (o<10);

    }

}