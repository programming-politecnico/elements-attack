package com.poli.elementsattack;

import com.poli.elementsattack.models.Dragon;

public class Computer {
    private static Computer instance;
    private Dragon dragon;

    private Computer() {
    }

    public static Computer getInstance() {
        if (instance == null) {
            instance = new Computer();
        }
        return instance;
    }

    public Dragon getDragon() {
        return dragon;
    }

    public void setDragon(Dragon dragon) {
        this.dragon = dragon;
    }
}
