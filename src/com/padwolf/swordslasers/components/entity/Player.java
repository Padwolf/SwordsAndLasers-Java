package com.padwolf.swordslasers.components.entity;

import com.padwolf.swordslasers.components.PlayerType;
import com.padwolf.swordslasers.components.Race;

/**
 * Created by 970098955 on 1/29/2016.
 */
public class Player extends Entity{

    private String name;
    private Race race;
    private PlayerType pt;
    //private final long UID = (System.nanoTime() * System.nanoTime())/System.currentTimeMillis()/2;
    public Player(String playerName, Race race, PlayerType type){
        name = playerName;
        this.race = race;
        pt = type;
    }

    public String getPlayerName() {
        return name;
    }

    //public void setName(String name) {
    //    this.name = name;
    //}

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public PlayerType getPlayerType() {
        return pt;
    }

    public void setPlayerType(PlayerType type) {
        pt = type;
    }
}
