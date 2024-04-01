package list.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //Atributos
    private Set<Convidado>  convidadosSet;

    public ConjuntoConvidados () {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadosSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("\nExistem " + conjuntoConvidados.contarConvidados() + " 'CONVIDADOS' dentro do Set convidados\n");
        
        conjuntoConvidados.adicionarConvidado("Emanuel Dávila", 123);
        conjuntoConvidados.adicionarConvidado("Fernando Bortolato", 124);
        conjuntoConvidados.adicionarConvidado("Karina Rodrigues", 125);
        conjuntoConvidados.adicionarConvidado("Roberta Close", 125);
        conjuntoConvidados.adicionarConvidado("Roberta Close da Silva", 126);
        conjuntoConvidados.adicionarConvidado("Cafumango Creusebéquio", 127);
        
        System.out.println("\nExistem " + conjuntoConvidados.contarConvidados() + " 'CONVIDADOS' dentro do Set convidados\n");
        
        conjuntoConvidados.exibirConvidados();
        
        conjuntoConvidados.removerConvidadoPorCodigoConvite(123);
        conjuntoConvidados.exibirConvidados();

        

    }
}
