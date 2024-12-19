public class SignupInterface {

    private Signup[] subsistemas;


    public SignupInterface(int i){
        subsistemas = new Signup[i];
    }

    public void addSignup(Signup s, int i){
        subsistemas[i] = s;
    }


    public void crearCuenta(){
        for(Signup i: subsistemas){
            i.setVisible(true);
        }
    }
    

}
