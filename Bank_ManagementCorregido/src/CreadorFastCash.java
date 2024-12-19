public class CreadorFastCash extends CreadorTransaccionesI {

    public TransaccionI crearTransaccion(){
        return new FastCash(pin, Accountno);
 
     }



























     String pin;
    String Accountno;


}
