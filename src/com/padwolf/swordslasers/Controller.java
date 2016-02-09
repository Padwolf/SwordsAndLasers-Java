package com.padwolf.swordslasers;

import com.padwolf.swordslasers.components.PlayerType;
import com.padwolf.swordslasers.components.Race;
import com.padwolf.swordslasers.components.entity.Player;
import com.padwolf.swordslasers.reference.GameRefs;
import com.padwolf.swordslasers.reference.PlayerTypes;
import com.padwolf.swordslasers.reference.Races;
import com.padwolf.swordslasers.registration.Registrar;
import com.padwolf.swordslasers.registration.Registration;

import java.util.Random;

/**.
 * Created by 970098955 on 1/28/2016.
 */
public class Controller {

    public static void main(String[] args){
        Registration rgst = GameRefs.registration;

        new Registrar();

        System.out.println("Registered Player Types:");
        for (PlayerType pt : rgst.getRegisteredPlayerTypes()){
            System.out.println(pt.getType());
        }
        System.out.println();

        System.out.println("Registered Races:");
        for (Race race : rgst.getRegisteredRaces()){
            System.out.println(race.getName());
        }
        System.out.println();
        System.out.println();

        Player player = rgst.CreateAndRegisterPlayer(new Player("Padwolf", rgst.getRegisteredRaces()[new Random().nextInt(rgst.countRaces()-1)], rgst.getRegisteredPlayerTypes()[new Random().nextInt(rgst.countPlayerTypes()-1)]));
        System.out.println("Created character: " + player.getPlayerName() + " is a " + player.getRace().getName() + " with a " + player.getPlayerType().getType() + " occupation.");
        System.out.println();
        System.out.println();
        player = rgst.CreateAndRegisterPlayer(new Player("Codewolf", Races.ROBOT, PlayerTypes.ARCHER));
        System.out.println("Created character: " + player.getPlayerName() + " is a " + player.getRace().getName() + " with a " + player.getPlayerType().getType() + " occupation.");
    }
    //
}
