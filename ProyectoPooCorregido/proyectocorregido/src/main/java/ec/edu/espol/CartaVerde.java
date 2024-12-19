package ec.edu.espol;

public class CartaVerde extends Carta {
    public CartaVerde(int valor){
        super("Verde",valor);
    }

    @Override
    public boolean puedeJugar(Carta otraCarta) {
        /* codigo */
        return true; 
    }
}
