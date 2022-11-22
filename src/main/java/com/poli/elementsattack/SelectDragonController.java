package com.poli.elementsattack;

import com.poli.elementsattack.models.Dragon;
import com.poli.elementsattack.models.DragonMap;
import com.poli.elementsattack.utils.SceneChanger;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class SelectDragonController {

    private final DragonMap dragonMap;
    private final Player player;
    public Button fireButton;
    public Button iceButton;
    public Button waterButton;
    public Button earthButton;
    public Button windButton;

    /**
     * Constructor de la clase SelectDragonController.
     */
    public SelectDragonController() {
        dragonMap = new DragonMap();
        player = Player.getInstance();
    }

    private void loadGameScene() {
        try {
            SceneChanger.loadScene("round.fxml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void initialize() {
        fireButton.setOnMouseClicked(event -> {
            player.setSelectedDragon(dragonMap.getMap().get(new Dragon("Fire")).get(0));
            loadGameScene();
        });

        iceButton.setOnMouseClicked(event -> {
            player.setSelectedDragon(dragonMap.getMap().get(new Dragon("Ice")).get(0));
            loadGameScene();
        });

        waterButton.setOnMouseClicked(event -> {
            player.setSelectedDragon(dragonMap.getMap().get(new Dragon("Water")).get(0));
            loadGameScene();
        });

        earthButton.setOnMouseClicked(event -> {
            player.setSelectedDragon(dragonMap.getMap().get(new Dragon("Earth")).get(0));
            loadGameScene();
        });

        windButton.setOnMouseClicked(event -> {
            player.setSelectedDragon(dragonMap.getMap().get(new Dragon("Wind")).get(0));
            loadGameScene();
        });
    }
}
