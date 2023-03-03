package funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FuncionPura {

    private static int contador = 0;
    private ArrayList<String> listArray;

    public static void main(String[] args) {
        //Funcion pura es toda aquella que los mismos parametros de entrada siempre genera las mismas salidas
        //no puede tener efectos colaterales, todo aquel cambio que se realiza cuando invoco a una funcion
        // si una funcion pura modifica una variable global o local, ya no es pura.
        // la que pueedo modificar son todas las varibles locales a la funcion
        int result = suma(1,2);
        int result2 = suma(1,2);
        System.out.println(result + " " + result2);
        System.out.println(contador);
        System.out.println("----------------------------------------------------------------");
        //Funcion de Alto nivel tiene que recibir un parametro que tiene que ser obligatoriamente una funcion
        // o que bien devuelve una funcion.
        toMayuscula("Puma");

        Funcionales funcional = new Funcionales();
        funcional.pruebas();
        System.out.println("----------------------------------------------------------------");
        ArrayList<String> nombres = new ArrayList();
        nombres.add("Caupolican");
        nombres.add("Lautaro");
        nombres.add("Geronimo");

        nombres.stream().forEach(x -> System.out.println(x));
        System.out.println("----------------------------------------------------------------");
        Stream<String> valores = nombres.stream().map(x -> x.toUpperCase()).filter(x -> x.startsWith("G")); //Map aplica lo que yo le indico sobre cada elemento que recibo de un stream
        valores.forEach(x -> System.out.println(x));
        System.out.println("----------------------------------------------------------------");

        int []numeros = {1,2,3,4,5,6,7,8,9,10};
        var stNumeros = Arrays.stream(numeros);
        //stNumeros.filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));
        var resultado = stNumeros.filter(x -> x % 2 == 0).reduce(0, (x, y) -> {
            System.out.println("X es: " + x + " y: " + y);
            return x + y;
        });

        System.out.println("Mi suma de pares es: " +resultado);
    }


    public static String toMayuscula(String nombre){
        return nombre.toUpperCase();
    }
    public static int suma(int a, int b){
        return a + b;
    }

    public static int multiplica(int a,int b){
        return a * b;
    }
}
