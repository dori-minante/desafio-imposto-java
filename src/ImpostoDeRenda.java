import java.util.Scanner;

public class ImpostoDeRenda {
    public class static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Renda anual com salário: R$ ");
        double rendaSalario = sc.nextDouble();
        System.out.println("Renda anual com prestação de serviço: R$ ");
        double rendaServico = sc.nextDouble();
        System.out.println("Renda anual com ganho de capital: R$ ");
        double ganhoCapital = sc.nextDouble();
        System.out.println("Gastos médicos: R$ ");
        double gastosMedicos = sc.nextDouble();
        System.out.println("Gastos educacionais: R$ ");
        double gastosEducacionais = sc.nextDouble();

        // Cálculo do imposto sobre o salário
        double salarioMensal = rendaSalario / 12;
        double impostoSalario = 0.0;

        if(salarioMensal > = 3000 && salarioMensal < 5000) {
            impostoSalario = rendaSalario * 0.10;
        } else if (salarioMensal >= 5000) {
            impostoSalario = rendaSalario * 0.20;
        }

        // Imposto sobre serviços
        double impostoServico = rendaServico * 0.15;

        // Imposto sobre ganho de capital
        double impostoGanhoCapital = rendaServico * 0.20;

        // Imposto bruto total
        double impostoBrutoTotal = impostoSalario + impostoServico + impostoGanhoCapital;

        // Deduções

        




    }
}
