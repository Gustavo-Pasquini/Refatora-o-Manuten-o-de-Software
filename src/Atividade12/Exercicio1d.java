package Atividade12;

public class Exercicio1d {
    public void finalizarVenda(String produto, int quantidade, double preco, boolean entregaExpressa) {
        double subtotal = quantidade * preco;

        double frete = calcularFrete(entregaExpressa);

        double total = subtotal + frete;

        imprimirDadosVenda(produto, quantidade, preco, frete, total);

        if (entregaExpressa) {
            System.out.println("Entrega expressa selecionada");
        } else {
            System.out.println("Entrega comum selecionada");
        }
    }

    public double calcularFrete(boolean entregaExpressa){
        if (entregaExpressa)
            return 40;
        return 20;
    }

    public void imprimirDadosVenda(
            String produto, int quantidade, double preco,
            double frete, double total
    ){
        System.out.println("Produto: " + produto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Frete: R$ " + frete);
        System.out.println("Total: R$ " + total);
    }

    public void informaTipoEntrega(boolean entregaExpressa){
        if (entregaExpressa) {
            System.out.println("Entrega expressa selecionada");
            return;
        }
            System.out.println("Entrega comum selecionada");
    }
}
