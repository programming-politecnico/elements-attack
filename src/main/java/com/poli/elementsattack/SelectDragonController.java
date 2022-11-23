package com.poli.elementsattack;

import com.poli.elementsattack.models.Dragon;
import com.poli.elementsattack.models.DragonMap;
import com.poli.elementsattack.utils.SceneChanger;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.util.Random;

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
        SceneChanger.loadScene("round.fxml");
    }

    /**
     * Selecciona un dragón al azar para el computador.
     *
     * @return el dragón seleccionado.
     */
    public Dragon randomizeComputersDragon() {
        Random random = new Random();
        int randomKey = random.nextInt(dragonMap.getMap().keySet().size());
        Computer.getInstance().setDragon((Dragon) dragonMap.getMap().keySet().toArray()[randomKey]);
        return Computer.getInstance().getDragon();
    }

    /**
     * Carga la escena del juego y añade los event listeners a los botones.
     * Selecciona el dragón del jugador y el dragón del computador.
     */
    @FXML
    public void initialize() {
        randomizeComputersDragon();

        fireButton.setOnMouseClicked(event -> {
            player.setSelectedDragon(new Dragon("Fire"));
            loadGameScene();
        });

        iceButton.setOnMouseClicked(event -> {
            player.setSelectedDragon(new Dragon("Ice"));
            loadGameScene();
        });

        waterButton.setOnMouseClicked(event -> {
            player.setSelectedDragon(new Dragon("Water"));
            loadGameScene();
        });

        earthButton.setOnMouseClicked(event -> {
            player.setSelectedDragon(new Dragon("Earth"));
            loadGameScene();
        });

        windButton.setOnMouseClicked(event -> {
            player.setSelectedDragon(new Dragon("Wind"));
            loadGameScene();
        });
    }
}
