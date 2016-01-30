package com.padwolf.swordslasers.registration;

import com.padwolf.swordslasers.GameRefs;
import com.padwolf.swordslasers.components.PlayerType;
import com.padwolf.swordslasers.components.Race;

/**
 * Created by 970098955 on 1/29/2016.
 */
public class Registrar {
    private Registration rgst = GameRefs.registration;

    //These are all the player types or classes that are in the game by default
    public final PlayerType KNIGHT = new PlayerType("Knight", 5, 5, 5, null);
    public final PlayerType BLACK_MAGE = new PlayerType("Black Mage", 5, 5, 5, null);
    public final PlayerType WHITE_MAGE = new PlayerType("White Mage", 5, 5, 5, null);
    public final PlayerType RED_MAGE = new PlayerType("Red Mage", 5, 5, 5, null);
    public final PlayerType ARCHER = new PlayerType("Archer", 5, 5, 5, null);
    public final PlayerType THEIF = new PlayerType("Thief", 5, 5, 5, null);
    public final PlayerType ASSASSIN = new PlayerType("Assassin", 5, 5, 5, null);
    public final PlayerType PALADIN = new PlayerType("Paladin", 5, 5, 5, null);
    public final PlayerType HUNTER = new PlayerType("Hunter", 5, 5, 5, null);
    public final PlayerType VIKING = new PlayerType("Viking", 5, 5, 5, null);
    public final PlayerType PIRATE = new PlayerType("Pirate", 5, 5, 5, null);
    public final PlayerType BARBARIAN = new PlayerType("Barbarian", 5, 5, 5, null);
    public final PlayerType GUNMAN = new PlayerType("Gunman", 5, 5, 5, null);
    public final PlayerType ROCKETEER = new PlayerType("Rocketeer", 5, 5, 5, null);
    public final PlayerType ILLUSIONIST = new PlayerType("Illusionist", 5, 5, 5, null);
    public final PlayerType SUMMONER = new PlayerType("Summoner", 5, 5, 5, null);
    public final PlayerType HEAVY_WARRIOR = new PlayerType("Heavy Warrior", 5, 5, 5, null);
    public final PlayerType NECROMANCER = new PlayerType("Necromancer", 5, 5, 5, null);
    public final PlayerType ALCHEMIST = new PlayerType("Alchemist", 5, 5, 5, null);

    //These are all the races in the game by default
    public final Race HUMAN = new Race("Human", "nil", 20, 20, 20, 10, 10);
    public final Race DWARF = new Race("Dwarf", "nil", 20, 20, 20, 10, 10);
    public final Race HIGHLAND_ELF = new Race("Highland Elf", "nil", 20, 20, 20, 10, 10);
    public final Race DARK_ELF = new Race("Dark Elf", "nil", 20, 20, 20, 10, 10);
    public final Race ELADRIN = new Race("Eladrin", "nil", 20, 20, 20, 10, 10);
    public final Race HALFLING = new Race("Halfling", "nil", 20, 20, 20, 10, 10);
    public final Race GNOME = new Race("Gnome", "nil", 20, 20, 20, 10, 10);
    public final Race UNDEAD = new Race("Undead", "nil", 20, 20, 20, 10, 10);
    public final Race ANGEL = new Race("Angel", "nil", 20, 20, 20, 10, 10);
    public final Race DEMON = new Race("Demon", "nil", 20, 20, 20, 10, 10);
    public final Race DRAGONBORN = new Race("Dragonborn", "nil", 20, 20, 20, 10, 10);
    public final Race MARTIAN = new Race("Martian", "nil", 20, 20, 20, 10, 10);
    public final Race CLAYMORIAN = new Race("Clamorian", "nil", 20, 20, 20, 10, 10);
    public final Race STAR_EATER = new Race("Star Eater", "nil", 20, 20, 20, 10, 10);
    public final Race ROBOT = new Race("Robot", "nil", 20, 20, 20, 10, 10);
    public final Race ORC = new Race("Orc", "nil", 20, 20, 20, 10, 10);

    public Registrar(){
        rgst.registerPlayerType(KNIGHT);
        rgst.registerPlayerType(BLACK_MAGE);
        rgst.registerPlayerType(WHITE_MAGE);
        rgst.registerPlayerType(RED_MAGE);
        rgst.registerPlayerType(ARCHER);
        rgst.registerPlayerType(THEIF);
        rgst.registerPlayerType(ASSASSIN);
        rgst.registerPlayerType(PALADIN);
        rgst.registerPlayerType(HUNTER);
        rgst.registerPlayerType(VIKING);
        rgst.registerPlayerType(PIRATE);
        rgst.registerPlayerType(BARBARIAN);
        rgst.registerPlayerType(GUNMAN);
        rgst.registerPlayerType(ROCKETEER);
        rgst.registerPlayerType(ILLUSIONIST);
        rgst.registerPlayerType(SUMMONER);
        rgst.registerPlayerType(HEAVY_WARRIOR);
        rgst.registerPlayerType(NECROMANCER);
        rgst.registerPlayerType(ALCHEMIST);

        rgst.registerRace(HUMAN);
        rgst.registerRace(DWARF);
        rgst.registerRace(HIGHLAND_ELF);
        rgst.registerRace(DARK_ELF);
        rgst.registerRace(ELADRIN);
        rgst.registerRace(HALFLING);
        rgst.registerRace(GNOME);
        rgst.registerRace(UNDEAD);
        rgst.registerRace(ANGEL);
        rgst.registerRace(DEMON);
        rgst.registerRace(DRAGONBORN);
        rgst.registerRace(MARTIAN);
        rgst.registerRace(CLAYMORIAN);
        rgst.registerRace(STAR_EATER);
        rgst.registerRace(ROBOT);
        rgst.registerRace(ORC);
    }
}
