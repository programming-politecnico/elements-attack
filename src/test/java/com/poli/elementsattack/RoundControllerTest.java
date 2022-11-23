package com.poli.elementsattack;

import com.poli.elementsattack.models.Dragon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoundControllerTest {
    @Test
    void playerWins() {
        Dragon selectedDragon = new Dragon("Water");
        Dragon computerDragon = new Dragon("Earth");

        RoundController roundController = new RoundController();
        assertTrue(roundController.isPlayerWinner(selectedDragon, computerDragon));
    }

    @Test
    void playerLoses() {
        Dragon selectedDragon = new Dragon("Water");
        Dragon computerDragon = new Dragon("Fire");

        RoundController roundController = new RoundController();
        assertFalse(roundController.isPlayerWinner(selectedDragon, computerDragon));
    }

    @Test
    void isDraw() {
        Dragon selectedDragon = new Dragon("Water");
        Dragon computerDragon = new Dragon("Water");

        RoundController roundController = new RoundController();
        assertTrue(roundController.isDraw(selectedDragon, computerDragon));
    }
}