import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MovingWall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovingWall extends Wall
{
    int goUp = -Greenfoot.getRandomNumber(3)-1; // snelheid omhoog
    int goDown = -goUp;                         // zelfde snelheid als omhoog naar beneden
    final int goDown_WAARDE = 100;              // Waarde wanneer naar boven
    final int goUp_WAARDE = 500;                // Waarde wanneer naar beneden
    int animationCount = 0;
    int beweging = goUp;
    private String helicopterImage = "helicopter0.png";

    public void act() 
    {
       beweging(); 
       heliAnimationCount();
    }
    
        //animeren van helicopter
    private void heliAnimationCount()
    {
        if(Helicopter.gameOverBool==false)
        {
            if (animationCount<3)
            {
            animationCount++;
            } else {
            animationCount=0;    
            }  
            helicopterImage="helicopterwall"+animationCount+".png";
            setImage(helicopterImage);
        }
    }
  
    
    public void beweging()
    
    {
       // Naar beneden 
       if (getY() <= goDown_WAARDE) {
           beweging = goDown; 
       }
       // Naar boven
       if (getY() == goUp_WAARDE ) {
           beweging = goUp; 
       }
       
       setLocation(getX(), getY()+ beweging);
       
       move(-speed); 
    }
     
       
    } 
        

