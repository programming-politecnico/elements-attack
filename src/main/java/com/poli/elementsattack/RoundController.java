package com.poli.elementsattack;

import com.poli.elementsattack.models.Dragon;
import com.poli.elementsattack.models.DragonMap;
import javafx.fxml.FXML;

public class RoundController {

    @FXML
    private void initialize() {
        DragonMap dragonMap = new DragonMap();
        Dragon computerDragon = dragonMap.getMap().keySet().stream().findAny().orElse(new Dragon("Fire"));

        Dragon selectedDragon = Player.getInstance().getSelectedDragon();
        if (dragonMap.getMap().get(computerDragon).contains(selectedDragon)) {
            System.out.println(selectedDragon.name() + " beats " + computerDragon.name());
        } else {
            System.out.println(selectedDragon.name() + " loses to " + computerDragon.name());
        }
    }
}
