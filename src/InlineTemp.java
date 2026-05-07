public class InlineTemp {

    /*
        Se a variável não é útil, não há necessidade dela;
     */

//    public void verificarDesconto(double totalCompra) {
//        boolean possuiDesconto = totalCompra >= 200; // Variável desnecessária, utilizada somente uma vez
//
//        if (possuiDesconto) {
//            System.out.println("Desconto aplicado");
//        } else {
//            System.out.println("Sem desconto");
//        }
//    }

    public void verificarDesconto(double totalCompra) {

        if (totalCompra >= 200) {
            System.out.println("Desconto aplicado");
            return;
        }
        System.out.println("Sem desconto");
    }
}
