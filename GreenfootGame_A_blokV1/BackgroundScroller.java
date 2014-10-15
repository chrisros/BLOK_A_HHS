import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackgroundScroller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackgroundScroller extends Actor
{
    int i = 0;
    private void scroll()
    {
        if (i < 10)
        {
            i++;
        } else
        {
           move(-1);
           i = 0;
        }
     
    }

    public void act() 
    {
        scroll();
    }    
}
