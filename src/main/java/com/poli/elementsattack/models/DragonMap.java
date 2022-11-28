package com.poli.elementsattack.models;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Crea un mapa de dragones.
 */
public class DragonMap {

    private final Map<Dragon, List<Dragon>> map;

    public DragonMap() {
        map = new HashMap<>();

        Dragon fire = new Dragon("Fuego");
        Dragon ice = new Dragon("Hielo");
        Dragon water = new Dragon("Agua");
        Dragon earth = new Dragon("Tierra");
        Dragon wind = new Dragon("Viento");

        map.put(fire, Arrays.asList(ice, water));
        map.put(ice, Arrays.asList(water, earth));
        map.put(water, Arrays.asList(earth, wind));
        map.put(earth, Arrays.asList(wind, fire));
        map.put(wind, Arrays.asList(fire, ice));
    }

    /**
     * Obtiene el mapa de dragones.
     *
     * @return el mapa de dragones.
     */
    public Map<Dragon, List<Dragon>> getMap() {
        return map;
    }
}