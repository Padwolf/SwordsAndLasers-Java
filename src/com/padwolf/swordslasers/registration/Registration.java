package com.padwolf.swordslasers.registration;

import com.padwolf.swordslasers.GameRefs;
import com.padwolf.swordslasers.components.*;
import com.padwolf.swordslasers.components.entity.Player;

/**
 * Created by 970098955 on 1/28/2016.
 */
public class Registration {

    private PlayerType[] plrtps = new PlayerType[0];
    private Race[] races = new Race[0];
    public void registerPlayerType(PlayerType type){
        PlayerType[] tmp = plrtps;
        plrtps = new PlayerType[plrtps.length + 1];
        for (int i = 0; i < tmp.length; i++){
            plrtps[i] = tmp[i];
        }
        plrtps[plrtps.length-1] = type;
    }

    public void registerRace(Race race){
        Race[] tmp = races;
        races = new Race[races.length + 1];
        for (int i = 0; i < tmp.length; i++){
            races[i] = tmp[i];
        }
        races[races.length-1] = race;
    }

    public Player CreateAndRegisterPlayer(Player player){
        GameRefs.player = player;
        return player;
    }

    public PlayerType[] getRegisteredPlayerTypes(){return plrtps;}
    public int countPlayerTypes(){return plrtps.length+1;}
    public Race[] getRegisteredRaces(){return races;}
    public int countRaces(){return races.length+1;}
}
