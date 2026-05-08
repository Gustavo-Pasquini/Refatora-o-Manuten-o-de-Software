package Atividade12;

public class Exercicio1c {
    public void gerarRelatorioFuncionario(String nome, int horas, double valorHora) {
        double salarioBruto = horas * valorHora;
        double desconto = salarioBruto * 0.08;
        double salarioLiquido = salarioBruto - desconto;

        imprimirDadosRelatorio(nome, horas, valorHora, salarioBruto, desconto, salarioLiquido);

        informaFaixaSalarial(salarioLiquido);
    }

    public void imprimirDadosRelatorio(
            String nome, int horas, double valorHora, double salarioBruto,
            double desconto, double salarioLiquido
    ) {
        System.out.println("Funcionário: " + nome);
        System.out.println("Horas trabalhadas: " + horas);
        System.out.println("Valor da hora: R$ " + valorHora);
        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);
    }

    public void informaFaixaSalarial(double salarioLiquido) {
        if (salarioLiquido >= 3000) {
            System.out.println("Faixa salarial alta");
            return;
        }
            System.out.println("Faixa salarial comum");
    }
}
