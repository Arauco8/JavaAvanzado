package patrones.Singleton;

public class Singleton {
    private static Singleton instancia;
    public int contador = 0;

    // creo un constructor private y vacio quiere decir que no puedo invocarlo desde afuera
    private Singleton() { }


    // Metodo comun de Singleton
    public static Singleton getInstance() {
        if (instancia == null) {
            instancia = new Singleton();
        }

        return instancia;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getContador() {
        return contador;
    }
}