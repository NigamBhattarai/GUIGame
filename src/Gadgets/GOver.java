/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gadgets;

import component.GameObject;
import core.Type;
import game.Football;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author nigam
 */
public class GOver extends GameObject{
    Football ball;
    public static Boolean show;
    public GOver(Point location, int width, int height, Type type) {
        super(location, width, height, type);
        show = new Boolean(false);
    }
    
    @Override
    public void move() {
        
    }

    @Override
    public void design(Graphics g) {
        g.setColor(Color.BLACK);
        g.setFont(new Font("Sans Serif",3,32));
        g.drawString("Game Over!!!! ", 302,210);
        g.setFont(new Font("Sans Serif",1,12));
    }
    public void setstate()
    {
        show=true;
    }
}