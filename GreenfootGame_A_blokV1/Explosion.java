import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Actor
{
    private int animationCount=1;
    private String explosionImage;
    
   //animeren van explosie
    private void explosionAnimation()
    {
        if (animationCount<7){
            animationCount++;
            
        } else {
            getWorld().removeObject(this);    
        }  
        explosionImage="ex"+animationCount+".png";
        setImage(explosionImage);
    }
  
    public void act() 
    {
       explosionAnimation(); 
       move(5);
    }    
}