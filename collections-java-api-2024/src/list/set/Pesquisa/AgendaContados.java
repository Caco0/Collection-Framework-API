package list.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContados {

    // atributos
    private Set<Contato> contatoSet;

    public AgendaContados() {
        this.contatoSet = new HashSet<>();
    }
    // metodos
    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisaPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        
        for (Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;

        for(Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContados agendaContados = new AgendaContados();


        agendaContados.exibirContato();
        
        agendaContados.adicionarContato("Rafal Fortunato", 974096150);
        agendaContados.adicionarContato("Maria do Carmo", 983812286);
        agendaContados.adicionarContato("Maria das dores", 983812116);
        agendaContados.adicionarContato("Maria das dores", 983812116);
        agendaContados.adicionarContato("Veio Churruito", 98456126);
        
        agendaContados.exibirContato();
        System.out.println(agendaContados.pesquisaPorNome("Maria"));
        
        System.out.println("Contato atualizado: " + agendaContados.atualizarNumeroContato("Veio Churruito", 123));
        agendaContados.exibirContato();

    }
}
