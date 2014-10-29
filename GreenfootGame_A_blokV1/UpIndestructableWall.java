import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * De snelheid van de UpIndestructableWall wordt hierin meegegeven.
 * 
 * @author (Chris Ros & Aaik Oosters)
 * @version (a version number or a date)
 */
public class UpIndestructableWall extends IndestructableWall
{
    /**
     * Act - do whatever the UpIndestructableWall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-speed);
    }    
}
