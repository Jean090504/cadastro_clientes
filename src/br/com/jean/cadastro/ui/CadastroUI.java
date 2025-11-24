package br.com.jean.cadastro.ui;

import br.com.jean.cadastro.model.Cliente;
import br.com.jean.cadastro.repository.ClienteRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.UUID;

public class CadastroUI {
    public int opcao;

    public void criarMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("CADASTRO DE CLIENTES");
        System.out.println("------------------------------");
        System.out.println("");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Listar todos os Clientes");
        System.out.println("3 - Exibir Cliente");
        System.out.println("4 - Remover Cliente");
        System.out.println("5 - Atualizar Cliente");
        System.out.println("6 - Sair");
        System.out.println("-------------------------------");
        System.out.println("");
        System.out.print("Selecione uma opção (1-6): ");

        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println();
                System.out.print("CADASTRO DE CLIENTES");
                System.out.println();
                cadastrarCliente();
                break;

            case 2:
                Cliente listarCliente = new Cliente();

                break;

            case 3:
                Cliente exibirCliente = new Cliente();
                exibirCliente.exibirCliente();
                break;

            case 4:
                Cliente excluirCliente = new Cliente();

                break;

            case 5:
                Cliente atualizarCliente = new Cliente();

                break;

            case 6:
                Cliente sair = new Cliente();

                break;

            default:System.out.println("Opção Inválida, Digite uma escolha válida!");
            criarMenu();
                break;
        }

    }

    private void cadastrarCliente(){

        UUID id = UUID.randomUUID();
        Cliente cliente = new Cliente();

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        cliente.id = id.toString();

        System.out.print("Digite o nome do cliente: ");
        cliente.nome = scanner.nextLine();

        System.out.print("Digite o email do cliente: ");
        cliente.email = scanner.nextLine();

        System.out.print("Digite o Sálario do cliente: ");
        cliente.salario = scanner.nextDouble();
        scanner.nextLine(); //Gambiarra do Scanner para limpar Cache

        System.out.print("Digite a Data de Nascimento do cliente: ");
        String dataNascimento = scanner.nextLine();

        dataNascimento = dataNascimento.replace("-", "/");

        String[] dataNascimentoSplit = dataNascimento.split("/");
        cliente.dataNascimento = LocalDate.of(
                Integer.parseInt(dataNascimentoSplit[2]),
                Integer.parseInt(dataNascimentoSplit[1]),
                Integer.parseInt(dataNascimentoSplit[0])
        );

        scanner.close();

        ClienteRepository clienteRepository = new ClienteRepository();
        clienteRepository.cadastrar();


    }
}
