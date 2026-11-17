package bloque2.tema7.ejercicios;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String color = sc.next();

        switch (color) {
            case "rojo":
                System.out.println("Para");
                break;

            case "amarillo":
                System.out.println("Precaución");
                break;

            case "verde":
                System.out.println("Pasa");
                break;
        
            default:
                System.out.println("Color no válido");
                break;
        }
        sc.close();
    }
}
