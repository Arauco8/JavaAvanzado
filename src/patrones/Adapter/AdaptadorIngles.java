package patrones.Adapter;

public class AdaptadorIngles implements Enchufable {

    //creo una instancia de la clase que voy adaptar
    public Lightbulb lightbulb = new Lightbulb();

    public void enciende() {
        lightbulb.turnOn(110);
    }

    public void apaga() {
        lightbulb.turnOff();
    }

    public boolean estaEncendido() {
        return lightbulb.isPoweredOn();
    }
}