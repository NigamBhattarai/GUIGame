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
import javax.swing.JLabel;

/**
 *
 * @author nigam
 */
public class Life extends GameObject{
    Football ball;
    public Life(Point location, int width, int height, Type type) {
        super(location, width, height, type);
    }
    
    @Override
    public void move() {
        
    }

    @Override
    public void design(Graphics g) {
        int p=550;
        for(int i=0;i<ball.life;i++)
        {
        g.setColor(Color.red);
        g.setFont(new Font(" ",5,30));
        g.drawString("❤",p,25);
        p-=30;
        //g.drawString("Lifes : "+ball.life, 500, height-4);
        }
        if(ball.life<=0)
        {
            g.setFont(new Font("Comic Sans",1,60));
            g.drawString("😢", 270, 160);
            g.setFont(new Font("Comic Sans",1,30));
            g.drawString("Game Over ", 200, 200);
        }
            
    }
}