import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
        private void checkWallHit()
    {
        DestructableWall wall = (DestructableWall) getOneIntersectingObject(DestructableWall.class);
        if (wall != null){
            getWorld().removeObject(this);
            getWorld().removeObject(wall);
        //} else if (getOneIntersectingObject(Wall.class)){
        //    getWorld().removeObject(this);
        }
    }
    
    public void act() 
    {
            
       move(30);
    }    
    // test 1
    // test 2j
   
    }

