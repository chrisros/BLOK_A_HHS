import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Button
{
    private int count=0;
      
    private void startingAnimation()
    {
         if (click==true)
        {
            
            if (count>40){
            setImage("startSplashScreen1.png");
            } else if(count>30){
            setImage("startSplashScreen2.png");
            }else if(count>20){
            setImage("startSplashScreen3.png");
            }else if(count>10){
            setImage("startSplashScreen4.png");
            }else if(count<1){
            Greenfoot.setWorld(new Gameworld());
            click = false;
            World world = getWorld();
            world.removeObject(this);
            }
            count--;
        }
    }
    

    
    public void act()
    {
        startingAnimation();
        checkClick();
    }
}
