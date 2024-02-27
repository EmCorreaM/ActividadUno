public class EjercicioDoce {
    public static void main(String[] args) {
        int horasSemana = 0;
        double salarioBruto = 0, retencionFuente = 0, salarioNeto = 0;

        horasSemana = 48;
        salarioBruto = horasSemana*5000;
        retencionFuente = salarioBruto*0.125;
        salarioNeto = salarioBruto - retencionFuente;

        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("Retención en la fuente: " + retencionFuente);
        System.out.println("Salario neto: " + salarioNeto);

    }
}
