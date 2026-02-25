package br.com.julia.eventos;

import service.UsuarioService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 public class Main {
   public static void main(String[] args){

       Scanner teclado = new Scanner(System.in);
       UsuarioService usuarioService = new UsuarioService();

       //Pedindo o nome do usuário
       System.out.print("Digite seu nome:");
       String nome = teclado.nextLine();

       //Pedindo o email
       System.out.print("Digite o seu email:");
       String email = teclado.nextLine();

       //Pedindo a cidade
       System.out.print("Digite sua cidade:");
       String suaCidade = teclado.nextLine();

       usuarioService.cadastrarUsuario(nome, email, suaCidade);

    }
}
