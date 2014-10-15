import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MovingWall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovingWall extends Wall
{
    int GO_UP = -Greenfoot.getRandomNumber(3)-1;
    int GO_DOWN = Greenfoot.getRandomNumber(3)+1;
    final int GO_DOWN_WAARDE = 100;
    final int GO_UP_WAARDE = 500;
    
    int beweging = GO_UP;
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
       if (getY() <= GO_DOWN_WAARDE) {
           beweging = GO_DOWN; 
       }
       if (getY() == GO_UP_WAARDE ) {
           beweging = GO_UP; 
       }
       
       setLocation(getX(), getY()+ beweging);
       
       move(-speed); 
    }
     
       
    } 
        

