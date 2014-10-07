import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sky extends World
{
    private int counter;
    
   
    public Sky()
    {         
       super(1200, 600, 1, false); 
       //Greenfoot.playSound("darude.wav");
        addObject( new Helicopter(), 400, 300 );
       
        addObject( new MovingWall(), 600, 500);

        
    }
    
    public static void getRandomNumber() {
        int limit = 500;
        int min = 300;
        
    }
    
    public void act()
    {
       counter++;
       if (counter == 250) {
           IndestructableWall muurtje = new IndestructableWall();
           
           GreenfootImage image = muurtje.getImage();
           
           addObject(muurtje, getWidth(), getHeight()+ image.getHeight() -300);    
           counter = 0;
        }
    }
    
    
    /*    public static gameOver() 
    {
        
    }
    */
}
