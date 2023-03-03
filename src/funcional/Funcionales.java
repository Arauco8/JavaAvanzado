package funcional;

import java.util.ArrayList;
import java.util.function.Function;

public class Funcionales {

    private Function<String, String> toMayus = x -> x.toUpperCase();
    private Function<Integer, Integer> sumador = x -> x.sum(x, x);

    public void pruebas(){
        System.out.println(toMayus.apply("Puma"));
        System.out.println(sumador.apply(7));
        Saluda(toMayus, "Puma");
    }

    public void Saluda(Function<String, String> miFuncion, String nombre){
        miFuncion.apply(nombre);
    }
}
