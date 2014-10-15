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
        System.out.println("hallo"); 
        goFaster();
        
        if (timer % 250 == 0)
        {
            speed++;
        }
        move(speed);
    }
    
       
    public void goFaster()
    {
        
    }
}
