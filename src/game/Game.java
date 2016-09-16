/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import Gadgets.Life;
import Gadgets.Background;
import Gadgets.Score;
import Gadgets.GOver;
import Gadgets.Seperator;
import component.Screen;
import component.Stage;
import core.Type;
import guigame.GUIGame;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javafx.scene.shape.Line;

/**
 *
 * @author anmol
 */
public class Game implements KeyListener{
    
    Screen screen;
    Football ball;
    Bat bat;
    Seperator seperator;
    GOver gover;
    Brick brick;
    Background background;
    public Game()
    {
        bat = new Bat(new Point(250,340),100,20,Type.rectangle);
        bat.setColor(Color.RED);
        Score score = new Score(new Point(2,0),70,30,Type.other);
        score.setColor(Color.BLACK);
        Life life = new Life(new Point(500,2),70,30,Type.other);
        life.setColor(Color.BLACK);
        seperator = new Seperator(new Point(0,30),600,33,Type.line);
        seperator.setColor(Color.BLACK);
        gover = new GOver(new Point(150,200),300,300,Type.other);
        gover.setColor(Color.BLACK);
        ball = new Football(new Point(100,100),"ball1.png",bat,brick);
        background = new Background(new Point(0,0),"background.jpg");
        screen = new Screen(600,350,Color.WHITE);
        screen.add(background);
        screen.add(seperator);
        int lx=10;
        int ly[]={50,50,50,50,50,50,50,50,50,50,50,75,75,75,75,75,75,75,75,75,75};
        for(int l=0; l<20; l++)
        {
            if(ly[l]==50)
            {
                lx+=45;
            }
            else if(ly[l]==75)
            {
                lx-=45;
            }
            brick = new Brick(new Point(lx,ly[l]),40,20,Type.rectangle,ball);
            screen.add(brick);
        }
        screen.add(ball);
        screen.add(bat);
        if(gover.show==true)
        {
            screen.add(gover);
        }
        screen.add(score);
        screen.add(life);
        Stage stage = new Stage(screen);
        stage.addKeyListener(this);
        screen.play();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    System.out.println("Key Typed!!!");
    }

    @Override
    public void keyPressed(KeyEvent e) {
    System.out.println(e.getKeyCode());
    if(e.getKeyCode()==37)
        bat.left();
    if(e.getKeyCode()==39)
        bat.right();
    
    }
    @Override
    public void keyReleased(KeyEvent e) {
    System.out.println("Key Released!!!");
    }
}