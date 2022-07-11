import java.util.Scanner;

public class Retiro {
    //ATRIBUTOS
    private double retiro;

    //CONSTRUCTOR


    public Retiro() {
        this.retiro = retiro;
    }

    //accesores


    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    //ACCIONES PROPIAS
    public void retirar(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Valor:  ");
        int valor;
        setRetiro(valor=entrada.nextInt());
        /*System.out.println(getRetiro());*/
    }
}
