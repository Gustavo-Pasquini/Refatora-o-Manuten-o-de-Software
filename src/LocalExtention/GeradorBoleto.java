package LocalExtention;

import java.time.LocalDate;

/*
    Uso de wrapper para adicionar funcionalidades a uma biblioteca externa
    1. Criar uma nova classe (DataEstendida);
    2. Chamar a classe criada para substituição (Não alterar assinatura do método);
    3. Substituir pelos novos métodos do wrapper criado
 */

//public class GeradorBoleto { // GeradorBoleto
//
//    public void gerarBoleto(String cliente, LocalDate dataVencimento) {
//        System.out.println("Cliente: " + cliente);
//
//        String dataFormatada = dataVencimento.getDayOfMonth() + "/"
//                + dataVencimento.getMonthValue() + "/"
//                + dataVencimento.getYear();
//
//        System.out.println("Vencimento: " + dataFormatada);
//
//        if (dataVencimento.getDayOfWeek() == DayOfWeek.SATURDAY
//                || dataVencimento.getDayOfWeek() == DayOfWeek.SUNDAY) {
//            System.out.println("Atenção: vencimento em final de semana");
//        } else {
//            System.out.println("Vencimento em dia útil");
//        }
//    }
//}

public class GeradorBoleto { // GeradorBoleto

    public void gerarBoleto(String cliente, LocalDate dataVencimento) {
        System.out.println("Cliente: " + cliente);

        DataEstendida data = new DataEstendida(dataVencimento);

        String dataFormatada = data.formatarPadraoBrasileiro();

        System.out.println("Vencimento: " + dataFormatada);

        if (data.isFinalDeSemana()) {
            System.out.println("Atenção: vencimento em final de semana");
        } else {
            System.out.println("Vencimento em dia útil");
        }
    }
}
