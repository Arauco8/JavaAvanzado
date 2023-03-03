package patrones.Factory;

public class Main {
    public static void main(String[] args) {

        Factory factory = new Factory("España");
        System.out.println("El precio para España es: " + factory.getPrecio());

        Factory factory2 = new Factory("USA");
        System.out.println("El precio para fuera de España es: " + factory2.getPrecio());

        Factory factory3 = new Factory("UK");
        System.out.println("El precio para UK es: " + factory3.getPrecio());
    }
}