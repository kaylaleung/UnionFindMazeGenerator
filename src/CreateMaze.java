
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kayla
 */

public class CreateMaze {
    
    private Cell[][] ID;
    int count = 0;
    private int[][] sz;
    int x;
    int y;
    
    public CreateMaze(int x, int y)
    {
        int id = 0;
        this.x = x;
        this.y = y;
        ID = new Cell[x][y];
        sz = new int[x][y];
        
        for(int i = 0; i < x; i++)
        {
            for(int j = 0; j < y; j++)
            {
                id++;
                ID[i][j] = new Cell(i,j,id);
                sz[i][j] = 1;
            }
        }
    }
    
    public int find(Cell a)
    {
        return a.getID();
    }
    
    public void union(Cell a, Cell b)
    {
        int aID = find(a);
        int bID = find(b);
        
        if (aID == bID)
        {
            return;
        }
        
        for(int i = 0; i < x; i++)
        {
            for(int j = 0; j < y; j++)
            {
                if(ID[i][j].getID() == aID)
                {
                    ID[i][j].setID(bID);
                }
            }
        }
    }
    
    public boolean connected(Cell a, Cell b)
    {
        return a.getID() == b.getID();
    }
    
    public void breakLink()
    {
        int choose = (int) (Math.random() * 2);
        int i1 = (int) (Math.random() * x);
        int j1 = (int) (Math.random() * y);
        
        if(choose == 0)
        {
            if(i1 < x - 1)
            {
                if(!connected(ID[i1][j1],ID[i1+1][j1]))
                {   
                    union(ID[i1][j1],ID[i1+1][j1]);
                    ID[i1][j1].setBottom(false);
                    System.out.println("Wall Break " + "(" + i1 + ", " + j1 + ")");
                }
            }
        }
        else
        {
            if(j1 < y - 1)
            {
                if(!connected(ID[i1][j1],ID[i1][j1+1]))
                {
                    union(ID[i1][j1],ID[i1][j1+1]);
                    ID[i1][j1].setRight(false);
                    System.out.println("Wall Break " + "(" + i1 + ", " + j1 + ")");
                }
            }
        }
  
    }
    
    public void breakAll()
    {
        boolean allConnected = false;
        while(!allConnected)
        {            
            breakLink();
            allConnected = true;
            
            loop:
            {
                for(int i = 0; i < x; i++)
                {
                    for(int j = 0; j < y; j++)
                    {
                        if(!connected(ID[0][0],ID[i][j])) 
                        {
                            allConnected = false;

                            break loop;
                        }
                    }
                }
            }
        }
      
    }
    
    public String printMaze()
    {
        String s = "";
        int k = y;
        while(k > 0)
        {
            s = s + " __";
            k--;
        }
        s = s + "\n";
       
        for(int i = 0; i < x; i++)
        {
            s = s + "|";
            
            for(int j = 0; j < y; j++)
            {
                if(ID[i][j].getBottom())
                {
                        s = s + "__";
                }
                else
                {
                        s = s + "  ";
                }
                if(ID[i][j].getRight())
                {
                    s = s + "|";
                }
                else 
                {
                    s = s + " ";
                }
            }
            
            s = s + "\n";
                
        }
           
        return s;
        
    }
}
