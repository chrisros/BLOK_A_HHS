import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;

/**
 * Afbeelding word hier aangemaakt, en de score wordt opgeteld. 
 * 
 * @author (Chris Ros & Aaik Oosters) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Actor
{
    public static int score = 0;
    
    public void act()
    
    {
        setImage(new GreenfootImage("Score: " + score, 50, Color.WHITE, null));
        hide();
    }
    
    private void hide()
    {
        if(Helicopter.gameOverBool)
        {
            //getWorld().removeObject(this);

            setImage(new GreenfootImage("Final score: " + ScoreBoard.score + "  Rockets Fired " + Helicopter.rocketsFired, 50,  Color.WHITE, null));
        }
    }
    
    public void addScore()
    
    {
        score++;
    }
}
