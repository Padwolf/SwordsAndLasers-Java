package com.padwolf.swordslasers.components;

/**
 * Created by 970098955 on 1/29/2016.
 */
public class Race {

    private String name;
    private String magics;

    private int health;
    private int manna;
    private int stamina;
    private float hitX;
    private float hitY;

    public Race(String name, String magics, int baseHealth, int baseManna, int baseStamina, float hitboxX, float hitboxY){
        this.name = name;
        this.magics = magics;
        health = baseHealth;
        manna = baseManna;
        stamina = baseStamina;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getMagics() {return magics;}
    public void setMagics(String magics) {this.magics = magics;}
    public int getHealth() {return health;}
    public void setHealth(int health) {this.health = health;}
    public int getManna() {return manna;}
    public void setManna(int manna) {this.manna = manna;}
    public int getStamina() {return stamina;}
    public void setStamina(int stamina) {this.stamina = stamina;}

    public void getHitbox(){
        float x = hitX;
        float y = hitY;
    }

    public void setHitbox(float x, float y){
        hitX = x;
        hitY = y;
    }
}
