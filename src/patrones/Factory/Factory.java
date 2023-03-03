package patrones.Factory;

public class Factory {
    // Esta variable tiene que tener asignado algo que implemente esa instancia. Que es ese algo  que implemente esa
    // instancia una CLASE, que clase se implementa en la instancia Precio tanto PRECIO EUR y Precio USD
    private Precio precio;

    // creo un constructor private y vacio quiere decir que no puedo invocarlo desde afuera
    private Factory() {};
    public Factory(String pais) {
        if (pais.equalsIgnoreCase("España")) {
            this.precio = new PrecioEUR();
        } else if (pais.equalsIgnoreCase("UK")) {
            this.precio = new PrecioGBP();
        }else {
            this.precio = new PrecioUSD();
        }
    }

    public double getPrecio() {
        return precio.getPrecio();
    }
}
