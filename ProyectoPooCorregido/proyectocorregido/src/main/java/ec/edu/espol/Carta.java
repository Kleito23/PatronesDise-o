package ec.edu.espol;

public abstract class Carta {
    String color;
    int valor;
    public Carta(String color, int valor){
        this.color = color;
        this.valor = valor;
    }
    

    

    public abstract boolean puedeJugar(Carta otraCarta);
}
