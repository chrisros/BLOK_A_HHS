import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IndestructableWall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

// Ik dacht misschien is het handig om nog een sub te maken bij deze met boven en onder indestructableWall


public class IndestructableWall extends Wall
{
    /**
     * Act - do whatever the IndestructableWall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move(-4);
        /* if(Greenfoot.isKeyDown("w")){
        /*    setLocation(getX(), getY()-8)
         * } else if (Greenfoot.isKeyDown("s")) {
         * setLocation(getX(), getY()+8); 
         *} else if (Greenfoot.isKeyDown("d") { move(2);}   }
         */
    }

      
}
