package game;

import component.GameObject;
import core.Direction;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author vikram
 */
public class Football extends GameObject{
    Bat bat;
    public static int life=3;
    public Football(Point location, String imageName,Bat bat,Brick brick) {
        super(location, imageName);
        this.bat = bat;
        vertical = Direction.down;
        horizontal = Direction.left;
    }
    @Override
    public void move() {
        if(location.y>=370-height)
        {
            location.y=340-height;
            location.x=bat.location.x+40;
            life--;
        }
        if(location.x>=600-width)
        {
          horizontal=Direction.left;
        }
        if(location.y<=30)
        {
            vertical=Direction.down;
        }
        if(location.x<=0)
        {
            horizontal=Direction.right;
        }
        if(vertical==Direction.down && horizontal==Direction.right)
        {
            location.y+=1;
            location.x+=1;
        }
        if(horizontal==Direction.right && vertical==Direction.up)
        {
            location.x+=1;
            location.y-=1;
        }
        else if(horizontal==Direction.left && vertical==Direction.up)
        {
            location.x-=1;
            location.y-=1;
        }
        else if(horizontal==Direction.left && vertical==Direction.down)
        {
            location.x-=1;
            location.y+=1;
        }
        if(this.didCollide(bat))toggle();
    }
    public void toggle(){
        if(vertical==Direction.down)vertical=Direction.up;
        else vertical=Direction.down;
    }
    @Override
    public void design(Graphics g) {
    }
}