package com.poli.elementsattack.utils;

import com.poli.elementsattack.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public class SceneChanger {
    /**
     * Sustituye la escena actual por la escena especificada por el parámetro sceneName.
     *
     * @param fxmlFileName El nombre de la escena a cargar.
     */
    public static void loadScene(String fxmlFileName) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource(fxmlFileName));
            Scene scene = new Scene(fxmlLoader.load(), 720, 480);
            Application.stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
