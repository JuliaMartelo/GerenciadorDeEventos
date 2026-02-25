package service;

import model.Evento;
import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {

    //A lista vai guardar os usuarios cadastrados
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public void cadastrarUsuario(String nome, String email, String suaCidade){

        //Criando um objeto
        Usuario novoUsuario = new Usuario (nome, email, suaCidade);
        //Adicionando na lista
        usuarios.add(novoUsuario);
        //Imprimindo a mensagem para o usuário
        System.out.println("Usuário cadastrado com sucesso!");
    }

    //Listar
    public void listarUsuarios(){
        for(Usuario u : usuarios){
            System.out.println(u);
        }
    }
}
