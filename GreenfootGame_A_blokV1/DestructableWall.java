import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * De snelheid van de DestructableWall wordt hierin aagegeven
 * 
 * @author (Chris Ros & Aaik Oosters) 
 * @version (a version number or a date)
 */
public class DestructableWall extends Wall
{

    public void act() 
    {
        move(-speed);
    }    
}
