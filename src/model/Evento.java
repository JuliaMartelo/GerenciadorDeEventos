package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Evento {
    private String nome;
    private String endereco;
    private Categoria categoria;
    private Date horario;
    private String descricao;



    //MetodoConstrutor
    public Evento(String nome, String endereco, Categoria categoria, Date horario, String descricao){
        this.nome = nome;
        this.endereco = endereco;
        this.categoria = categoria;
        this.horario = horario;
        this.descricao = descricao;
    }

    //Getter nome
    public String getNome(){
        return this.nome;
    }

    //Setter nome
    public void setNome (String nome){
        this.nome = nome;
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
