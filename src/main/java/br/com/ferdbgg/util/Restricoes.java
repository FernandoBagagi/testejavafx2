package br.com.ferdbgg.util;

import javafx.scene.control.TextField;

public class Restricoes {

    private Restricoes() {

    }

    public static void addListenerCampoNumeroInteiro(TextField campo) {
        campo.textProperty().addListener((observador, valorAnterior, valorNovo) -> {
            if (valorNovo != null && !valorNovo.matches("\\d*")) {
                campo.setText(valorAnterior);
            }
        });
    }

    public static void addListenerCampoNumeroReal(TextField campo) {
        campo.textProperty().addListener((observador, valorAnterior, valorNovo) -> {
            if (valorNovo != null && !valorNovo.matches("\\d*([\\.]\\d*)?")) {
                campo.setText(valorAnterior);
            }
        });
    }
    
    public static void addListenerTamanhoMaximoCampo(TextField campo, int tamanhoMax) {
        campo.textProperty().addListener((observador, valorAnterior, valorNovo) -> {
            if (valorNovo != null && valorNovo.length() > tamanhoMax) {
                campo.setText(valorAnterior);
            }
        });
    }

}
