package com.padwolf.swordslasers;

import com.padwolf.swordslasers.components.PlayerType;
import com.padwolf.swordslasers.registration.Registration;

/**
 * Created by 970098955 on 1/28/2016.
 */
public class Controller {

    private static Registration rgst;
    public static void main(String[] args){
        rgst = new Registration();
        Object[] tmp = new Object[0];
        rgst.registerPlayerType(new PlayerType("Swordsman", 20, 20, 20, tmp));
        rgst.registerPlayerType(new PlayerType("Archer", 20, 20, 20, tmp));
        rgst.registerPlayerType(new PlayerType("Bombardier", 20, 20, 20, tmp));

        for (PlayerType pt : rgst.getRegisteredPlayerTypes()){
            System.out.println(pt.getType());
        }
    }
}
