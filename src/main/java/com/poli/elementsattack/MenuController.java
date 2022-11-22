package com.poli.elementsattack;

import com.poli.elementsattack.utils.SceneChanger;
import javafx.fxml.FXML;

import java.io.IOException;

public class MenuController {
    @FXML
    protected void startGameHandler() throws IOException {
        SceneChanger.loadScene("select-dragon.fxml");
    }
}