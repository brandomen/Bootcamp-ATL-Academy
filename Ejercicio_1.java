import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese la edad de su perro");
        Scanner edadPerro = new Scanner(System.in);
        int edadHumano = (edadPerro.nextInt())*7;
        System.out.println("Equivale a " + edadHumano + " años humanos");
    }
}
