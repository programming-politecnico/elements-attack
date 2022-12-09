package com.poli.elementsattack;

import com.poli.elementsattack.models.Dragon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoundControllerTest {
    @Test
    void playerWins() {
        Dragon selectedDragon = new Dragon("Agua");
        Dragon computerDragon = new Dragon("Tierra");

        RoundController roundController = new RoundController();
        assertTrue(roundController.isPlayerWinner(selectedDragon, computerDragon));
    }

    @Test
    void playerLoses() {
        Dragon selectedDragon = new Dragon("Agua");
        Dragon computerDragon = new Dragon("Fuego");

        RoundController roundController = new RoundController();
        assertFalse(roundController.isPlayerWinner(selectedDragon, computerDragon));
    }

    @Test
    void isDraw() {
        Dragon selectedDragon = new Dragon("Agua");
        Dragon computerDragon = new Dragon("Agua");

        RoundController roundController = new RoundController();
        assertTrue(roundController.isDraw(selectedDragon, computerDragon));
    }
}