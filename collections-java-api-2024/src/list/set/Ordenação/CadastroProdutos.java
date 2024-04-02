package list.set.Ordenação;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
    
    public void adicionarProduto(long codigo, String nome, double preco, int quantidade ){
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibiProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();
        
        //Adicionando 4 produtos na lista
        cadastro.adicionarProduto(123456L,"Tv",900.00,50);
        cadastro.adicionarProduto(789123L,"Smartphone",1500.00,30);
        cadastro.adicionarProduto(456789L,"Notebook",2000.00,100);
        cadastro.adicionarProduto(987654L,"Tablet",1200.00,20);
        cadastro.adicionarProduto(987654L,"T",1200.00,20);
        cadastro.adicionarProduto(987656L,"Barraca",1200.00,20);

        System.out.println("-------------------------------------------------------");
        System.out.println("Exibindo todos os produtos:\n" + cadastro.produtoSet );
        System.out.println("-------------------------------------------------------");
        System.out.println("Exibindo todos os produtos por nome:\n" +cadastro.exibiProdutosPorNome());
        System.out.println("-------------------------------------------------------");
        System.out.println("Exibindo todos os produtos por preço:\n"+cadastro.exibirPorPreco());
        System.out.println("-------------------------------------------------------");
    }

}
