import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * De snelheid van de IndestructableWall wordt hierin meegegeven.
 * 
 * @author (Chris Ros & Aaik Oosters)
 * @version (a version number or a date)
 */

// Ik dacht misschien is het handig om nog een sub te maken bij deze met boven en onder indestructableWall


public class IndestructableWall extends Wall
{
    public void act() 
    {
       move(-speed);
       
    }
}
    
