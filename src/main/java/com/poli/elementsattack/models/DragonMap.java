package com.poli.elementsattack.models;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DragonMap {

    private final Map<Dragon, List<Dragon>> map;

    public DragonMap() {
        map = new HashMap<>();

        Dragon fire = new Dragon("Fire");
        Dragon ice = new Dragon("Ice");
        Dragon water = new Dragon("Water");
        Dragon earth = new Dragon("Earth");
        Dragon wind = new Dragon("Wind");

        map.put(fire, Arrays.asList(ice, water));
        map.put(ice, Arrays.asList(water, earth));
        map.put(water, Arrays.asList(earth, wind));
        map.put(earth, Arrays.asList(wind, fire));
        map.put(wind, Arrays.asList(fire, ice));
    }

    public Map<Dragon, List<Dragon>> getMap() {
        return map;
    }
}