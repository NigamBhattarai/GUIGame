/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gadgets;

import component.GameObject;
import core.Type;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author nigam
 */
public class Seperator extends GameObject {

    public Seperator(Point location, int width, int height, Type type) {
        super(location, width, height, type);
    }

    @Override
    public void move() {
    }

    @Override
    public void design(Graphics g) {
    }
}