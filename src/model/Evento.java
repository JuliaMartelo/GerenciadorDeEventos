package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Evento {
    private String titulo;
    private String endereco;
    private LocalDate horario;
    private String descricao;
    private Categoria categoria;



    //MetodoConstrutor
    public Evento(String titulo, String endereco,LocalDate horario, String descricao, Categoria categoria){
        this.titulo = titulo;
        this.endereco = endereco;
        this.horario = horario;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public Evento(String titulo, String endereco,Date horario, String descricao) {
    }


    //Getter nome
    public String getNome(){
        return this.titulo;
    }

    //Setter nome
    public void setNome (String titulo){
        this.titulo = titulo;
    }

    //Getter endereco
    public String getEndereco(){
        return this.endereco;
    }

    //Setter endereco
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    //Getter categoria
    public Categoria getCategoria(){
        return this.categoria;
    }

    //Getter horario
    public LocalDate getHorario (){
        return this.horario;
    }

    //Getter descricao
    public String getDescricao(){
        return this.descricao;
    }






}
