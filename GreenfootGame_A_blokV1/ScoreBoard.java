import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;

/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Actor
{
    public static int score;
    
    public ScoreBoard()
    {
        score = 0;
    }
    
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
