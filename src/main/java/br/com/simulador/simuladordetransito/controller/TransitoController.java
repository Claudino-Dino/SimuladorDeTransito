package br.com.simulador.simuladordetransito.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TransitoController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}