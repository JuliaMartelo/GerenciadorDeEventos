package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Evento {
    private String titulo;
    private String endereco;
    private Categoria categoria;
    private Date horario;
    private String descricao;



    //MetodoConstrutor
    public Evento(String titulo, String endereco,Date horario, String descricao){
        this.titulo = titulo;
        this.endereco = endereco;
        this.categoria = categoria;
        this.horario = horario;
        this.descricao = descricao;
    }

    public Evento(String titulo, String endereco, String descricao, Date horario) {
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
    public Date getHorario (){
        return this.horario;
    }

    //Getter descricao
    public String getDescricao(){
        return this.descricao;
    }






}
