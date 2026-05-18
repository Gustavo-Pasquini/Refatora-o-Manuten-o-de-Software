package MoveField;

public class Pedido {

    private Produto produto;
    private int quantidade;
    private String cepEntrega;

    public Pedido(Produto produto, int quantidade, String cepEntrega) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.cepEntrega = cepEntrega;
    }

    public void imprimirResumo() {
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Quantidade: " + quantidade);
        System.out.println("CEP de entrega: " + this.cepEntrega);
    }
}