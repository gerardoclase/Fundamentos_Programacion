package bloque2.tema7.ejercicios;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("a) Cafe b) Te c) Zumo");
        char opcion = sc.next().charAt(0);

        double precio = 0;
        System.out.println("Dime la cantidad");
        int cantidad = sc.nextInt();

        switch (opcion) {
            case 'a' :
                precio = 1.2;
                System.out.println("Has elegido cafe");
                break;

            case 'b' :
                precio = 1;
                System.out.println("Has elegido Te");
                break;

            case 'c' :
                precio = 2;
                System.out.println("Has elegido Zumo");
                break;
        
            default:System.out.println("Opción incorrecta");
                break;
        }
        System.out.println("El precio final es " + (precio*cantidad));
        sc.close();
    }
}
