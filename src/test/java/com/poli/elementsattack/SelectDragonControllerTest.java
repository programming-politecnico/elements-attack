package com.poli.elementsattack;

import com.poli.elementsattack.models.Dragon;
import com.poli.elementsattack.models.DragonMap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.ImageIcon;

class SelectDragonControllerTest {

    @Test
    void onFireButtonClick() {
        Player player = Player.getInstance();
        DragonMap dragonMap = new DragonMap();
        Dragon fire = new Dragon("Fuego");
        for (Dragon dragon : dragonMap.getMap().keySet()) {
            if (dragon.equals(fire)) {
                player.setSelectedDragon(fire);
            }
        }
        assertEquals("Fuego", player.getSelectedDragon().name());
    }

    @Test
    void onIceButtonClick() {
        Player player = Player.getInstance();
        DragonMap dragonMap = new DragonMap();
        Dragon ice = new Dragon("Hielo");
        for (Dragon dragon : dragonMap.getMap().keySet()) {
            if (dragon.equals(ice)) {
                player.setSelectedDragon(ice);
            }
        }
        assertEquals("Hielo", player.getSelectedDragon().name());
    }

    @Test
    void onWaterButtonClick() {
        Player player = Player.getInstance();
        DragonMap dragonMap = new DragonMap();
        Dragon water = new Dragon("Agua");
        for (Dragon dragon : dragonMap.getMap().keySet()) {
            if (dragon.equals(water)) {
                player.setSelectedDragon(water);
            }
        }
        assertEquals("Agua", player.getSelectedDragon().name());
    }

    @Test
    void onEarthButtonClick() {
        Player player = Player.getInstance();
        DragonMap dragonMap = new DragonMap();
        Dragon earth = new Dragon("Tierra");
        for (Dragon dragon : dragonMap.getMap().keySet()) {
            if (dragon.equals(earth)) {
                player.setSelectedDragon(earth);
            }
        }
        assertEquals("Tierra", player.getSelectedDragon().name());
    }

    @Test
    void onWindButtonClick() {
        Player player = Player.getInstance();
        DragonMap dragonMap = new DragonMap();
        Dragon wind = new Dragon("Viento");
        for (Dragon dragon : dragonMap.getMap().keySet()) {
            if (dragon.equals(wind)) {
                player.setSelectedDragon(wind);
            }
        }
        assertEquals("Viento", player.getSelectedDragon().name());
    }

    @Test
    void onRandomizeComputersDragon() {
        SelectDragonController selectDragonController = new SelectDragonController();
        assertNotNull(selectDragonController.randomizeComputersDragon());

        DragonMap dragonMap = new DragonMap();
        Dragon computerDragon = selectDragonController.randomizeComputersDragon();
        for (Dragon dragon : dragonMap.getMap().keySet()) {
            if (dragon.equals(computerDragon)) {
                assertEquals(computerDragon, dragon);
            }
        }
    }
}