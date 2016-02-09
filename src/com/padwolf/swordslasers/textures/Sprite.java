package com.padwolf.swordslasers.textures;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by 970098955 on 2/8/2016.
 */
public class Sprite {
    private Image[] textures;
    private int numTextures;
    private long delay;

    public Image[] getTextures() {
        return textures;
    }

    public int numberOfTextures() {
        return numTextures;
    }
    
    public long getDelay() {
        return delay;
    }

    public void setDelay(long delay) {
        this.delay = delay;
    }

    public Sprite(BufferedImage spriteSheet, long delay){
        this.delay = delay;

        if (spriteSheet.getWidth() % spriteSheet.getHeight() != 0){throw new IllegalArgumentException("Each sprite must be " +
                "a square. Remember: all squares are rectangles, but not all rectangles are squares");}
        numTextures = spriteSheet.getWidth()/spriteSheet.getHeight();
        textures = new Image[numTextures];
        for (int i = 1; i <= numTextures; i++){
            textures[i-1] = spriteSheet.getSubimage((i-1)*spriteSheet.getHeight(), (i-1)*spriteSheet.getHeight(),
                    spriteSheet.getHeight(), spriteSheet.getHeight());
        }
    }

    public Sprite(File location, long delay) throws IOException{
        this.delay = delay;
        BufferedImage tmp = ImageIO.read(location);
        if (tmp.getWidth() % tmp.getHeight() != 0){throw new IllegalArgumentException("Each sprite must be a square. " +
                "Remember: all squares are rectangles, but not all rectangles are squares");}
        numTextures = tmp.getWidth()/tmp.getHeight();
        textures = new Image[numTextures];
        for (int i = 1; i <= numTextures; i++){
            textures[i-1] = tmp.getSubimage((i-1)*tmp.getHeight(), (i-1)*tmp.getHeight(),
                    tmp.getHeight(), tmp.getHeight());
        }
    }
}
