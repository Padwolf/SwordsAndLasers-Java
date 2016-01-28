package com.padwolf.swordslasers.registration;

import com.padwolf.swordslasers.components.*;

/**
 * Created by 970098955 on 1/28/2016.
 */
public class Registration {

    private PlayerType[] plrtps = new PlayerType[0];
    public void registerPlayerType(PlayerType character){
        PlayerType[] tmp = plrtps;
        plrtps = new PlayerType[plrtps.length + 1];
        for (int i = 0; i < tmp.length; i++){
            plrtps[i] = tmp[i];
        }
        plrtps[plrtps.length-1] = character;
    }

    public PlayerType[] getRegisteredPlayerTypes(){
        return plrtps;
    }
}
