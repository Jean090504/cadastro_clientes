package br.com.jean.cadastro.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Cliente {
    public String id;
    public String nome;
    public String email;
    public double salario;
    public LocalDate dataNascimento;

    public void exibirCliente() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Salario: " + salario);
        System.out.println("Data de Nascimento: " + dataNascimento);
    }



}
