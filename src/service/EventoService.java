package service;

import model.Categoria;
import model.Evento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class EventoService {


    private ArrayList<Evento> eventos = new ArrayList<>();

    //Cadastrando eventos
    public void cadastrarEventos(String titulo, String endereco, String descricao, LocalDate horario, Categoria categoria){
        Evento novoEvento = new Evento(titulo,endereco,horario,descricao, categoria);
        eventos.add(novoEvento);

        System.out.println("Evento cadastrado com sucesso!");
    }

    //Listando eventos
    public void listaEvento(){
        if(eventos.isEmpty()){
            System.out.println("Nenhum evento encontrado!");
            return;
        }

        for (Evento e : eventos){
            System.out.println(e);
        }
    }


    //Buscar evento pelo nome
    public Evento buscarEvento(String nome){
        for(Evento e : eventos){
            if (e.getNome().equalsIgnoreCase(nome)){
                return e;
            }
        }
        return null;
    }

    public void removerEvento(String nome){

        Evento evento = buscarEvento(nome);

        if (evento != null){
            eventos.remove(evento);
            System.out.println("Evento removido com sucesso");
        }else{
            System.out.println("Evento não encontrado!");
        }
    }

}
