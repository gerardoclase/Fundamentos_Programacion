package bloque2.tema7.ejercicios;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce una letra minuscula: ");
    char letra = sc.next().charAt(0);

    switch (letra) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            System.out.println("Es vocal");
            break;
    
        default:System.out.println("Es consonante");
            break;
    }
    sc.close();
    }
}
