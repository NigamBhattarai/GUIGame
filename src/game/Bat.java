/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import component.GameObject;
import component.Screen;
import core.Type;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author anmol
 */
public class Bat extends GameObject{

    Screen screen;
    public Bat(Point location, int width, int height, Type type) {
        super(location, width, height, type);
    }

    @Override
    public void move() {
    
    }
    public void left()
    {
        if(location.x>0)
            location.x-=15;
    }
    public void right()
    {
        if(location.x<600-this.width)
            location.x+=15;
    }
    @Override
    public void design(Graphics g) {
       g.setColor(Color.black);
       g.fillOval(location.x, location.y+10, height-5, height-5);
       g.fillOval(location.x+85, location.y+10, height-5, height-5);
       //g.drawOval(width, width, width, height);
        
    }
    
}