package patrones.Decorator;

public class TelefonoDecorator implements Telefono {
    private final Telefono telefono;


    //Aqui se produce la Implementacion del Patron Decorator. Este constructor tiene como parametro
    // una interfaz, tiene que implementar la interfaz del decorator
    // hay que crear los decoradores. Se crean nuevas clases (telefonointeligente, telefeononext gen) heredan el decorator
    public TelefonoDecorator(Telefono telefono) {
        this.telefono = telefono;
    }

    @Override
    public void crear() {
        this.telefono.crear();
    }
}