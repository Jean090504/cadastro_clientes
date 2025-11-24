package br.com.jean.cadastro;

import br.com.jean.cadastro.model.Cliente;
import br.com.jean.cadastro.ui.CadastroUI;

import java.time.LocalDate;

public class CadastroClientesApp {
    public static void main(String[] args) {
        CadastroUI cadastroUI = new CadastroUI();
        cadastroUI.criarMenu();

    }
}
