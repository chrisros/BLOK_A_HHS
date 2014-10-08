import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{

    
    private void wallCollide(){
        if(isTouching(MovingWall.class)||isTouching(IndestructableWall.class)||isAtEdge()){
            getWorld().removeObject(this);
        } else if (isTouching(DestructableWall.class)){
           removeTouching(DestructableWall.class);
           getWorld().removeObject(this);
        }
    }
    

    
    public void act() 
    {
       wallCollide();
       move(20);    
    }    

   
    }

