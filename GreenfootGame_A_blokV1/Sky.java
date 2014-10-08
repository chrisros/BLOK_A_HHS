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
    int SPACE_BETWEEN_MUREN = 200;
   
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
    
    private void spawnWalls()
    {
       counter++;
       if (counter == 250) {
           DownIndestructableWall downMuur = new DownIndestructableWall();           
           GreenfootImage downImage = downMuur.getImage();
           addObject(downMuur, getWidth(), getHeight()+ downImage.getHeight()-(Greenfoot.getRandomNumber(400) +300));  
 
            UpIndestructableWall upMuur = new UpIndestructableWall();
           addObject(upMuur, getWidth(), downMuur.getY() - downImage.getHeight() -SPACE_BETWEEN_MUREN ); 

           
           counter = 0;
        }
    }
    
    
public void act()
    {
        spawnWalls();
    }
    
    
    /*    public static gameOver() 
    {
        
    }
    */
}
