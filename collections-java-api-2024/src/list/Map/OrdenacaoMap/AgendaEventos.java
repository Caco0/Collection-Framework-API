package list.Map.OrdenacaoMap;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class AgendaEventos {

    //atributos
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos(){
        this.eventosMap = new HashMap<>();
    }
    public void adicionarEventos(LocalDate data, String nome, String atracao){
        // Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        
    }

}
