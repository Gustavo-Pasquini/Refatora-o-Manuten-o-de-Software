package ExtractClass;

/*
    Endereço não precisa ser da classe aluno, mas de uma específica
 */

//public class Aluno {
//
//    private String nome;
//    private String ra;
//
//    private String rua;
//    private String numero;
//    private String bairro;
//    private String cidade;
//    private String estado;
//    private String cep;
//
//    public Aluno(String nome, String ra, String rua, String numero,
//                 String bairro, String cidade, String estado, String cep) {
//        this.nome = nome;
//        this.ra = ra;
//        this.rua = rua;
//        this.numero = numero;
//        this.bairro = bairro;
//        this.cidade = cidade;
//        this.estado = estado;
//        this.cep = cep;
//    }
//
//    public void imprimirDados() {
//        System.out.println("Aluno: " + nome);
//        System.out.println("RA: " + ra);
//        System.out.println("Endereço: " + rua + ", " + numero + " - " + bairro);
//        System.out.println("Cidade: " + cidade + " - " + estado);
//        System.out.println("CEP: " + cep);
//    }
//
//    public String getEnderecoCompleto() {
//        return rua + ", " + numero + " - " + bairro + ", "
//                + cidade + " - " + estado + ", " + cep;
//    }
//}

public class Aluno {

    private String nome;
    private String ra;
    private Endereco endereco;


    public Aluno(String nome, String ra, Endereco endereco) {
        this.nome = nome;
        this.ra = ra;
        this.endereco = endereco;
    }

    public void imprimirDados() {
        System.out.println("Aluno: " + nome);
        System.out.println("RA: " + ra);
        endereco.imprimirDados();
//        System.out.println("Endereço: " + endereco.getRua() + ", " + endereco.getNumero() + " - " + endereco.getBairro());
//        System.out.println("Cidade: " + endereco.getCidade() + " - " + endereco.getEstado());
//        System.out.println("CEP: " + endereco.getCep());
    }

    public String getEnderecoAluno() {
        return endereco.getEnderecoCompleto();
    }

}