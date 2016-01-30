package com.padwolf.swordslasers.registration;

import com.padwolf.swordslasers.GameRefs;
import com.padwolf.swordslasers.components.PlayerType;
import com.padwolf.swordslasers.components.Race;

/**
 * Created by 970098955 on 1/29/2016.
 */
public class Registrar {
    private Registration rgst = GameRefs.registration;
    public Registrar(){
        rgst.registerPlayerType(new PlayerType("Knight", 20, 20, 20, null));
        rgst.registerPlayerType(new PlayerType("Black Mage", 20, 20, 20, null));
        rgst.registerPlayerType(new PlayerType("White Mage", 20, 20, 20, null));
        rgst.registerPlayerType(new PlayerType("Red Mage", 20, 20, 20, null));
        rgst.registerPlayerType(new PlayerType("Archer", 20, 20, 20, null));
        rgst.registerPlayerType(new PlayerType("Thief", 20, 20, 20, null));
        rgst.registerPlayerType(new PlayerType("Assassin", 20, 20, 20, null));
        rgst.registerPlayerType(new PlayerType("Paladin", 20, 20, 20, null));
        rgst.registerPlayerType(new PlayerType("Hunter", 20, 20, 20, null));
        rgst.registerPlayerType(new PlayerType("Viking", 20, 20, 20, null));
        rgst.registerPlayerType(new PlayerType("Pirate", 20, 20, 20, null));
        rgst.registerPlayerType(new PlayerType("Barbarian", 20, 20, 20, null));
        rgst.registerPlayerType(new PlayerType("Gunman", 20, 20, 20, null));
        rgst.registerPlayerType(new PlayerType("Rocketeer", 20, 20, 20, null));
        rgst.registerPlayerType(new PlayerType("Illusionist", 20, 20, 20, null));
        rgst.registerPlayerType(new PlayerType("Summoner", 20, 20, 20, null));
        rgst.registerPlayerType(new PlayerType("Heavy Warrior", 20, 20, 20, null));
        rgst.registerPlayerType(new PlayerType("Necromancer", 20, 20, 20, null));
        rgst.registerPlayerType(new PlayerType("Alchemist", 20, 20, 20, null));

        rgst.registerRace(new Race("Human", "nil"));
        rgst.registerRace(new Race("Dwarf", "nil"));
        rgst.registerRace(new Race("Highland Elf", "nil"));
        rgst.registerRace(new Race("Dark Elf", "nil"));
        rgst.registerRace(new Race("Eladrin", "nil"));
        rgst.registerRace(new Race("Halfling", "nil"));
        rgst.registerRace(new Race("Gnome", "nil"));
        rgst.registerRace(new Race("Undead", "nil"));
        rgst.registerRace(new Race("Angel", "nil"));
        rgst.registerRace(new Race("Demon", "nil"));
        rgst.registerRace(new Race("Dragonborn", "nil"));
        rgst.registerRace(new Race("Martian", "nil"));
        rgst.registerRace(new Race("Claymorian", "nil"));
        rgst.registerRace(new Race("Star Eater", "nil"));
        rgst.registerRace(new Race("Robot", "nil"));
        rgst.registerRace(new Race("Orc", "nil"));
    }
}
