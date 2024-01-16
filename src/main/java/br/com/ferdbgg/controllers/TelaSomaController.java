package br.com.ferdbgg.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import br.com.ferdbgg.util.Restricoes;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaSomaController implements Initializable {
    
    @FXML
    private TextField primeiroNumeroInput;
    @FXML
    private TextField segundoNumeroInput;
    @FXML
    private Label resultadoLabel;
    @FXML
    private Button botaoSomar;

    @FXML
    private void somar() throws IOException {
        final Integer primeiroNumero = Integer.parseInt(primeiroNumeroInput.getText());
        final Integer segundoNumero = Integer.parseInt(segundoNumeroInput.getText());
        final Integer soma = primeiroNumero + segundoNumero;
        resultadoLabel.setText(String.valueOf(soma));
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        Restricoes.addListenerCampoNumeroInteiro(this.primeiroNumeroInput);
        Restricoes.addListenerCampoNumeroInteiro(this.segundoNumeroInput);
    }
    
}
