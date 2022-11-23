package com.poli.elementsattack;

import com.poli.elementsattack.models.Dragon;
import com.poli.elementsattack.models.DragonMap;
import com.poli.elementsattack.utils.SceneChanger;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class RoundController {
    private final DragonMap DRAGON_MAP = new DragonMap();
    public Text playerChoice;
    public Text computerScore;
    public Text roundResult;

    public boolean isPlayerWinner(Dragon playerDragon, Dragon computerDragon) {
        return DRAGON_MAP.getMap().get(playerDragon).contains(computerDragon);
    }

    public boolean isDraw(Dragon playerDragon, Dragon computerDragon) {
        return playerDragon.equals(computerDragon);
    }

    @FXML
    private void initialize() {
        playerChoice.setText("Tu: " + Player.getInstance().getSelectedDragon().name());

        Dragon selectedDragon = Player.getInstance().getSelectedDragon();
        Dragon computerDragon = Computer.getInstance().getDragon();
        computerScore.setText("Computador: " + computerDragon.name());

        if (isPlayerWinner(selectedDragon, computerDragon)) {
            Player.getInstance().setWins(Player.getInstance().getWins() + 1);
            roundResult.setText("Ganaste! " + selectedDragon.name() + " gana a " + computerDragon.name());
            roundResult.setStyle("-fx-fill: #00d900;-fx-font-size: 18px;");
        } else if (isDraw(selectedDragon, computerDragon)) {
            roundResult.setText("Empate! " + selectedDragon.name() + " empata con " + computerDragon.name());
            roundResult.setStyle("-fx-fill: #faf354;-fx-font-size: 18px;");
        } else {
            Player.getInstance().setLosses(Player.getInstance().getLosses() + 1);
            roundResult.setText("Perdiste! " + computerDragon.name() + " gana a " + selectedDragon.name());
            roundResult.setStyle("-fx-fill: #ff3535;-fx-font-size: 18px;");
        }
    }

    public void nextRound() {
        SceneChanger.loadScene("menu.fxml");
    }
}
