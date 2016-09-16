package game;

import component.GameObject;
import core.Type;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author nigam
 */
public class Brick extends GameObject{
    Football ball;
    Game game;
    public static int brickremain=20;
    public static int score=0;
    private int hardness=3;
    private Color color;
    
    public Brick(Point location, int width, int height, Type type,Football ball) {
        super(location, width, height, type);
        this.ball=ball;
        color= Color.green;
            
    }

    @Override
    public void move() {
        if(this.didCollide(ball))
        {
            hardness--;
            switch(hardness)
            {
                case 2:
                    color= Color.orange;
                    break;
                case 1:
                    color= Color.red;
                    break;
                case 0:
                    this.setLocation(new Point(-50,-50));
                    this.brickremain--;
            }
            ball.toggle();
            this.score++;
            System.out.println("Remaining:"+brickremain);
            System.out.println("Score:"+score);
        }
    }
    @Override
    public void design(Graphics g) {
       g.setColor(color);
       g.fillRect(location.x, location.y, width, height);
       g.setColor(Color.black);
       g.drawString(""+hardness, location.x, location.y);
    }
}