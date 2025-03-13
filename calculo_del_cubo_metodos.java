public class calculo_del_cubo_metodos{

    // Método que calcula el cubo de un número entero
    public static int calcularCubo(int numero) {
        return numero * numero * numero;
    }

    public static void main(String[] args) {
        // Prueba del método
        int numero = 3; // Cambia este valor para probar con otros números
        int resultado = calcularCubo(numero);
        
        System.out.println("El cubo de " + numero + " es: " + resultado);
    }
}
