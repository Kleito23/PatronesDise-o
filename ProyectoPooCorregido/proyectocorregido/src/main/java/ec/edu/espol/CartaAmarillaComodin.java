package ec.edu.espol;

public class CartaAmarillaComodin extends Carta {
    String comodin;
    public CartaAmarillaComodin(String comodin, int valor){
        super("Amarillo",valor);
        this.comodin = comodin;
    }

    @Override
    public boolean puedeJugar(Carta otraCarta) {
        return true; 
    }

}
