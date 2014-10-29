import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gameover extends Button
{
    public void check()
    {
        
        if(click==true)
        {
            Greenfoot.setWorld(new Sky());
            click = false;
            //World world = getWorld();
            //world.removeObject(this);
            
        } 
    } 


    public void act()
    {
        checkClick();
        check();
    }
}
