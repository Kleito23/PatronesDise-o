package ec.edu.espol;

public class CartaNumericaFactory implements AbstractFactory {
    @Override
    public Carta crearCartaRoja(int valor) {
        return new CartaRoja(valor);
    }

    @Override
    public Carta crearCartaAmarilla(int valor) {
        return new CartaAmarilla(valor);
    }

    @Override
    public Carta crearCartaAzul(int valor) {
        return new CartaAzul(valor);
    }

    @Override
    public Carta crearCartaVerde(int valor) {
        return new CartaVerde(valor);
    }
}
