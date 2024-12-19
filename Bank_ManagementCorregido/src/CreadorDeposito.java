public class CreadorDeposito extends CreadorTransaccionesI {
    

    public TransaccionI crearTransaccion(){
        return new Deposit(pin, Accountno);
    }


























    String pin;
    String Accountno;

}
