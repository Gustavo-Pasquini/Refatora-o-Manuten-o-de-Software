package MoveMethod;

public class Cliente {

    private boolean vip;
    private double totalComprasAnteriores;

    public Cliente(boolean vip, double totalComprasAnteriores) {
        this.vip = vip;
        this.totalComprasAnteriores = totalComprasAnteriores;
    }

    public double calcularDescontoCliente(Cliente cliente) { // Método movido de Pedido
        if (cliente.isVip()) {
            return cliente.getTotalComprasAnteriores() * 0.05;
        }

        if (cliente.getTotalComprasAnteriores() > 1000) {
            return cliente.getTotalComprasAnteriores() * 0.03;
        }

        return 0;
    }

    public boolean isVip() {
        return vip;
    }

    public double getTotalComprasAnteriores() {
        return totalComprasAnteriores;
    }
}