import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DownIndestructableWall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DownIndestructableWall extends IndestructableWall
{
    /**
     * Act - do whatever the DownIndestructableWall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(-speed);
    }    
}
