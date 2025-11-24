package br.com.jean.cadastro.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Cliente {

    public int id;
    public String nome;
    public String email;
    public double salario;
    public LocalDate dataNascimento;



    public void receberCliente(){
        int contador = 1;



        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite seu email: ");
        email = scanner.nextLine();

        System.out.print("Digite seu salario: ");
        salario = scanner.nextDouble();

        //Formatação e o inserir da data do cliente
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Digite sua data de nascimento (dd/MM/yyyy): ");
        String dataTexto = scanner.nextLine();
        dataNascimento = LocalDate.parse(dataTexto, formato);

        exibirCliente();
    }

    public void exibirCliente() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Data de Nascimento: " + dataNascimento);
    }


}
