package imposto;

import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) {
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

        if(salarioMensal >= 3000 && salarioMensal < 5000) {
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

        double maximoDedutivel = impostoBrutoTotal * 0.30;
        double gastosDedutiveis = gastosMedicos + gastosEducacionais;

        if (gastosDedutiveis > maximoDedutivel) {
            gastosDedutiveis = maximoDedutivel;
        }

        // Imposto devido
        double impostoDevido = impostoBrutoTotal - gastosDedutiveis;

        // Resultados
        System.out.println("**************************************************");
        System.out.println("\nRELATÓRIO DE IMPOSTO DE RENDA\n");
        System.out.println("**************************************************\n");
        System.out.println("CONSOLIDADO DE RENDA: ");
        System.out.println("Imposto sobre salário: R$ %.2f%n" + impostoSalario);
        System.out.println("Imposto sobre serviços: R$ %.2f%n" + impostoServico);
        System.out.println("Imposto sobre ganho de capital: R$ %.2f%n" + impostoGanhoCapital);
        System.out.println("\nDEDUÇÕES: ");
        System.out.println("Máximo dedutível: R$ %.2f%n" + maximoDedutivel);
        System.out.println("Gastos dedutíveis: R$ %.2f%n" + gastosDedutiveis);
        System.out.println("\nRESUMO: ");
        System.out.println("Imposto bruto total: R$ %.2f%n" + impostoBrutoTotal);
        System.out.println("Abatimento: R$ %.2f%n" + gastosDedutiveis);
        System.out.println("Imposto devido: R$ %.2f%n" + impostoDevido);

        sc.close();
    }
}
