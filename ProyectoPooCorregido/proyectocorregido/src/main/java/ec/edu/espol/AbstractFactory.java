package ec.edu.espol;

public interface AbstractFactory {
    public Carta crearCartaRoja(int valor);
    public Carta crearCartaAmarilla(int valor);
    public Carta crearCartaAzul(int valor);
    public Carta crearCartaVerde(int valor);
}
