package Atividade12;

public class Exercicio1e {
    public void avaliarEmprestimo(String cliente, double renda, double valorSolicitado) {
        double limite = renda * 0.3;
        double parcela = valorSolicitado / 12;

        informaDadosEmprestimo(cliente, renda, valorSolicitado, parcela, limite);

        isEmprestimoAprovado(parcela, limite);
    }

    public void informaDadosEmprestimo(
            String cliente, double renda, double valorSolicitado,
            double parcela, double limite
    ) {
        System.out.println("Cliente: " + cliente);
        System.out.println("Renda mensal: R$ " + renda);
        System.out.println("Valor solicitado: R$ " + valorSolicitado);
        System.out.println("Parcela estimada: R$ " + parcela);
        System.out.println("Limite recomendado: R$ " + limite);
    }

    public void isEmprestimoAprovado(double parcela, double limite){
        if (parcela <= limite)
            System.out.println("Empréstimo aprovado");
        else
            System.out.println("Empréstimo negado");
    }
}
