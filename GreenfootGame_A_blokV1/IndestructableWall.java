import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * De snelheid van de IndestructableWall wordt hierin meegegeven.
 * 
 * @author (Chris Ros & Aaik Oosters)
 * @version (a version number or a date)
 */

public class IndestructableWall extends Wall
{
    public void act() 
    {
       move(-speed);       
    }
}
    
