package br.com.ferdbgg.controllers;

import java.io.IOException;

import br.com.ferdbgg.App;
import br.com.ferdbgg.components.Alerta;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class PrimaryController {

    @FXML
    private Button meuBotao;

    @FXML
    private void onMeuBotaoAction() {
        Alerta.mostrarAlerta("Alerta", "Esse é um alerta", "Esse é o corpo do alerta", AlertType.INFORMATION);
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

}
