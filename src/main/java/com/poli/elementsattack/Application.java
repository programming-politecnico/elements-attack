package com.poli.elementsattack;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    public static Stage stage;

    /**
     * Inicia la aplicación y muestra la ventana del menú.
     *
     * @param st Stage
     * @throws IOException Si no se encuentra el archivo fxml.
     */
    @Override
    public void start(Stage st) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage = st;
        stage.setTitle("Elements Attack");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Punto de entrada de la aplicación. Ejecuta la aplicación.
     *
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        launch();
    }
}