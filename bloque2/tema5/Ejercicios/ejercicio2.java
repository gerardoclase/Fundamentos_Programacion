package bloque2.tema5.Ejercicios;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        if (edad >= 18) {
        System.out.println(" Eres mayor de edad. Puedes entrar");
        } else{
            System.out.println(" Eres menor de edad. No puedes entrar");
        }
        sc.close();
    }
}
