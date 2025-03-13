import java.util.Scanner;

public class ejercicio04metodos {
    public static String convierteArrayEnString(int[] a) {
        String resultado = "";
        for (int numero : a) {
            resultado += numero;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce los valores que quieres que haya en el array:");
        int tamaño = entrada.nextInt();

        int[] a = new int[tamaño]; // Inicializar el array con el tamaño especificado

        System.out.println("Introduce el valor para cada hueco de tu array:");
        for (int i = 0; i < tamaño; i++) {
            a[i] = entrada.nextInt();
        }

        String resultado = convierteArrayEnString(a);
        System.out.println("El array hecho cadena es asi: " + resultado);
    }
}