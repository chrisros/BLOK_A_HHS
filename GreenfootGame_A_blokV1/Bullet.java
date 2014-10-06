import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{

    
    public void act() 
    {
        if (Greenfoot.isKeyDown("space")){
          //addObject( new Bullet(), setLocation(xLocation, Ylocation));  
        }
        move(30);
    }    
    
   
    }

