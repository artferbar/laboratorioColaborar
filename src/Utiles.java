import java.util.Scanner;
import java.util.Random;

public class Utiles {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    public static void mostrar(String texto)
    {
        System.out.println(texto);
    }
    public static void pedir(String texto)
    {
        System.out.print(texto);
    }
    public static int introducirNumero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.print("Error, tienes que escribir un numero: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
    public static int aleatorio(int a, int b)
    {
        int numero = random.nextInt((b - a) + 1) + a;
        return numero;
    }
}