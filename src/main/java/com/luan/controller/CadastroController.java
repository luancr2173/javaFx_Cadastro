package com.luan.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import com.luan.model.User;

public class CadastroController {
    
    @FXML
    private TextField nomeField;
    
    @FXML
    private TextField emailField;
    
    @FXML
    private TextField telefoneField;
    
    @FXML
    private Label mensagemLabel;
    
    @FXML
    private Button salvarButton;
    
    @FXML
    private Button limparButton;

    @FXML
    private void initialize() {
        // Inicializações, se necessário
    }

    @FXML
    private void salvar() {
        String nome = nomeField.getText().trim();
        String email = emailField.getText().trim();
        String telefone = telefoneField.getText().trim();

        if (nome.isEmpty() || email.isEmpty() || telefone.isEmpty()) {
            mensagemLabel.setText("Todos os campos são obrigatórios!");
            mensagemLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        User user = new User(nome, email, telefone);
        mensagemLabel.setText("Usuário cadastrado: " + user.getNome());
        mensagemLabel.setStyle("-fx-text-fill: green;");
    }

    @FXML
    private void limpar() {
        nomeField.clear();
        emailField.clear();
        telefoneField.clear();
        mensagemLabel.setText("");
    }
}
