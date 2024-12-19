package ec.edu.espol;

public class CartaRojaComodin extends Carta {
    String comodin;
    public CartaRojaComodin(String comodin, int valor){
        super("Rojo",valor);
        this.comodin = comodin;
    }

    @Override
    public boolean puedeJugar(Carta otraCarta) {
        /* codigo */
        return true; 
    }
}
