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
        if(isTouching(Wall.class)){
        getWorld().removeObject(this);
        }
    }
    
        private void outOfBounds(){
            if(isAtEdge()){
            getWorld().removeObject(this);
            }
        }
    
    public void act() 
    {
       removeTouching(DestructableWall.class);     
       move(30);
       outOfBounds();
       wallCollide();
    }    
    // test 1
    // test 2j
   
    }

