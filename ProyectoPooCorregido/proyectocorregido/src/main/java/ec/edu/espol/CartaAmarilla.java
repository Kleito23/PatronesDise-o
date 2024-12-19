package ec.edu.espol;

public class CartaAmarilla extends Carta {
    public CartaAmarilla(int valor){
        super("Amarillo",valor);
        
    }

    @Override
    public boolean puedeJugar(Carta otraCarta) {
        /* codigo */
        return true; 
    }
}
