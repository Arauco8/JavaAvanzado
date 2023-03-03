package patrones.Adapter;

public class Lightbulb {
    boolean poweredOn = false;
    int voltage = 0;

    public void turnOn(int voltage) {
        this.poweredOn = true;
        this.voltage = voltage;

        System.out.println("Lightbulb poweredOn with " + voltage + " of current");
    }

    public void turnOff() {
        this.poweredOn = false;
        System.out.println("Lightbulb poweredOff");
    }

    public boolean isPoweredOn() {
        return poweredOn;
    }
}