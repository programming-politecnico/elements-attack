package com.poli.elementsattack;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public class MenuController {
    @FXML
    protected void startGameHandler() throws IOException {
        // replace current scene with game scene "game.fxml"
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("game.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Application.stage.setScene(scene);
    }
}