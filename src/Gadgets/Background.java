/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gadgets;

import component.GameObject;
import game.Brick;
import game.Football;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author nigam
 */
public class Background extends GameObject{
Brick brick;
Football ball;
int check=0;
    public Background(Point location, String imageSrc) {
        super(location, imageSrc);
    }

    @Override
    public void move()
    {
        if(check<=1500)
        {
            check++;
            this.location.x-=1;
        }
        else
        {
            check=0;
            this.location.x=0;
        }
    }

    @Override
    public void design(Graphics g) {

    }
    
}