package ec.edu.espol;

public class CartaComodinFactory implements AbstractFactory {
    @Override
    public Carta crearCartaRoja(int valor) {
        return new CartaRojaComodin("comodin",valor);
    }

    @Override
    public Carta crearCartaAmarilla(int valor) {
        return new CartaAmarillaComodin("comodin",valor);
    }

    @Override
    public Carta crearCartaAzul(int valor) {
        return new CartaAzulComodin("comodin",valor);
    }

    @Override
    public Carta crearCartaVerde(int valor) {
        return new CartaVerdeComodin("comodin",valor);
    }
}
