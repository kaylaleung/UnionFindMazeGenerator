/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kayla
 */
public class Cell {
    
    private int x;
    private int y;
    private int id;
    private boolean hasBottom = true;
    private boolean hasRight = true;
    
    public Cell(int x, int y, int id)
    {
        this.x = x;
        this.y = y;
        this.id = id;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public void setID(int id)
    {
        this.id = id;
    }
    public int getID()
    {
        return id;
    }
    
    public boolean getBottom()
    {
        return hasBottom;
    }
    
    public boolean getRight()
    {
        return hasRight;
    }
    
    public void setBottom(boolean b)
    {
        this.hasBottom = b;
    }
    
    public void setRight(boolean b)
    {
        this.hasRight = b;
    }
     
}
