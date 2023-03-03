package patrones.Adapter;

public class Horno implements Enchufable {
    boolean encendido = false;

    public void enciende() {
        encendido = true;
        System.out.println("Horno encendido");
    }

    public void apaga() {
        encendido = false;
        System.out.println("Horno apagado");
    }

    public boolean estaEncendido() {
        return encendido;
    }
}
