package br.com.ferdbgg.components;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Alerta {
    
    public static void mostrarAlerta(String titulo, String cabecalho, String corpo, AlertType tipo) {
        Alert alerta = new Alert(tipo);
        alerta.setTitle(titulo);
        alerta.setHeaderText(cabecalho);
        alerta.setContentText(corpo);
        alerta.show();
    }

}
