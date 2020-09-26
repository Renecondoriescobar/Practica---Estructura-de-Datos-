package Practica;
import java.util.ArrayList;
import java.util.Scanner;
public class Practica {

    ArrayList<Object[]> informacion;
    Scanner scanner;

    //metodo constructor
    public Practica() {
        informacion = new ArrayList<Object[]>();
        scanner = new Scanner(System.in);
    }

    //metodo ejecutar
    public void ejecutar() {

        String nombre = null;
        int edad = 0;
        int cont = 1;
        while (true) {
            System.out.print("Ingrese nombre del Alumno" + cont + ": ");
            nombre = scanner.next();
            nombre = nombre.replace(" ", "");
            if (nombre.equals("*")) {
                break;
            }
            System.out.print("Ingrese su edad: ");

            edad = scanner.nextInt();
            while (edad <= 0) {
                System.out.print("Ingrese correctamente la edad del Alumno: ");
                edad = scanner.nextInt();
            }

            Object[] datos = {nombre, edad};
            informacion.add(datos);
            cont++;
        }

        if (informacion.size() != 0) {
            System.out.println("Los Alumnos mayores de edad que ingreso son: ");
            for (Object[] datos : informacion) {

                if ((int) datos[1] >= 18) {
                    System.out.println(datos[0]);
                }
            }
        } else {
            System.out.println("No se ha registrado ningun dato");
        }
    }
}