package list.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto>  estoqueProdutosMap;

    //construtor
    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public  void adicionarProduto(long cod, String nome, int qto, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, cod, qto));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for(Produto p: estoqueProdutosMap.values()){
                valorTotalEstoque  += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }
    
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco  = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for(Produto p: estoqueProdutosMap.values()){
                if (p.getPreco() >  maiorPreco) {
                   maiorPreco = p.getPreco();
                   produtoMaisCaro = p;
                    
                }
            }
            
        }
        return produtoMaisCaro;
    }
    public static void main(String[] args) {
        EstoqueProdutos e = new EstoqueProdutos();
        //Adiciona produtos no estoque
        e.adicionarProduto(123456,"Camiseta" , 10, 59.90);
        e.adicionarProduto(789123,"Calça", 50, 129.90);
        e.adicionarProduto(789129,"Cueca", 25, 29.90);
        
        //Exibe os produtos cadastrados no estoque
        e.exibirProdutos();
        
        //Calcula o total do estoque
        double valorTotalEstoque = e.calcularValorTotalEstoque();
        System.out.printf("O Valor Total do Estoque é de R$ %.2f\n",valorTotalEstoque);
        //produto mais caro
        Produto pmcaro = e.obterProdutoMaisCaro();
        System.out.println("\n O Produto Mais Caro é : "+pmcaro.getNome());
        System.out.println("Produto mais caro: " + e.obterProdutoMaisCaro());
    }
}
