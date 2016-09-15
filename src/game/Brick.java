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
    public Brick(Point location, int width, int height, Type type,Football ball) {
        super(location, width, height, type);
        this.ball=ball;
    }

    @Override
    public void move() {
        if(this.didCollide(ball))
        {
            this.setLocation(new Point(-50,-50));
            ball.toggle();
            this.brickremain--;
            this.score++;
            System.out.println("Remaining:"+brickremain);
        }
    }
    @Override
    public void design(Graphics g) {
    }
}