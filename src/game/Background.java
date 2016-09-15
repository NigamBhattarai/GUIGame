/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import component.GameObject;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author nigam
 */
public class Background extends GameObject{

    public Background(Point location, String imageSrc) {
        super(location, imageSrc);
    }

    @Override
    public void move() {

    }

    @Override
    public void design(Graphics g) {

    }
    
}