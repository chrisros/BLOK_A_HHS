import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sky extends World
{
    private int counter1;
    private int counter2;
    int SPACE_BETWEEN_MUREN = 200;
    //int hoogteRandom = Greenfoot.getRandomNumber(800) +300;
    
  
    public Sky()
    {         
       super(1200, 600, 1, false); 
       //Greenfoot.playSound("darude.wav");
        addObject( new Helicopter(), 400, 300 );
        addObject( new MovingWall(), 100, 100);
        setPaintOrder(IndestructableWall.class, DestructableWall.class);

        
    }
   
    public static void getRandomNumber() {
        int limit = 500;
        int min = 300;
        
    }
    
    private void spawnWalls()

    {
       counter1++;
       if (counter1 == 250) {
           DownIndestructableWall downMuur = new DownIndestructableWall();           
           GreenfootImage downImage = downMuur.getImage();

           addObject(downMuur, getWidth(), getHeight()+ downImage.getHeight()-(Greenfoot.getRandomNumber(400) +300));    
           
           UpIndestructableWall upMuur = new UpIndestructableWall();
           addObject(upMuur, getWidth(), downMuur.getY() - downImage.getHeight() -SPACE_BETWEEN_MUREN );
           
           addObject(downMuur, getWidth(), getHeight()+ downImage.getHeight()-(Greenfoot.getRandomNumber(400) +300));
           counter1 = 0;
        }
        counter2++;
       if (counter2 == 750) {
           DestructableWall destruct = new DestructableWall();
           GreenfootImage destructImage = destruct.getImage();
           addObject(destruct, getWidth(), getHeight()/2);
           
           counter2 = 0;
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
