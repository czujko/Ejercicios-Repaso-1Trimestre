package com.dynmate.ejercicio02;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.io.IOException;

public class AppController {
    @FXML
    public ComboBox comboPrograma;
    @FXML
    public Button btnAbrir;

    ObservableList listaProgramas;

    public void initialize() {
        listaProgramas = comboPrograma.getItems();
        listaProgramas.addAll("Notepad","Paint","Calculadora");
    }

    public void onClickAbrir(ActionEvent actionEvent) {
        if (comboPrograma.getValue() == "Notepad"){
            ProcessBuilder pb = new ProcessBuilder("notepad.exe");
            try {
                Process p = pb.start();
                p.waitFor();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        } else if (comboPrograma.getValue() == "Paint"){
            ProcessBuilder pb = new ProcessBuilder("mspaint.exe");
            try {
                Process p = pb.start();
                p.waitFor();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            ProcessBuilder pb = new ProcessBuilder("calc.exe");
            try {
                Process p = pb.start();
                p.waitFor();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}