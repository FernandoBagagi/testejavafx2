package br.com.ferdbgg.controllers;

import java.io.IOException;

import br.com.ferdbgg.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {

    @FXML
    private Button meuBotao;

    @FXML
    private void onMeuBotaoAction() {
        System.out.println("Clicou");
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

}
