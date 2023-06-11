package Cal;

import java.util.Scanner;
import Omok.*;
import java.util.InputMismatchException;

class Calculation{
    Scanner sc = new Scanner(System.in);
    double prev = 0;                
    double num = 0;
    int New = 0;
    int continue_;
    public boolean check_int(){
        return this.prev % 1 == 0.0;
    }
    public boolean check_int_num(){
        return this.num % 1 == 0.0;
    }             
    
    public void start(){           // scan number(s)
        if(this.New == 0){
            System.out.print("Enter 1 number >> ");
            this.continue_ = 1;
            this.prev = sc.nextDouble();
            this.New++; 
        }
    }
    

    public void menu(int first){
        if(first == 0)
            System.out.print("plus : '+', minus : '-', multiply : '*', division : '/', quotient : '//'" +
                                "\nfactorial : '!', root : 'rt', square : 'sq', absolute val : 'abs' " +
                                "\nnatural log : 'ln', log10 : 'log', 10 -> 2 : '2', 2 -> 10 : '10'"+
                                "\nsin : 'sin', cos : 'cos', tan : 'tan' "+
                                "\ncancle all : 'c', exit : 'exit'>> ");
        else
            System.out.print("+, -, *, /, //, !, rt, sq, abs, ln, log, 2, 10, sin, cos, tan, c, exit >> ");
    }
    public void func(){
        String sel = sc.next();
        switch(sel){
            case("+"):      num_set();          plus();             break;
            case("-"):      num_set();          minus();            break;
            case("*"):      num_set();          multiply();         break;
            case("/"):      num_set();          division();         break;
            case("//"):     num_set();          quotient_cal();     break;
            case("!"):                          factorial();        break;
            case("rt"):                         root();             break;
            case("sq"):                         square();           break;
            case("abs"):                        abs();              break;
            case("ln"):                         ln();               break;
            case("log"):                        log10();            break;
            case("2"):                          ConvertTo2();       break;
            case("10"):                         ConvertTo10();      break;
            case("sin"):                        sin();              break;
            case("cos"):                        cos();              break;
            case("tan"):                        tan();              break;
            case("c"):      this.New = 0;                           break;
            case("exit"):   this.continue_ = 0;                     break;
        }
    }
    public void num_set(){
        System.out.println("Enter 1 number>>");
        this.num = sc.nextDouble(); 
    }   
    
    public void plus(){             // +
        this.prev += this.num;
        System.out.println(this.prev);
    }
    public void minus(){            // -
        this.prev -= this.num;
        System.out.println(this.prev);
    }
    public void multiply(){         // *
        this.prev *= this.num;
        System.out.println(this.prev);
    }
    public void division(){         // /        check : zero division error
        if (this.num == 0){
            System.out.println("zero division error");
            return;
        }
        this.prev /= this.num;
        System.out.println(this.prev);
    }
    public void quotient_cal(){     // share, mod
        if(check_int() != true){
            System.out.println("not an integer");
            return;
        }
        int prev = (int) this.prev;
        int num = (int) this.num;
        System.out.println("Share :" + Math.floorDiv(prev, num) + "\nMod :" + Math.floorMod(prev, num));
    }
    public void factorial(){         // !
        if(check_int() != true){
            System.out.println("not an integer");
            return;
        }
        int prev = (int) this.prev;
        if(prev <= 1){
            System.out.println(1);
        }
    }
    public void root(){                     // root
        this.prev = Math.sqrt(this.prev);
        System.out.println(this.prev);
    }
    public void square(){                   // square(**2)
        this.prev = Math.pow(this.prev, 2);
        System.out.println(this.prev);
    }
    public void abs(){                      // abs(|n|)
        this.prev = Math.abs(this.prev);
        System.out.println(this.prev);
    }
    public void ln(){                       // ln(n)
        this.prev = Math.log(this.prev);
        System.out.println(this.prev);
    }
    public void log10(){                    // log10(n)
        this.prev = Math.log10(this.prev);
        System.out.println(this.prev);
    }
    public void ConvertTo2(){               // 10 -> 2          
        if(check_int() != true){
            System.out.println("not an integer");
            return;
        }
        int prev = (int) this.prev;
        String binaryString = Integer.toBinaryString(prev);
        System.out.println(binaryString);
    }
    public void ConvertTo10(){              // 2 -> 10      1. is integer? 2. is binary?
        if(check_int() != true){
            System.out.println("not an integer");
            return;
        }
        int prev_ = (int) this.prev;
        String prev = Integer.toString(prev_);
        for(int i = 0; i < prev.length(); i++){
            if(prev.charAt(i) == '0' || prev.charAt(i) == '1')  continue;
            else    System.out.println("not binary");  
        }
        int binaryTo = Integer.parseInt(prev, 2);
        System.out.println(binaryTo);
        this.prev = binaryTo;
    }
    public void sin(){                      // sin
        this.prev = Math.sin(this.prev);
        System.out.println(this.prev);
    }                   
    public void cos(){                      // cos
        this.prev = Math.cos(this.prev);
        System.out.println(this.prev);
    }
    public void tan(){                      // tan
        this.prev = Math.tan(this.prev);
        System.out.println(this.prev);
    }
}

class Omok_{                                // Omok
    boolean win = false;
    Omok_act play = new Omok_act();
    void play(){
        play.start();
        while(true){
            play.show_board();
            play.turn_();
            this.win = play.win();
            if(this.win == true) {play.show_board(); break;}
        }
    }
}

public class calculater {
    public static void main(String[] args){
        Calculation cal = new Calculation();
        Omok_ omok_ = new Omok_();
        Scanner sc = new Scanner(System.in);
        int first_time = 0;
        int answer;
        while(true){
            System.out.print("input number(1: calculater, 2: Omok, 3: close) >>");
            while(true){
                try{
                answer = sc.nextInt();
                break;
                }
                catch(InputMismatchException e){
                    sc.next();
                    System.out.print("enter number >> ");
                }
            }
            if(answer == 1){                            // calculater
                while(true){
                    cal.start();
                    cal.menu(first_time++);           // The entire menu is shown only once
                    cal.func();
                    if(cal.continue_ == 0)  break;
                }
            }
            else if(answer == 2)    omok_.play();       // omok
            else if(answer == 3)    break;              // end
            else    System.out.print("Wrong number, retry. ");
        }   
        sc.close();
    }
}
