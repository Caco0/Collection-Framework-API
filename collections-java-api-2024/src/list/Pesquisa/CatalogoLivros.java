package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo, autor, anoPublicacao));

    }

    public List<Livro> pesquisarPorAutor(String autor){

            List<Livro> livrosPorAutor = new ArrayList<>();

            if(!livrosList.isEmpty()){
                for(Livro l: livrosList) {
                    if (l.getAutor().equalsIgnoreCase(autor)) {
                        livrosPorAutor.add(l);
                    }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesqisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao()<= anoFinal){
                    livrosPorIntervaloAno.add(l);
                }
            }
        }
        return livrosPorIntervaloAno;
    }
    public Livro pesquisarPorTitulo(String titulo){
            Livro livroEncontrado= null;
            if( !livrosList.isEmpty()) {
                for (Livro l : livrosList) {
                    if (l.getTitulo().equalsIgnoreCase(titulo)){
                        livroEncontrado = l;
                        break;
                }
            }
        }
    return livroEncontrado;
    }
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros() ;
        catalogoLivros.adicionarLivro("Os Lusíadas", "Luís Vaz de Camões", 1556);
        catalogoLivros.adicionarLivro("Os Lusíadas", "Pero Vaz Caminha", 1600);
        catalogoLivros.adicionarLivro("Macunaíma", "Mario de Andrade", 1928);
        catalogoLivros.adicionarLivro("Memórias Póstumas de Brás Cubas", "Mario de Andrade", 1959);
        catalogoLivros.adicionarLivro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881);
        catalogoLivros.adicionarLivro("teste", "teste", 1881);

        System.out.println(catalogoLivros.pesquisarPorAutor("teste"));
        System.out.println(catalogoLivros.pesquisarPorTitulo( "Os Lusíadas" ) );
        System.out.println(catalogoLivros.pesqisarPorIntervaloAnos(1500, 1600));
    }
    
}
