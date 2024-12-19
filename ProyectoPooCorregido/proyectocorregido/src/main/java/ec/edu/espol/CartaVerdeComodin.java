package ec.edu.espol;

public class CartaVerdeComodin extends Carta {
    String comodin;
    public CartaVerdeComodin(String comodin, int valor){
        super("Verde",valor);
        this.comodin = comodin;
    }

    @Override
    public boolean puedeJugar(Carta otraCarta) {
        return true; 
    }
}
