import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Helicopter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Helicopter extends Actor
{
    private void checkCollision()
    {
        Actor a = getOneIntersectingObject(Wall.class);
        if (a != null)
        {
            World world = getWorld();
            world.addObject(new Explosion(), getX(), getY());
            world.removeObject(this); // remove rocket from world
            //world.gameOver(); // error: this will not work
        }
    }
    
    private void movement(){
             if(Greenfoot.isKeyDown("up")){
        setLocation(getX(), getY()-8);  
        } else if (Greenfoot.isKeyDown("down")){
        setLocation(getX(), getY()+8);   }
    }
    
    private void shoot(){
        if(Greenfoot.isKeyDown("space")){
        
        }
    }
    
    public void act() 
    {
        movement();
        checkCollision();
    }
    
    
    }    

