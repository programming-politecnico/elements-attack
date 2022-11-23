package com.poli.elementsattack;

import com.poli.elementsattack.utils.SceneChanger;
import javafx.fxml.FXML;

public class MenuController {

    /**
     * Handler para iniciar el juego.
     */
    @FXML
    protected void startGameHandler() {
        SceneChanger.loadScene("select-dragon.fxml");
    }
}