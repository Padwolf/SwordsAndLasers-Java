package com.padwolf.swordslasers.components;

/**
 * Created by 970098955 on 1/28/2016.
 */
public class PlayerType {

    private String type;
    private int health;
    private int strength;
    private int stamina;
    private Object[] inv;
    public PlayerType(String typeName, int initHealth, int initStrength, int initStamina, Object[] startingInv){
        type = typeName;
        health = initHealth;
        strength = initStrength;
        stamina = initStamina;
        inv = startingInv;
    }

    public String getType(){
        return type;
    }
}
