public class ExtractVariable {
    /*
        1. Encontra um teste lógico complexo ou utilizado em diversos lugares;
        2. Separar os testes:
            usuario comum: (usuarioAtivo && senhaCorreta && !bloqueado)
            administrador: (administrador && senhaCorreta && acessoInterno)
        3. Criar variáveis para 'simplificar' os testes lógicos;
        4. Utilizar a nova variável para a verificação.
     */

//    public void verificarAcesso(boolean usuarioAtivo,
//                                boolean senhaCorreta,
//                                boolean administrador,
//                                boolean bloqueado,
//                                boolean acessoInterno) {
//        if ((usuarioAtivo && senhaCorreta && !bloqueado) || (administrador && senhaCorreta && acessoInterno)) {
//            System.out.println("Acesso permitido");
//        } else {
//            System.out.println("Acesso negado");
//        }
//    }

    public void verificarAcesso(boolean usuarioAtivo,
                                boolean senhaCorreta,
                                boolean administrador,
                                boolean bloqueado,
                                boolean acessoInterno) {

        boolean usuarioComumValido  = usuarioAtivo && senhaCorreta && !bloqueado;
        boolean administradorValido = administrador && senhaCorreta && acessoInterno;
        boolean podeAcessar         = usuarioComumValido || administradorValido;

        if (podeAcessar) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }

    }

}
