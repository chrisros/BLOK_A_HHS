import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
    boolean click = false;
    
    private void checkClick()
    {
        click=Greenfoot.mouseClicked(this);
        if(click==true)
        {
            World world = getWorld();
            world.removeObject(this);
        }
        
    }
   
    public void act() 
    {
        checkClick();
    }    
}
