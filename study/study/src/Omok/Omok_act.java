package Omok;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Omok_act{
    Scanner sc = new Scanner(System.in);
    int [][] board = new int[10][10];
    int [][] borad_int = new int[10][10];
    int turn;           // turn : even -> 1st, odd -> 2nd
    int x_;
    int y_;


    public boolean isCoordinate(String str){            // coordinate 1,1 ~ 10,10 check
        return Pattern.matches("^([1-9]|10),([1-9]|10)$", str);
    } 

    public void start(){            // before starting the game
        this.turn = 0;
        for(int i = 0; i < 10; i++){
            Arrays.fill(board[i], 0);
            Arrays.fill(this.borad_int[i], 100);
        }
    }
    public void show_board(){           // screen
        for(int i = 0; i < Array.getLength(board); i++){
            System.out.print(Arrays.toString(board[i]));
            System.out.println("");
        }
    }

    public void turn_(){                // action -> save into board
        System.out.print("P" + (this.turn % 2 + 1) +"turn(x <= 10, y <= 10) >>");
        String[] temp;
        String input;
        while(true){
            while(true){                    // form check
                input = sc.nextLine();           
                if(isCoordinate(input))
                    break;          
                System.out.print("retry(x,y) >> ");
            }    
            temp = input.split(",");

            String x = temp[0];              // x
            this.x_ = Integer.parseInt(x) - 1;
            int x_ = this.x_;

            String y = temp[1];               // y
            this.y_ = Integer.parseInt(y) - 1;
            int y_ = this.y_;

            if(board[x_][y_] == 0)    break;        // place check

            System.out.print("invalid coordinate. retry. >>");
        }

        if(this.turn % 2 == 0){board[x_][y_] = 1;    this.borad_int[x_][y_] = 1;}
        else                  {board[x_][y_] = 2;    this.borad_int[x_][y_] = 2;}

        this.turn++;
    }

    public boolean win(){
        int sum = 0;
        int i, j, k = 0;
        for(i = 0; i < 6; i++){                // width check(→)
            for(j = 0; j < 10; j++){
                for(k = 0; k < 5; k++)  sum += this.borad_int[i+k][j];
                if(sum == 5 | sum == 10){
                    System.out.println("P" + sum/5 + " win!");
                    return true;
                }
                sum = 0;  
            }
        }                                   
        for(i = 0; i < 10; i++){                // length check(↓)
            for(j = 0; j < 6; j++){
                for(k = 0; k < 5; k++)  sum += this.borad_int[i][j+k];
                if(sum == 5 | sum == 10){
                    System.out.println("P" + sum/5 + " win!");
                    return true;
                }
                sum = 0;  
            }
        }
        for(i = 0; i < 6; i ++){               // diagonal check(↘)
            for(j = 0; j < 6; j++){
                for(k = 0; k < 5; k++)  sum += this.borad_int[i+k][j+k];
                if(sum == 5 | sum == 10){
                    System.out.println("P" + sum/5 + " win!");
                    return true;
                }
                sum = 0;
            }
        }
        for(i = 4; i < 10; i++){                // diagonal check(↙)
            for(j = 4; j < 10; j++){
                for(k = 0; k >-5; k--)  sum += this.borad_int[i+k][j+k];
                if(sum == 5 | sum == 10){
                    System.out.println("P" + sum/5 + " win!");
                    return true;
                }
                sum = 0;
            }
        }
        return false;
    }    
}