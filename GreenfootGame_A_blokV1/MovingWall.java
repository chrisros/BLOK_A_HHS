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
    
    int beweging = goUp;
    /**
     * Act - do whatever the MovingWall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       beweging(); 
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
        

