package ec.edu.espol;

public class CartaAzul extends Carta {
    public CartaAzul(int valor){
        super("Azul",valor);
    }

    @Override
    public boolean puedeJugar(Carta otraCarta) {
        /* codigo */
        return true; 
    }
}
