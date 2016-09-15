package component;

import core.Direction;
import core.Renderable;
import core.Type;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author vikram
 */
public abstract class GameObject implements Renderable{
    protected Point location;
    protected int width,height;
    protected Color color;
    protected Direction vertical,horizontal;
    private BufferedImage img=null;
    private Type type;
    public GameObject(Point location,String imageSrc)
    {
        type = Type.image;
        color = Color.white;
        setImage(imageSrc);
        this.location=location;
        this.width=img.getWidth();
        this.height=img.getHeight();
        
        vertical = Direction.down;
        horizontal = Direction.right;
    }
    public GameObject(Point location,int width,int height,Type type)
    {
        this.type = type;
        this.location=location;
        this.width=width;
        this.height=height;
        
        vertical = Direction.down;
        horizontal = Direction.right;
    }
    public void setImage(String imageSrc)
    {
        try {
             img = ImageIO.read(new File(imageSrc));
             //System.out.println(img.toString());
        } catch (IOException ex) {
            System.out.println("Image not found!!!!");
        }
    }
    public Color getColor()
    {
        return color;
    }
    public Point getLocation()
    {
        return location;
    }
    public void setLocation(Point location)
    {
       this.location=location; 
    }
    public void setColor(Color color)
    {
        this.color = color;
    }
    public boolean didCollide(GameObject other)
    {
        return this.getArea().intersects(other.getArea());
    }   
    public Rectangle getArea(){
      return new Rectangle(location.x,location.y,width,height);
    } 
    /**
     *  Any GameObject which can be casted on screen can move
     *  Screen first moves the GameObject and cast graphics on screen
     */
    @Override 
    public abstract void move();
    @Override
    public void castOnScreen(Graphics g)
    {
        g.setColor(this.color);
        
        switch(type)
        {
            case circle:
                g.fillOval(location.x, location.y, width, height);
                break;
            case rectangle:
                g.fillRect(location.x, location.y, width, height);
                break;
            case image:
                processImage(g);
        }
        design(g);
    }
    public abstract void design(Graphics g);
  
    public void processImage(Graphics g)
    {
        if(img!=null)
        g.drawImage(img, location.x, location.y, null); 
    }
}