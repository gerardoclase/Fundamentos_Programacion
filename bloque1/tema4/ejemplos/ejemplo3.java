package bloque1.tema4.ejemplos;

public class ejemplo3 {
    public static void main(String[] args) {
        int edad = 15;
        boolean vaConAdulto = true;
        boolean tieneEntrada = false;

        boolean puedeEntrar = edad >= 18 || vaConAdulto;
        boolean puedeSentarse = puedeEntrar && tieneEntrada;

        System.out.println("Puede entrar: " + puedeEntrar);
        System.out.println("Puede sentarse: " + puedeSentarse);
        System.out.println("No tiene entrada: " + !tieneEntrada);
        //Si cambias vaconAdulto a false, puedeEntrar sale false, porque si eres menor no puedes entrar con adulto
    }
}
