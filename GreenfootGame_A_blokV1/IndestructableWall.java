import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IndestructableWall here.
 * 
 * @author (your name) 
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
    
