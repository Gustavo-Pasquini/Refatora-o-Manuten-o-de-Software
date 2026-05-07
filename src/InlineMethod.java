public class InlineMethod {
    /*
        Não é necessário um método para expressões muito específicas e redundantes;
     */
//    public void liberarCertificado(double notaFinal) {
//        if (notaMinimaAtingida(notaFinal)) { // notaMinimaAtingida utilizada apenas uma vez e simples
//            System.out.println("Certificado liberado");
//        } else {
//            System.out.println("Certificado não liberado");
//        }
//    }
//
//    private boolean notaMinimaAtingida(double notaFinal) {
//        return notaFinal >= 6.0;
//    }

    public void liberarCertificado(double notaFinal) {
        if (notaFinal >= 6.0)
            System.out.println("Certificado liberado");
        else
            System.out.println("Certificado não liberado");

    }
}
