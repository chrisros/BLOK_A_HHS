import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackgroundScroller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackgroundScroller extends Actor
{
    int moveSmooth = 0;
    private void scroll()
    {
        if (moveSmooth < 10)
        {
            moveSmooth++;
        } else
        {
           move(-1);
           moveSmooth = 0;
        }
     
    }

    public void act() 
    {
        scroll();
    }    
}
