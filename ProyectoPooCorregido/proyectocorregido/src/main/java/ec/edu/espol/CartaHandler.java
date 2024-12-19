package ec.edu.espol;

public interface Handler {
    public void setNext(Handler handler);
    public Handler getNext();
    public void handle(String tipo, int valor);


}
