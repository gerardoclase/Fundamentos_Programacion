package bloque2.tema5.Ejercicios;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double DESCUENTO = 0.10;
        System.out.print("Escribe un importe: ");
        double importe = sc.nextInt();
        double total ;

        if (importe>100) {
            total = importe - (importe * DESCUENTO);
            System.out.println("El precio total es: " +total);
        }
        else
        System.out.println("El precio final es: " +importe);

        sc.close();
    }
}
