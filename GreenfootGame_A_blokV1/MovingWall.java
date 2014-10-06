import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MovingWall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovingWall extends Wall
{
    /**
     * Act - do whatever the MovingWall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       {
       //if(Greenfoot.isKeyDown("up")){
       // setLocation(getX(), getY()-8);  
       // } else if (Greenfoot.isKeyDown("down")){
       // setLocation(getX(), getY()+8); 
       move(-2);
       int i = 0;
       if ( i <= 3)
       {
           i++;
           move(4);
       } else { 
           move(-4);
           i = 0;
        }
    }
    
    
    } 
    }    

