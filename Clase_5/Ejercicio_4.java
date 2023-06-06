package Clase_5;
import java.util.Scanner;
public class Ejercicio_4 {
    public static void main(String[] args) {

        //Ingresar el total de la cuenta
        Scanner totalCuenta = new Scanner(System.in);
        System.out.println("Ingrese el total de la cuenta: ");
        double cuenta = totalCuenta.nextDouble();

        //Ingresar el porcentaje de propina que desea dejar
        Scanner porcentajePropina = new Scanner(System.in);
        System.out.println("Ingrese el porcentaje de propina que desea dejar: ");
        double porcentaje = porcentajePropina.nextDouble();

        //Cálculo del monto de la propina
        double propina = (cuenta*porcentaje)/100;

        System.out.println("El monto de la propina será: " + propina);
    }
}
