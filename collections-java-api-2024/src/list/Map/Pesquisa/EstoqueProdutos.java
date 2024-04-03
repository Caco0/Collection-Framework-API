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
        estoqueProdutosMap.put(cod, new Produto(nome, preco, qto, qto));
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
}
