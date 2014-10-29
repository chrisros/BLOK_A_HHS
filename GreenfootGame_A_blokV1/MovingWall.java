import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Hierin worden de bewegingen van de MovingWall (plaatje is een helicopter) aangemaakt en meegeven
 * 
 * @author (Chris Ros & Aaik Oosters)
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
    
        //animeren van muur
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
  
        //beweging van de muur
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
        

