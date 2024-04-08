package list.Map.OrdenacaoMap;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

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
    public void exibirAgenda(){
        Map<LocalDate, Evento> agenda = new TreeMap<>(eventosMap) ;//classe que ordena as chaves do mapa por ordem crescente
        System.out.println(agenda);
    }
    public void obterProximoEvento(){
        // Set<LocalDate> dataSet = eventosMap.keySet();
        // Collection<Evento> values = eventosMap.values();
        // eventosMap.get();

        LocalDate dataAtual = LocalDate.now();
        LocalDate  proximoData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> agenda = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : agenda.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximoData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento+ "Acontecerá na data: "+ proximoData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.adicionarEventos(LocalDate.of(2024, Month.APRIL, 8), "Festa da Pipoca", "Pipocas");
        agenda.adicionarEventos(LocalDate.of(2024, Month.APRIL, 10), "Festa do Repolho", "Repolhaço");
        agenda.adicionarEventos(LocalDate.of(2024, 7, 9), "Festa do Milho", "Milho Festival");
        agenda.adicionarEventos(LocalDate.of(2020, Month.JANUARY, 5), "Festa da Uva", "Uva Festival");

        agenda.exibirAgenda();

        agenda.obterProximoEvento();

    }

}
