public class CreadorWithdrawl extends CreadorTransaccionesI {

    public TransaccionI crearTransaccion(){
       return new Withdrawl(pin, Accountno);

    }





























    String pin;
    String Accountno;

}
