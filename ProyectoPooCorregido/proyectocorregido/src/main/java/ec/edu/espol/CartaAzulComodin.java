package ec.edu.espol;

public class CartaAzulComodin extends Carta {
    String comodin;
    public CartaAzulComodin(String comodin, int valor){
        super("Amarillo",valor);
        this.comodin = comodin;
    }

    @Override
    public boolean puedeJugar(Carta otraCarta) {
        return true; 
    }
}
