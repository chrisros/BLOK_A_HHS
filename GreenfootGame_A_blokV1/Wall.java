import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Hierin word de speed van de muren aangemaakt en meegegeven.
 * 
 * @author (Chris Ros & Aaik Oosters) 
 * @version (a version number or a date)
 */
public class Wall extends Actor
{
    public static int speed = 2;
    private int timer = 0;
        
    public void act() 
    {
        timer++;
        
        if (timer % 2500 == 0)
        {
            speed++;
        }
        move(-speed);
    }    
}
