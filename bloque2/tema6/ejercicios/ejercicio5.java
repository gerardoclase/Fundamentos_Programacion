package bloque2.tema6.ejercicios;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();

        if (edad<4) {
            System.out.println("gratis");
        }else if (edad >4 && edad <13) {
            System.out.println("0.50€");
        }else if (edad >12 && edad <65) {
            System.out.println("1.20€");
        }else {
            System.out.println("gratis");
        }
        sc.close();
    }
}
