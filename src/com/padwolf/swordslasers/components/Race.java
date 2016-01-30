package com.padwolf.swordslasers.components;

/**
 * Created by 970098955 on 1/29/2016.
 */
public class Race {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMagics() {
        return magics;
    }

    public void setMagics(String magics) {
        this.magics = magics;
    }

    public void getHitbox(){
        double x = hitX;
        double y = hitY;
    }

    public void setHitbox(double x, double y){
        hitX = x;
        hitY = y;
    }

    private String name;
    private String magics;
    private double hitX;
    private double hitY;

    public Race(String name, String magics){
        this.name = name;
        this.magics = magics;
    }
}
