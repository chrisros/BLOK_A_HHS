import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sky extends World
{

    /**
     * Constructor for objects of class Sky.
     * 
     */
    public Sky()
    {    
        // Create a new world with 1200x600 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1); 
        addObject( new Helicopter(), 400, 300 );
        addObject( new IndestructableWall(), 1200, 600);
        
        addObject( new IndestructableWall(), 1600, 000);
        addObject( new IndestructableWall(), 1600, 000);
        
        addObject( new MovingWall(), 500, 500);

        
    }
    
}
