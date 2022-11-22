package com.poli.elementsattack;

import com.poli.elementsattack.models.Dragon;

public class Player {

    private static Player player;

    private Dragon selectedDragon;
    private int wins;
    private int losses;

    private Player() {
        // Constructor privado para evitar la instanciación
    }

    /**
     * Devuelve una instancia de la clase Player.
     * <p>
     * Si no existe una instancia de la clase Player, se crea una.
     *
     * @return una instancia de la clase Player.
     */
    public static Player getInstance() {
        if (player == null) {
            player = new Player();
        }
        return player;
    }

    /**
     * Getter para el campo selectedDragon.
     *
     * @return el objeto Dragón actualmente seleccionado
     */
    public Dragon getSelectedDragon() {
        return selectedDragon;
    }

    /**
     * Establece el selectedDragon al objeto dragón dado.
     *
     * @param dragon el nuevo dragón seleccionado
     */
    public void setSelectedDragon(Dragon dragon) {
        this.selectedDragon = dragon;
    }

    /**
     * Obtiene el número de victorias de este jugador.
     *
     * @return el número de victorias de este jugador
     */
    public int getWins() {
        return wins;
    }

    /**
     * Esta función establece el número de victorias del jugador.
     *
     * @param wins el número de victorias del jugador
     */
    public void setWins(int wins) {
        this.wins = wins;
    }

    /**
     * Obtiene el número de pérdidas del jugador.
     *
     * @return el número de pérdidas
     */
    public int getLosses() {
        return losses;
    }

    /**
     * Esta función establece las pérdidas del jugador
     *
     * @param losses El número de pérdidas del jugador
     */
    public void setLosses(int losses) {
        this.losses = losses;
    }
}