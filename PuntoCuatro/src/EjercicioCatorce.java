import java.util.Scanner;

public class EjercicioCatorce {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero = 0, cuadradoN = 0, cuboN = 0;

        System.out.print("Ingrese el numero: ");
        numero = entrada.nextDouble();

        cuadradoN = Math.pow(numero, 2);
        cuboN = Math.pow(numero, 3);

        System.out.println("El cuadrado de " + numero + " es: " + cuadradoN);
        System.out.println("El cubo de " + numero + " es: " + cuboN);

    }
}
