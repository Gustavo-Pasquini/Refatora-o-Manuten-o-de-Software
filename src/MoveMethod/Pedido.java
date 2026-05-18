package MoveMethod;

/*
    Mover métodos que não correspondem a classe que está presente
 */

//public class Pedido {
//
//    private double valorTotal;
//
//    public Pedido(double valorTotal) {
//        this.valorTotal = valorTotal;
//    }
//
//    public double calcularDescontoCliente(Cliente cliente) { // Não faz sentido este método no Pedido
//        if (cliente.isVip()) {
//            return cliente.getTotalComprasAnteriores() * 0.05;
//        }
//
//        if (cliente.getTotalComprasAnteriores() > 1000) {
//            return cliente.getTotalComprasAnteriores() * 0.03;
//        }
//
//        return 0;
//    }
//
//    public double getValorTotal() {
//        return valorTotal;
//    }
//}

public class Pedido {

    private double valorTotal;

    public Pedido(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}