import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{   
    public boolean click = false;
    
    public void checkClick()
    {
        click=Greenfoot.mouseClicked(this);
    }
   
    public void act() 
    {
        checkClick();     
    }    
}