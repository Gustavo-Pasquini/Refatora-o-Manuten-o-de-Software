package Atividade12;

public class Exercicio1b {
    public void processarMatricula(String aluno, int disciplinas, boolean bolsista) {
        double valorBase = disciplinas * 120.0;

        double desconto = calcularDesconto(bolsista, valorBase);

        double valorFinal = valorBase - desconto;

        imprimirDadosMatricula(aluno, disciplinas, valorBase, desconto, valorFinal);

        informaFormaMatricula(valorFinal);
    }

    public double calcularDesconto(boolean bolsista, double valorBase) {
        if (bolsista)
            return valorBase * 0.4;
        return 0;
    }

    public void imprimirDadosMatricula(
            String aluno, int disciplinas, double valorBase,
            double desconto, double valorFinal
    ) {
        System.out.println("Aluno: " + aluno);
        System.out.println("Disciplinas: " + disciplinas);
        System.out.println("Valor base: R$ " + valorBase);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);
    }

    public void informaFormaMatricula(double valorFinal) {
        if (valorFinal == 0) {
            System.out.println("Matrícula gratuita");
            return;
        }
        System.out.println("Pagamento necessário");
    }
}
