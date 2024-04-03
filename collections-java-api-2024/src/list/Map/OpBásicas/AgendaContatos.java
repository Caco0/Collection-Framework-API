package list.Map.OpBásicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    //ATRIBUTOS
    private Map<String, Integer> agendaContatosMap;
    //CONSTRUTORES

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatosMap.put(nome, telefone);
    }
    public void removerContato(String nome) throws Exception{
        // if(!agendaContatosMap.isEmpty()){
        //     agendaContatosMap.remove(nome);
        // }

        if(!agendaContatosMap.containsKey(nome)){
            throw  new Exception("Este contato não existe");
        }else{
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatosMap.isEmpty()){
          numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }
    public static void main(String[] args) throws Exception {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Maria do carmo", 988123636);
        agenda.adicionarContato("Joao da silva", 754321098);
        agenda.adicionarContato("Frederico Rui Barbosa", 988381818);
        agenda.adicionarContato("Miguel Teruel", 12345674);

        agenda.exibirContatos();
        
        // agenda.removerContato("Rafael");
        agenda.exibirContatos();

        System.out.println("O Número é: " + agenda.pesquisarPorNome("Miguel Teruel"));

    }
}
