package com.padwolf.swordslasers.registration;

import com.padwolf.swordslasers.reference.GameRefs;
import com.padwolf.swordslasers.reference.PlayerTypes;
import com.padwolf.swordslasers.reference.Races;

/**
 * Created by 970098955 on 1/29/2016.
 */
public class Registrar {
    private Registration rgst = GameRefs.registration;

    public Registrar(){
        rgst.registerPlayerType(PlayerTypes.KNIGHT);
        rgst.registerPlayerType(PlayerTypes.BLACK_MAGE);
        rgst.registerPlayerType(PlayerTypes.WHITE_MAGE);
        rgst.registerPlayerType(PlayerTypes.RED_MAGE);
        rgst.registerPlayerType(PlayerTypes.ARCHER);
        rgst.registerPlayerType(PlayerTypes.THEIF);
        rgst.registerPlayerType(PlayerTypes.ASSASSIN);
        rgst.registerPlayerType(PlayerTypes.PALADIN);
        rgst.registerPlayerType(PlayerTypes.HUNTER);
        rgst.registerPlayerType(PlayerTypes.VIKING);
        rgst.registerPlayerType(PlayerTypes.PIRATE);
        rgst.registerPlayerType(PlayerTypes.BARBARIAN);
        rgst.registerPlayerType(PlayerTypes.GUNMAN);
        rgst.registerPlayerType(PlayerTypes.ROCKETEER);
        rgst.registerPlayerType(PlayerTypes.ILLUSIONIST);
        rgst.registerPlayerType(PlayerTypes.SUMMONER);
        rgst.registerPlayerType(PlayerTypes.HEAVY_WARRIOR);
        rgst.registerPlayerType(PlayerTypes.NECROMANCER);
        rgst.registerPlayerType(PlayerTypes.ALCHEMIST);

        rgst.registerRace(Races.HUMAN);
        rgst.registerRace(Races.DWARF);
        rgst.registerRace(Races.HIGHLAND_ELF);
        rgst.registerRace(Races.DARK_ELF);
        rgst.registerRace(Races.ELADRIN);
        rgst.registerRace(Races.HALFLING);
        rgst.registerRace(Races.GNOME);
        rgst.registerRace(Races.UNDEAD);
        rgst.registerRace(Races.ANGEL);
        rgst.registerRace(Races.DEMON);
        rgst.registerRace(Races.DRAGONBORN);
        rgst.registerRace(Races.MARTIAN);
        rgst.registerRace(Races.CLAYMORIAN);
        rgst.registerRace(Races.STAR_EATER);
        rgst.registerRace(Races.ROBOT);
        rgst.registerRace(Races.ORC);
    }
}
