package Gadgets;

import component.GameObject;
import game.Brick;
import game.Football;
import java.awt.Graphics;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;

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