import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Hierin start je het spel, wanneer run is geklikt, opent zich de Gameworld
 * 
 * @author (Chris Ros & Aaik Oosters) 
 * @version (a version number or a date)
 */
public class Sky extends World
{
   public Sky ()
   {    
       super(1200, 600, 1, false); 
        
        addObject( new Start(), 600, 300);  
    }
   
    
   public void act()
   {
       
   }
    
}
