import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends Actor
{
    public static int speed = 2;
    int timer = 0;
    public void act() 
    {
        timer++;
        
        if (timer % 2500 == 0)
        {
            speed++;
        }
        move(-speed);
    }    
}
