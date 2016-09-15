package Gadgets;

import component.GameObject;
import core.Type;
import game.Brick;
import game.Brick;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JLabel;

/**
 *
 * @author nigam
 */
public class Score extends GameObject{
    Brick brick;
    JLabel label = new JLabel("Score = "+brick.score);
    public Score(Point location, int width, int height, Type type) {
        super(location, width, height, type);
    }
    
    @Override
    public void move() {
        
    }

    @Override
    public void design(Graphics g) {
        g.setColor(Color.black);
        g.setFont(new Font("",3,12));
        g.drawString("Score : "+brick.score, 2, height-4);
    }
    
}
