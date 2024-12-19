package ec.edu.espol;

public class CartaRoja extends Carta {
    public CartaRoja(int valor){
        super("Rojo",valor);
    }

    @Override
    public boolean puedeJugar(Carta otraCarta) {
        /* codigo */
        return true; 
    }
}
