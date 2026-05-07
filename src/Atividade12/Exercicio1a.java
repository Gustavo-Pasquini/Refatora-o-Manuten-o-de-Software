package Atividade12;

public class Exercicio1a {
    public void emitirRecibo(String cliente, int quantidade, double precoUnitario) {
        double subtotal = quantidade * precoUnitario;
        double imposto = subtotal * 0.10;
        double total = subtotal + imposto;

        exibirDados(cliente, quantidade, precoUnitario, subtotal, imposto, total);

        informaTipoCompra(total);
    }

    public void exibirDados(
            String cliente, int quantidade, double precoUnitario,
            double subtotal, double imposto, double total
    ) {
        System.out.println("Cliente: " + cliente);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço unitário: R$ " + precoUnitario);
        System.out.println("Subtotal: R$ " + subtotal);
        System.out.println("Imposto: R$ " + imposto);
        System.out.println("Total: R$ " + total);
    }

    public void informaTipoCompra(double total) {
        if (total > 500) {
            System.out.println("Compra de alto valor");
            return;
        }
        System.out.println("Compra comum");
    }
}
