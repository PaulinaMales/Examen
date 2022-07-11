import javax.swing.*;
//Bibliotecas
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {


        //CREAMOS OBJETOS
        //ENTRADA Y SALIDA DE DATOS
        int opcion=0;
        int tamanio ;
        Scanner entrada= new Scanner(System.in);

        System.out.println("Cuantas personas desea ingresar al sistemas?");
        tamanio = entrada.nextInt();

        Usuarios personas[] = new Usuarios[tamanio];
        Deposito valor1= new Deposito();
        Retiro valor2 = new Retiro();




        //Menu de opciones
        System.out.print("--------- CAJERO AUTOMATICO ------- \n");

        System.out.println("(1) REGISTRAR");
        System.out.println("(2) DEPOSITAR DINERO");
        System.out.println("(3) RETIRAR DINERO");
        System.out.println("(4) SALIR\n");

        System.out.println("(4) Ingrese opcion: ");
        opcion = entrada.nextInt();

        //Pedimos datos
        switch (opcion){
            case 1:
                for (int i = 0; i < tamanio; i++) {


                    var espacio = entrada.nextLine();
                    System.out.println("Digite nombre: ");
                    String nombre= entrada.nextLine();

                    System.out.println("Digite apellido: ");
                    String apellido= entrada.nextLine();

                    System.out.println("\nDigite cedula :");
                    int cedula= entrada.nextInt();


                    personas[i] = new Usuarios(nombre,apellido,cedula);
                }

                for (int i = 0; i < tamanio; i++) {
                    System.out.println(" Nombre: " +personas[i].getNombre() + " \nApellido: "+personas[i].getApellido()+"\nCedula: " + personas[i].getCedula()+"\nSu numero de usuario es: "+i);
                }
                break;

            case 2:

                System.out.println("Ingrese su numero de usuario: ");
                int numeroUsuario= entrada.nextInt();
                valor1.depositar();
                break;
            case 3:
                System.out.println("Ingrese su numero de usuario: ");
                int numeroUsuario2= entrada.nextInt();
                valor2.retirar();
                break;
            case 4:
                System.out.println("Hasta pronto");
                System.exit(0);
        }

        //GUARDAR EN ARCHIVO: DATOS ENTRENADOR

        String texto2 = "Nombre :    ";
        String texto3 = "Apellido :  ";
        String texto1 = "Cedula ";
        //GUARDAR EN ARCHIVOS
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\User\\IdeaProjects\\ExamenPOO\\Usuarios.txt"))) {
            for (int i = 0; i < personas.length; i++) {
                bw.newLine();
                bw.write(texto1);
                bw.write( personas[i].getCedula());
                bw.newLine();
                bw.write(texto2);
                bw.write(personas[i].getNombre());
                bw.newLine();
                bw.write(texto3);
                bw.write( personas[i].getApellido());
                bw.newLine();

            }
            System.out.println("Escritura correcta");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
