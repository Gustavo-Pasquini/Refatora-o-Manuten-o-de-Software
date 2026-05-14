public class Exercicio5 {
    public void verificarProjeto(double notaDocumento, double notaApresentacao) {
        if (((notaDocumento * 0.6) + (notaApresentacao * 0.4)) >= 7.0) {
            System.out.println("Projeto aprovado");
        } else {
            System.out.println("Projeto precisa de revisão");
        }
    }
}

