import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Helicopter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Helicopter extends Actor
{
    //public int xLocation = getX();
    //public int yLocation = gety();
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("up")){
        setLocation(getX(), getY()-8);  
        } else if (Greenfoot.isKeyDown("down")) {
         setLocation(getX(), getY()+8);
        }
    }
    
    
}
