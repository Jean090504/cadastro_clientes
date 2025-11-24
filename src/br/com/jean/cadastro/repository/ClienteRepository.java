package br.com.jean.cadastro.repository;

import br.com.jean.cadastro.model.Cliente;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ClienteRepository {
    private Cliente cliente;



    public void cadastrar(){
        //Obter Caminho para Arquivo
        Path arquivo = Path.of("C:\\Users\\25203640\\ds1m\\clientes\\Clientes.csv");
        try {
            Files.writeString(arquivo, "Senai Jandira\n", StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Erro ao abrir o arquivo!!!");
            System.out.println(e.getMessage());
        }
    }

    public void  listar(){
    }

    public void exibirPorID() {

    }

    public void atualizarCliente(){
    }



}
