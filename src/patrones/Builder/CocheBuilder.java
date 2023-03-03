package patrones.Builder;

public class CocheBuilder {
    Vehiculo vehiculo;

    private CocheBuilder() {};

    public CocheBuilder(String marca) {
        vehiculo = new Vehiculo(marca);
        vehiculo.marca = marca;
    }
    //this significa la instancia actual de mi clase, esta funcion se devuelve asi misma, devuelve a su propia clase
    // me devuelvo a mi mismo truco de la programacion fluida
    // un metodo devuelve su propia instancia, la instancia previa, cuando un return this me devuelvo a si mismo pq tengo los metodos de su propia clase
    // esto se hace para añadir a los builders la propiedad de fluidez
    public CocheBuilder setPuertas(int puertas) {
        vehiculo.puertas = puertas;
        return this;
    }

    public CocheBuilder setMotor(String motor) {
        vehiculo.motor = motor;
        return this;
    }

    public CocheBuilder setTipo(String tipo) {
        vehiculo.tipo = tipo;
        return this;
    }

    //metodo que siempre se implementa cuando creamos un builder
    //devuelve un objeto que hemos creado
    public Vehiculo build() {
        return this.vehiculo;
    }
}
