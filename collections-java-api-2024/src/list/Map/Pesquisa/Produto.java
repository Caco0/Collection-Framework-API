package list.Map.Pesquisa;

public class Produto {

    //atributos
    private String nome;
    private double preco;
    private long cod;
    private int quantidade;

    
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public long getCod() {
        return cod;
    }
    public int getQuantidade() {
        return quantidade;
    }

    //Construtor
    public Produto(String nome, double preco, long cod, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.cod = cod;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Estoque Produtos nome= " + nome + ", preco= " + preco + ", codigo= " + cod +", quantidade= " + quantidade + "\n";
    }
    


}
