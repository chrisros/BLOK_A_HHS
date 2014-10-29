import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * De snelheid van de DestructableWall wordt hierin aagegeven
 * 
 * @author (Chris Ros & Aaik Oosters) 
 * @version (a version number or a date)
 */
public class DestructableWall extends Wall
{
    //super(50, 400, 2); 
    public void act() 
    {
        // Add your action code here.
        
        move(-speed);
    }    
}
