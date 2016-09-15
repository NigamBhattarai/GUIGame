/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author anmol
 */
public class Stage extends JFrame
{
    public Screen screen;
     public Stage(Screen screen)//Contructor
     {
         this.add(screen);
         this.setTitle("Simple Game");
         this.setSize(600,400);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setVisible(true);
         this.setResizable(false);
         this.setAlwaysOnTop(true);
         this.setCursor(13);
     }
}
