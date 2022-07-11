import java.util.Scanner;

public class Deposito {

    //ATRIBUTOS
    private double deposito;


    //CONSTRUCTOR

    public Deposito() {
        this.deposito = deposito;
    }


    //ACCESORES

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    //ACCIONES PROPIAS


    public void depositar(){

        Scanner entrada= new Scanner(System.in);
        System.out.println("Valor:  ");
        int valor;
        setDeposito(valor=entrada.nextInt());
        System.out.println("La cantidad depositada es: "+getDeposito());

    }
}
