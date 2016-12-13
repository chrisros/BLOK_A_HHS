import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MovingWall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovingWall extends Wall
{

    int dyDown = 2;
    int dyUp = 2;
    /**
     * Act - do whatever the MovingWall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move(-2); 
              
      setLocation(getX(), getY() + dyDown);
           
       // If muur touch de edge of the world, go to the other way
       
       if (getY() == 600) {
           setLocation(getX(), getY()+8);
        }

    }
}

