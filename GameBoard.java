import java.util.ArrayList;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game Board for Triples
 * 
 * @author Drake Fruhauf 
 * @version number dont know at this point
 */
public class GameBoard extends World
{
    private final int NUM_CARDS_IN_DECK = 27;
    
    public GameBoard()
    {   
        super(430, 600, 1, false); 
        //new Tester(NUM_CARDS_IN_DECK);
        Dealer dealer = new Dealer(NUM_CARDS_IN_DECK);
        addObject(dealer,-30, -30);
        addObject(new Player(dealer), -100, -100);
    }
    
    
}
