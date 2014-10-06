import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sky extends World
{
    
   
    public Sky()
    {         
       super(1200, 600, 1); 
       //Greenfoot.playSound("darude.wav");
        addObject( new Helicopter(), 400, 300 );
        addObject( new IndestructableWall(), 1200, 600);
        
        addObject( new IndestructableWall(), 1600, 000);
        addObject( new IndestructableWall(), 1600, 000);
        
        addObject( new MovingWall(), 600, 500);

        
    }
    
    public void act()
    {
       counter++;
       if (counter == 150) {
           IndestructableWall muurtje = new IndestructableWall();
           addObject(muurtje, getWidth(), getHeight()/2);    
           counter = 0;
        }
    }
    
    
    /*    public static gameOver() 
    {
        
    }
    */
}
