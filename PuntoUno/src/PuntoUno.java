import java.util.Scanner;
public class PuntoUno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edJuan, edAlber, edAna, edMama;

        System.out.print("Digite la edad de Juan: ");
        edJuan = entrada.nextInt();
        edAlber = (2*edJuan)/3;
        edAna = (4*edJuan)/3;
        edMama = edAlber + edAna + edJuan;

        System.out.println("Las edades son:");
        System.out.println("Alberto: " + edAlber);
        System.out.println("Ana: " + edAna);
        System.out.println("Mama: " + edMama);

    }
}
