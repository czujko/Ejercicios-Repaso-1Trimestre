package com.dynmate.naveganator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class NaveganatorApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(NaveganatorApp.class.getResource("vistaPrincipal-naveganator.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Cutrex Naveganator v.0.1");
        stage.getIcons().add(new Image(Objects.requireNonNull(NaveganatorApp.class.getResourceAsStream("icono.png"))));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}