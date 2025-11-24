package br.com.jean.cadastro.ui;

public class CadastroUI {
    public int opcao;

    public void criarMenu() {
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
    }
}
