package model;

import model.Evento;

import java.util.List;
import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private String suaCidade;
    private int idade;
    private String senha;


    //Metodo Construtor
    public Usuario(String nome, String email,String suaCidade){
        this.nome = nome;
        this.email = email;
        this.suaCidade = suaCidade;
    }



    //Getter Nome
    public String getNome(){
        return this.nome;
    }


    //Setter Nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Getter Email
    public String getEmail(){
        return this.email;
    }

    //Getters suaCidade
    public String getSuaCidade(){
        return this.suaCidade;
    }

    //Setters suaCidade
    public void setSuaCidade(String suaCidade){
        this.suaCidade = suaCidade;
    }

    //Getter Idade
    public int getIdade() {
        return this.idade;
    }

    //Setter Idade, pra ngm colocar uma idade negativa
    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }
    }

    //Setter Senha
    public void setSenha(String senha) {
        if (senha != null && senha.length() >= 6) {
            this.senha = senha;
        } else {
            System.out.println("A senha deve ter pelo menos 6 caracteres!");
        }
    }


}





