package rendimientorecursion;

import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//funcion recursiva es una funcion que se llama asi misma. ejemplo para usar es para el uso de arboles binarios

public class Sesion3 {
    public Function<Integer,Integer> sumaFuncionalVariable = x -> IntStream.rangeClosed(1, x).reduce(0, (a, b) -> a + b);

    public static void main(String[] args) throws Exception {

        System.out.println("Factorial Iterativo");
        System.out.println(factorialIterativo(5));
        System.out.println("Factorial Recursivo");
        System.out.println(factorialRecursivo(5));
        System.out.println("Factorial Funcional");
        System.out.println(factorialFuncional(5));
        System.out.println("Suma Iterativa");
        System.out.println(sumaIterativa(5));
        System.out.println("Suma Recursiva");
        System.out.println(sumaRecursiva(5));
        System.out.println("Suma Funcional");
        System.out.println(sumaFuncional(5));
        System.out.println("Fibonacci Funcional");
        System.out.println(fibonacciFuncional(5));
    }
    public static int factorialIterativo(int n) {
        int resultado = 1;

        for (int i = 1; i <= n; i++ ) {
            resultado *= i;
        }

        return resultado;
    }

    public static int factorialRecursivo(int n) {
        if (n == 0) {
            return 1;
        }

        // Usando "tail recursion":
        return n * factorialRecursivo(n-1);
    }

    public static int factorialFuncional(int n) {
        return IntStream.rangeClosed(1, n)
                .reduce(1, (a, b) -> a * b);
    }

    public static int sumaIterativa(int n) {
        int result = 0;

        for (int i = 0; i <= n; i++) {
            result += i;
        }

        return result;
    }

    public static int sumaRecursiva(int n) {
        if (n == 1) {
            return 1;
        }

        return n + sumaRecursiva(n - 1);
    }

    public static int sumaFuncional(int n) {
        return IntStream.rangeClosed(1, n).reduce(0, (a, b) -> a + b);
    }


    public static IntStream fibonacciFuncional(int max) {
        return Stream.iterate(
                new int[]{1, 1},
                fib -> new int[] {fib[1], fib[0] + fib[1]}
        ).mapToInt(fib -> fib[0]);
    }
}