public class ExtractMethod {

/*
    1. Encontrar diferentes funcionalidades no método;
    2. Extrair o trecho de código;
    3. Verificar de deve retornar algo para ser utilizado no método principal;
    4. Verificar se precisa verificar se e necessário a passagem de parâmetro para utilizar a função;
    5. Chamar o novo método no método principal.
 */

//    public void emitirResumoPedido(String cliente, int quantidade, double precoUnitario, boolean cupomAplicado) {
//        double subtotal = quantidade * precoUnitario; // calcula subtotal
//
//        double desconto = 0; // calcula desconto
//        if (cupomAplicado) {
//            desconto = subtotal * 0.15;
//        }
//
//        double total = subtotal - desconto; // calcula total
//
//        System.out.println("Cliente: " + cliente); // printa as informações
//        System.out.println("Quantidade: " + quantidade);
//        System.out.println("Preço unitário: R$ " + precoUnitario);
//        System.out.println("Subtotal: R$ " + subtotal);
//        System.out.println("Desconto: R$ " + desconto);
//        System.out.println("Total: R$ " + total);
//
//        if (total >= 100) { // retorna se possui frete grátia
//            System.out.println("Pedido com frete grátis");
//        } else {
//            System.out.println("Pedido com frete pago");
//        }
//    }

    public void finalizarPedido(String cliente, int quantidade, double precoUnitario, boolean cupomAplicado) {
        double subtotal = quantidade * precoUnitario;

        double desconto = calcularDesconto(cupomAplicado, subtotal); // calcula desconto
        double total = subtotal - desconto;

        imprimirResumoPedido(cliente, quantidade, precoUnitario, subtotal, desconto, total); // printa as informações

        indicaFreteGratis(total);
    }

    public double calcularDesconto(boolean cupomAplicado, double subtotal) {
        if (cupomAplicado)
            return subtotal * 0.15;
        return 0;
    }

    public void imprimirResumoPedido(
            String cliente, int quantidade, double precoUnitario,
            double subtotal, double desconto, double total
    ) {
        System.out.println("Cliente: " + cliente);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço unitário: R$ " + precoUnitario);
        System.out.println("Subtotal: R$ " + subtotal);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Total: R$ " + total);
    }

    public void indicaFreteGratis(double total) {
        if (total >= 100) {
            System.out.println("Pedido com frete grátis");
            return;
        }
        System.out.println("Pedido com frete pago");
    }

}
