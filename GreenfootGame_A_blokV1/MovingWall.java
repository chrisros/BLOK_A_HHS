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
       checkRand();      
       
        
    }
    
    
    private void checkRand(){
        if (MovingWall.this != null || isAtEdge())
        {
            World world = getWorld();
            setLocation(getX(), getY()-2);
            
        } else { setLocation(getX(), getY()+2); }
        
    }
    
    
    } 
        

