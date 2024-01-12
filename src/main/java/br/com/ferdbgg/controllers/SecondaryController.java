package br.com.ferdbgg.controllers;

import java.io.IOException;

import br.com.ferdbgg.App;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}