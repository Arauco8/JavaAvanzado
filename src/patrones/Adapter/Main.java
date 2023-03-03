package patrones.Adapter;

public class Main {
    public static void main(String[] args) {
        Horno horno = new Horno();
        Lampara lampara = new Lampara();
        AdaptadorIngles lightbulb = new AdaptadorIngles();

        enciende(horno);
        enciende(lampara);
        enciende(lightbulb);

        System.out.println("----------------------------------------------");

        System.out.println("Tiene corriente el horno: " + horno.estaEncendido());
        System.out.println("Tiene corriente la lampara: " + lampara.estaEncendido());
        System.out.println("Tiene corriente la bombilla inglesa: " + lightbulb.estaEncendido());

        System.out.println("----------------------------------------------");

        apaga(horno);
        apaga(lampara);
        apaga(lightbulb);

        System.out.println("----------------------------------------------");

        System.out.println("Tiene corriente el horno: " + horno.estaEncendido());
        System.out.println("Tiene corriente la lampara: " + lampara.estaEncendido());
        System.out.println("Tiene corriente la bombilla inglesa: " + lightbulb.estaEncendido());

        System.out.println("----------------------------------------------");
    }

    public static void enciende(Enchufable enchufable) {
        enchufable.enciende();
    }

    public static void apaga(Enchufable enchufable) {
        enchufable.apaga();
    }
}