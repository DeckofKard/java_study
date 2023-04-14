import java.util.Scanner;
class Seat{
    reservation_2 res = new reservation_2();
    Scanner sc = new Scanner(System.in);
    String[][] seat = new String[3][11];
    int seat_where = 0;
    int seat_cancle_flag;
    public Seat(){
        seat[0][0] = "S";
        seat[1][0] = "A";
        seat[2][0] = "B";
        for(int i = 0; i < 3; i++)
            for(int j = 1 ; j < 11; j++)
                seat[i][j] = "---";
    }
    void menu(){
        System.out.println("\n명품콘서트홀 예약 시스템입니다.");
        System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
    }
    void reserve(int reserve){
        System.out.print(seat[reserve][0] + ' ');
        for(int i = 1; i < 11; i++)
            System.out.print(seat[reserve][i] + ' ');
        System.out.print("\n이름>>");
        String name = sc.next();
        System.out.print("번호>>");
        while(true){
            seat_where = res.check(10);
            if(seat[reserve][seat_where] == "---"){
                seat[reserve][seat_where] = name;
                break;
            }
            else
                System.out.print("이미 있는 자리, 재입력 요망>>");
        }
    }
    void show(){
        for(int i = 0; i < 3; i++){
            System.out.print(seat[i][0] + ">> ");
            for(int j = 1; j < 11; j++)
                System.out.print(seat[i][j] + ' ');
            System.out.print("\n");
        }
    }
    void cancle(int cancle){
        seat_cancle_flag = 0;
        System.out.print(seat[cancle][0] + ' ');
        for(int i = 1; i < 11; i++)
            System.out.print(seat[cancle][i] + ' ');
            System.out.print('\n');
        while(true){
            System.out.print("이름>>");
            String name = sc.next();
            for(int i = 1; i < 11; i++){
                if(seat[cancle][i].equals(name)){
                    seat[cancle][i] = "---";
                    seat_cancle_flag = 1;
                }
            }
            if(seat_cancle_flag == 1)
                break;
            System.out.print("없는 이름. 메뉴(1), 재입력(2)");
            int seat_cancle_flag_2 = res.check(2);
            if(seat_cancle_flag_2 == 1) break;
            else    continue;
        }
    }
}
public class reservation_2 {
    Scanner sc = new Scanner(System.in);
    public int check(int a){       // 1 ~ a 까지의 숫자가 적절히 입력되었는지 확인하는 method
        int select;
        while(true){
            select = sc.nextInt();
            for(int i = 1; i <= a; i++){
                if(select == i){
                    return select;
                }
            }
            System.out.print("재입력 요망>>");
        }
    }
    public static void main(String[] args){
        Seat seat = new Seat();
        reservation_2 res = new reservation_2();
        int select_menu = 0;
        int select_class = 0;
        while(true){
            seat.menu();
            select_menu = res.check(4);
            switch(select_menu){
                case(1):
                    System.out.print("좌석구분 S(1), A(2), B(3)>>");
                    select_class = res.check(3);
                    seat.reserve(select_class-1);
                    break;
                case(2):
                    seat.show();
                    break;
                case(3):
                    System.out.print("좌석구분 S(1), A(2), B(3)>>");
                    select_class = res.check(3);
                    seat.cancle(select_class-1);
                    break;
                case(4):
                    System.out.println("종료 완료");
                    break;

            }
            if(select_menu == 4)   break;
            select_menu = 0;
        }
    }  
}