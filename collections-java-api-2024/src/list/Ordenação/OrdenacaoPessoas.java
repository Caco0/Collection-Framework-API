package list.Ordenação;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {


    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new  ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade,  altura));
    }

    public List<Pessoa> ordenadoPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort( pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return  pessoasPorAltura;
    }
    public static void main(String[] args) {
        OrdenacaoPessoas ord = new OrdenacaoPessoas();
        ord.adicionarPessoa("João",30,185.67);
        ord.adicionarPessoa("Maria",25,169.45);
        ord.adicionarPessoa("Ana",22,165.99);
        ord.adicionarPessoa("José", 15, 185.55);


        System.out.println(ord.ordenadoPorIdade());
        System.out.println(ord.ordenarPorAltura());
        
    }
}


