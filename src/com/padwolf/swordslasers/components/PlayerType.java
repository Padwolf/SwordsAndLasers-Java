package com.padwolf.swordslasers.components;

/**
 * Created by 970098955 on 1/28/2016.
 */
public class PlayerType {

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getManna() {
        return manna;
    }

    public void setManna(int manna) {
        this.manna = manna;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public Object[] getInventory() {
        return inv;
    }

    public void setInventory(Object[] inventory) {
        this.inv = inventory;
    }

    private String type;
    private int health;
    private int manna;
    private int stamina;
    private Object[] inv;
    public PlayerType(){

    }
    public PlayerType(String typeName, int initHealth, int initManna, int initStamina, Object[] startingInv){
        type = typeName;
        health = initHealth;
        manna = initManna;
        stamina = initStamina;
        inv = startingInv;
    }

}
