 import java.util.Scanner;

public class ejercicio05 {
    static int[] concatena(int[] a, int[] b) {
        int[] resultado = new int[a.length + b.length];

        // Copiar los elementos del primer array al array resultado
        for (int i = 0; i < a.length; i++) {
            resultado[i] = a[i];
        }

        // Copiar los elementos del segundo array al array resultado
        for (int i = 0; i < b.length; i++) {
            resultado[a.length + i] = b[i];
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Inicializar primer array
        System.out.println("Introduce la cantidad de valores que quieras en el primer array: ");
        int tamaño1 = entrada.nextInt();
        int[] a = new int[tamaño1];
        System.out.println("Introduce el valor para cada casilla de tu primer array: ");
        for (int i = 0; i < tamaño1; i++) {
            a[i] = entrada.nextInt();
        }

        // Inicializar segundo array
        System.out.println("Introduce la cantidad de valores que quieras en el segundo array: ");
        int tamaño2 = entrada.nextInt();
        int[] b = new int[tamaño2];
        System.out.println("Introduce el valor para cada casilla de tu segundo array: ");
        for (int i = 0; i < tamaño2; i++) {
            b[i] = entrada.nextInt();
        }

        // Concatenar los arrays
        int[] resultado = concatena(a, b);

        // Imprimir el array resultante
        System.out.print("Unidos serían: ");
        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }
}
    
