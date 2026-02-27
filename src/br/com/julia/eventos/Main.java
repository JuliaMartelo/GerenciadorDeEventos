package br.com.julia.eventos;

import model.Categoria;
import service.EventoService;
import service.UsuarioService;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        UsuarioService usuarioService = new UsuarioService();
        EventoService eventoService = new EventoService();

        int opcao;

        do {
            System.out.println("\n====== SISTEMA DE EVENTOS =====");
            System.out.println("1 - Cadastrar usuário");
            System.out.println(" - Cadastrar Evento");
            System.out.println("3 - Listar Eventos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = teclado.nextLine();

                    System.out.print("Email: ");
                    String email = teclado.nextLine();

                    System.out.print("Sua cidade: ");
                    String suaCidade = teclado.nextLine();

                    usuarioService.cadastrarUsuario(nome, email, suaCidade);
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String titulo = teclado.nextLine();

                    System.out.print("Endereço: ");
                    String endereco = teclado.nextLine();

                    System.out.print("Descrição: ");
                    String descricao = teclado.nextLine();

                    System.out.print("Categoria (SHOW, PALESTRA, WORKSHOP): ");
                    String entrada = teclado.nextLine().toUpperCase();

                    Categoria categoria = Categoria.valueOf(entrada);
                    System.out.print("Categoria: ");
                    String Categoria = teclado.nextLine();


                    eventoService.cadastrarEventos(titulo, endereco, descricao, categoria);
                    break;

                case 3:
                    eventoService.listaEvento();
                    break;

                case 0:
                    System.out.print("Encerrando sistema.....");
                    break;

                default:
                    System.out.println("Opção invalida!");
            }
        } while (opcao != 0);

        teclado.close();




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
