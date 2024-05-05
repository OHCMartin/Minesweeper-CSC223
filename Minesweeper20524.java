/**
 * Write a description of class Minesweeper10523 here.
 *
 * @author Oscar Martin
 * @version 2/05/24
 */
import java.util.Random;
import java.util.Scanner;
public class Minesweeper20524 {
    Scanner keyboard;
    /**
     * Constructor for objects of class Minesweeper10523
     */
    public Minesweeper20524() {
        Random rand = new Random();
        int number = rand.nextInt(10);
        System.out.println(number);
        Scanner keyboard = new Scanner(System.in);
        System.out.println(keyboard.nextInt());
        boolean[][] mineField = new boolean[10][10];
        boolean[][] mine = new boolean[10][10];
         boolean gameOver = false;
        int row = 9;
        int column = 0;
        int userPoints = 0;
        Scanner myObj = new Scanner(System.in);
          for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                mine[i][j] = false;
            }
        }
         mine[4][2] = true;
        for(int i=0; i<10; i++){
            System.out.println();
            for(int j=0; j<10; j++){
                System.out.print(" ~ ");
            }
        }
        while(gameOver == false){
            
            System.out.println();
            
            System.out.println("What row do you want to search?");
            row = myObj.nextInt();
            
            System.out.println("What column do you want to search?");
            column = myObj.nextInt();
            
            mineField[row][column] = true;

            
            updategarden(mineField, mine);
            
            if(mine[row][column]){
                userPoints +=1;
            }
            if(userPoints == 1){
                System.out.println("You found the carrot!");
                gameOver = true;
            }
            System.out.println();
        }
    }
    public static void updategarden(boolean[][] upgarden, boolean[][]carrot){
        System.out.print('\u000C');
        for(int i=0; i<10; i++){
            System.out.println();
            for(int j=0;j<10; j++){
                if(upgarden[i][j] == true && mine[i][j] == true){
                    System.out.print(" X ");
                }
                else if(upgarden[i][j] == true && mine [i][j] == false){
                    System.out.print(" O ");
                }
                else{
                    System.out.print(" ~ ");
                }
                }
        }
    }
}