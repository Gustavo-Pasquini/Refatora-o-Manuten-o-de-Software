package MoveField;

//public class Produto {
//
//    private String nome;
//    private double preco;
//    private String cepEntrega; // Não faz sentido estar presente no Produto e ajustar restante da classe
//
//    public Produto(String nome, double preco, String cepEntrega) {
//        this.nome = nome;
//        this.preco = preco;
//        this.cepEntrega = cepEntrega;
//    }
//
//    public String getCepEntrega() {
//        return cepEntrega;
//    }
//
//    public double getPreco() {
//        return preco;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//}

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco, String cepEntrega) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}