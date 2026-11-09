package bloque2.tema5.Ejercicios;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe tu edad: ");
        int edad = sc.nextInt();

        if (edad >= 18 && edad <65) 
            System.out.print("Edad de trabajar");
        else 
            System.out.print("Fuera de edad laboral");    
        sc.close();
    }
}
