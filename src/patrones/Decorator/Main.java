package patrones.Decorator;

public class Main {
    public static void main(String[] args) {

        Telefono telefonoBasico = new TelefonoBase();
        telefonoBasico.crear();
        System.out.println("----------------------------------------------");
        Telefono telefonoInteligente = new TelefonoInteligente(new TelefonoBase());
        telefonoInteligente.crear();
        System.out.println("----------------------------------------------");
        Telefono telefonoNextGen = new TelefonoNextGen(
                new TelefonoInteligente(
                        new TelefonoBase()
                )
        );
        telefonoNextGen.crear();
        System.out.println("----------------------------------------------");
        Telefono telefonoNextGen2 = new TelefonoNextGen(new TelefonoBase());
        telefonoNextGen2.crear();
    }
}