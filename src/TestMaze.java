
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kayla
 */
public class TestMaze {
    
    public static void main(String[] args)
    {
        
        System.out.println("Enter Dimensions of Maze:");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        CreateMaze a = new CreateMaze(x,y);
        
        a.breakAll();
        System.out.println(a.printMaze());
 
    }
}

/* OUTPUT

Enter Dimensions of Maze:
12 8
 __ __ __ __ __ __ __ __
|  |__   |     |  |  |  |
|__ __    __|__   |  |  |
|__       __   |__    __|
|  |__|   __|  |  |  |  |
|__ __ __|__ __|__      |
|__ __   |__      |  |  |
|  |__    __   |__   |  |
|__ __ __   |   __|__|__|
|  |  |     |  |      __|
|   __   |__|__ __|  |  |
|   __|__    __   |     |
|__|__ __ __|__ __|__|__|

BUILD SUCCESSFUL (total time: 6 seconds)

Enter Dimensions of Maze:
15 15
 __ __ __ __ __ __ __ __ __ __ __ __ __ __ __
|      __   |     |__   |   __ __      |     |
|__|__ __|__   |  |__ __ __|     |  |__|__|  |
|__ __    __   |     |   __|__|   __ __|   __|
|__    __|     |__|  |      __   |   __|  |  |
|   __   |  |__|  |__|__|  |   __ __|  |__   |
|   __|__|__|  |  |__ __   |      __   |     |
|__      |  |   __|  |__ __|__|__|   __   |__|
|  |__|  |   __|__ __    __      |__|  |     |
|  |        |  |__   |__|__   |__|__ __   |__|
|   __|  |__   |__    __ __|__ __       __   |
|   __|  |__       __   |__    __|__|     |  |
|__ __|   __|__|   __|__ __ __    __|  |__|  |
|__    __ __|  |__ __|   __|  |      __   |__|
|__    __ __   |  |  |  |  |   __|  |__   |  |
|__ __|__ __ __|__ __ __ __ __ __|__ __|__ __|

BUILD SUCCESSFUL (total time: 2 seconds)

Enter Dimensions of Maze:
4 4
 __ __ __ __
|__    __   |
|__   |  |  |
|  |     |  |
|__ __|__|__|

BUILD SUCCESSFUL (total time: 3 seconds)

Enter Dimensions of Maze:
15 15
Wall Break (11, 10)
Wall Break (13, 0)
Wall Break (1, 5)
Wall Break (8, 0)
Wall Break (8, 1)
Wall Break (1, 11)
Wall Break (11, 7)
Wall Break (0, 2)
Wall Break (8, 7)
Wall Break (6, 7)
Wall Break (2, 13)
Wall Break (10, 11)
Wall Break (7, 10)
Wall Break (14, 13)
Wall Break (1, 7)
Wall Break (1, 11)
Wall Break (0, 9)
Wall Break (1, 3)
Wall Break (14, 3)
Wall Break (12, 7)
Wall Break (11, 11)
Wall Break (13, 5)
Wall Break (10, 4)
Wall Break (8, 6)
Wall Break (12, 9)
Wall Break (5, 9)
Wall Break (2, 14)
Wall Break (3, 10)
Wall Break (10, 10)
Wall Break (13, 4)
Wall Break (5, 3)
Wall Break (3, 1)
Wall Break (4, 7)
Wall Break (1, 13)
Wall Break (7, 4)
Wall Break (10, 10)
Wall Break (2, 1)
Wall Break (0, 3)
Wall Break (14, 1)
Wall Break (0, 6)
Wall Break (3, 9)
Wall Break (13, 10)
Wall Break (2, 3)
Wall Break (11, 2)
Wall Break (0, 7)
Wall Break (2, 2)
Wall Break (9, 11)
Wall Break (4, 3)
Wall Break (4, 10)
Wall Break (13, 1)
Wall Break (8, 6)
Wall Break (11, 5)
Wall Break (5, 11)
Wall Break (4, 12)
Wall Break (13, 4)
Wall Break (12, 13)
Wall Break (14, 9)
Wall Break (6, 8)
Wall Break (4, 9)
Wall Break (7, 12)
Wall Break (10, 13)
Wall Break (11, 13)
Wall Break (3, 0)
Wall Break (4, 4)
Wall Break (13, 10)
Wall Break (10, 2)
Wall Break (5, 0)
Wall Break (4, 8)
Wall Break (2, 0)
Wall Break (4, 1)
Wall Break (3, 0)
Wall Break (3, 2)
Wall Break (7, 11)
Wall Break (11, 6)
Wall Break (2, 12)
Wall Break (8, 13)
Wall Break (1, 0)
Wall Break (9, 7)
Wall Break (3, 10)
Wall Break (5, 8)
Wall Break (10, 5)
Wall Break (5, 3)
Wall Break (6, 6)
Wall Break (4, 6)
Wall Break (8, 2)
Wall Break (6, 13)
Wall Break (6, 5)
Wall Break (5, 12)
Wall Break (0, 6)
Wall Break (4, 5)
Wall Break (13, 5)
Wall Break (1, 0)
Wall Break (4, 10)
Wall Break (3, 7)
Wall Break (10, 13)
Wall Break (2, 13)
Wall Break (3, 4)
Wall Break (2, 9)
Wall Break (5, 10)
Wall Break (0, 2)
Wall Break (12, 2)
Wall Break (5, 6)
Wall Break (6, 9)
Wall Break (12, 0)
Wall Break (11, 3)
Wall Break (12, 3)
Wall Break (14, 7)
Wall Break (8, 7)
Wall Break (6, 3)
Wall Break (11, 1)
Wall Break (2, 8)
Wall Break (13, 13)
Wall Break (9, 3)
Wall Break (5, 4)
Wall Break (9, 1)
Wall Break (3, 3)
Wall Break (1, 12)
Wall Break (6, 10)
Wall Break (13, 2)
Wall Break (3, 11)
Wall Break (12, 10)
Wall Break (8, 9)
Wall Break (12, 2)
Wall Break (2, 6)
Wall Break (12, 13)
Wall Break (11, 1)
Wall Break (0, 3)
Wall Break (3, 7)
Wall Break (13, 2)
Wall Break (4, 11)
Wall Break (7, 2)
Wall Break (12, 4)
Wall Break (9, 0)
Wall Break (5, 11)
Wall Break (14, 6)
Wall Break (10, 6)
Wall Break (10, 8)
Wall Break (4, 2)
Wall Break (11, 7)
Wall Break (2, 10)
Wall Break (13, 6)
Wall Break (2, 7)
Wall Break (5, 5)
Wall Break (9, 0)
Wall Break (9, 7)
Wall Break (11, 10)
Wall Break (8, 2)
Wall Break (12, 9)
Wall Break (12, 12)
Wall Break (9, 5)
Wall Break (9, 1)
Wall Break (8, 5)
Wall Break (6, 4)
Wall Break (1, 10)
Wall Break (9, 10)
Wall Break (10, 7)
Wall Break (5, 6)
Wall Break (0, 7)
Wall Break (12, 8)
Wall Break (11, 9)
Wall Break (8, 8)
Wall Break (13, 8)
Wall Break (1, 9)
Wall Break (9, 2)
Wall Break (6, 3)
Wall Break (6, 12)
Wall Break (2, 6)
Wall Break (11, 3)
Wall Break (2, 9)
Wall Break (12, 10)
Wall Break (0, 0)
Wall Break (1, 8)
Wall Break (7, 0)
Wall Break (8, 11)
Wall Break (5, 1)
Wall Break (7, 9)
Wall Break (6, 6)
Wall Break (1, 4)
Wall Break (13, 3)
Wall Break (10, 12)
Wall Break (6, 9)
Wall Break (5, 12)
Wall Break (10, 8)
Wall Break (13, 11)
Wall Break (13, 7)
Wall Break (8, 12)
Wall Break (9, 4)
Wall Break (13, 8)
Wall Break (1, 12)
Wall Break (6, 1)
Wall Break (0, 10)
Wall Break (12, 5)
Wall Break (8, 3)
Wall Break (4, 0)
Wall Break (3, 14)
Wall Break (8, 14)
Wall Break (9, 13)
Wall Break (11, 0)
Wall Break (14, 0)
Wall Break (0, 13)
Wall Break (10, 3)
Wall Break (9, 9)
Wall Break (1, 3)
Wall Break (9, 12)
Wall Break (6, 1)
Wall Break (13, 12)
Wall Break (7, 8)
Wall Break (7, 4)
Wall Break (7, 13)
Wall Break (0, 14)
Wall Break (0, 11)
Wall Break (14, 11)
Wall Break (3, 5)
Wall Break (0, 10)
Wall Break (5, 14)
Wall Break (14, 12)
Wall Break (6, 14)
Wall Break (6, 0)
Wall Break (0, 4)
Wall Break (2, 5)
Wall Break (5, 2)
Wall Break (7, 14)
Wall Break (11, 14)
Wall Break (0, 0)
 __ __ __ __ __ __ __ __ __ __ __ __ __ __ __
|   __|      __ __|      __|  |   __ __|  |  |
|   __|__|     |__ __|__ __ __ __       __ __|
|__   |__   |__|__    __ __    __ __|__      |
|     |  |__   |__ __|   __|  |   __ __|__|  |
|  |__ __   |  |  |  |  |  |  |   __ __ __|__|
|__   |__    __ __    __|  |  |  |      __|  |
|  |   __|   __   |     |__    __ __|__   |  |
|  |__|  |__|   __|__|__|__   |  |__ __   |  |
|  |  |   __ __|__       __ __ __|  |  |__   |
|      __ __ __   |__|   __|__ __   |  |__ __|
|__|__|__ __ __   |  |  |   __|   __ __    __|
|__    __    __|__ __    __|  |   __ __|  |  |
|  |__|   __ __ __ __|  |__       __|__    __|
|  |  |   __         |__    __|   __   |__ __|
|__ __ __|__ __|__|__ __ __|__ __|__ __ __ __|

*/
