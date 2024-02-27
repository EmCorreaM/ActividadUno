import java.util.Scanner;

public class PuntoDiecisiete {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double radio = 0, areaCirculo = 0, longCirculo = 0, pi = Math.PI;

        System.out.print("Digite el radio del circulo: ");
        radio = entrada.nextDouble();

        areaCirculo = pi*Math.pow(radio, 2);
        longCirculo = 2*pi*radio;
        System.out.println("El area del circulo es: " + areaCirculo);
        System.out.println("La longitud de la circunferencia es: " + longCirculo);
    }
}
