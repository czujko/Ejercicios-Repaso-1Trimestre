package com.dynmate.naveganator;

import javafx.concurrent.Worker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;

public class NaveganatorController {
    @FXML
    public TextField txtBarraBusqueda;
    @FXML
    public WebView vistaWeb;
    @FXML
    public Button btnBuscar;
    @FXML
    public Button btnGuardarTXT;
    @FXML
    public Button btnImagenes;
    @FXML
    public Button btnTitulo;
    private WebEngine motor;


    File fichero = new File("fuente.txt");

    public void initialize() {
        txtBarraBusqueda.setText("https://");
        motor = vistaWeb.getEngine();
        motor.locationProperty().addListener((observable, oldValue, newValue) -> {
                    txtBarraBusqueda.setText(newValue);

                }
        );
    }

    public void onClickBuscar(ActionEvent actionEvent) {
        String direccion = txtBarraBusqueda.getText().toLowerCase(Locale.ROOT);
        direccion = (direccion.substring(0, 8).equals("https://")) ? direccion : "https://" + direccion;
        motor.load(direccion);

    }

    public void onClickGuardarTXT(ActionEvent actionEvent) {
        try {
            URL url = new URL(txtBarraBusqueda.getText());
            InputStream is = url.openStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            String inputLine;
            StringBuilder a = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                a.append(inputLine);
                a.append("\n");
            }
            in.close();
            FileWriter fw = new FileWriter(fichero.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(a.toString());
            bw.close();
            System.out.println("Done");


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void onClickMostrarLocation(ActionEvent actionEvent) {
        String location = motor.getLocation();
        System.out.println(location);
    }

    public void onClickMostrarTitulo(ActionEvent actionEvent) {
        String title = motor.getTitle();
        System.out.println(title);
    }

    public void onClickMostrarUser(ActionEvent actionEvent) {
        String userAgent = motor.getUserAgent();
        System.out.println(userAgent);
    }

    public void onClickMostrarImagenes(ActionEvent actionEvent) {
        try {
            URL url = new URL(txtBarraBusqueda.getText());
            InputStream is = url.openStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            String inputLine;
            StringBuilder a = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                a.append(inputLine);
                a.append("\n");
            }
            in.close();
            System.out.println(a.toString());
            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
