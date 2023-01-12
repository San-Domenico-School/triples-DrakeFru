import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card extends Actor
{
    public enum Shape
    {
        TRIANGLE, RECTANGLE, CIRCLE, NO_SHAPE
    }
    
    public enum Color
    {
        RED, GREEN, BLUE, NO_COLOR
    }
    
    private Shape shape;
    private Color color;
    private boolean isSelected;
    private GreenfootImage cardImage, selectedCardImage;
    private int numberOfShapes, shading;
    
    public Card(Shape shape, Color color, int numberOfShapes, int shading, GreenfootImage cardImage, 
                GreenfootImage selectedCardImage)
    {
        this.shape = shape;
        this.color = color;
        this.numberOfShapes = numberOfShapes;
        this.shading = shading;
        this.cardImage = cardImage;
        this.selectedCardImage = selectedCardImage;
        setImage(cardImage);
    }
    
    public Shape getShape()
    {
        return shape;
    }
    
    public Color getColor()
    {
        return color;
    }
    
    public int getNumberOfShapes()
    {
        return numberOfShapes;
    }
    
    public int getShading()
    {
        return shading;
    }
    
    public GreenfootImage getCardImage()
    {
        return cardImage;
    }
    
    public GreenfootImage getSelectedCardImage()
    {
        return selectedCardImage;
    }
    
    public void setIsSelected(boolean isSelected)
    {
        this.isSelected = isSelected;
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
