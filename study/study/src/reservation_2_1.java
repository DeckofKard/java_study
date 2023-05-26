import java.util.InputMismatchException;
import java.util.Scanner;
class Seat{
    reservation_2_1 res = new reservation_2_1();        // res.check 사용하기 위해서
    Scanner sc = new Scanner(System.in);
    String[][] seat = new String[3][11];
    int seat_where = 0;
    int seat_cancle_flag;
    public Seat(){                                      // 기본 생성자
        seat[0][0] = "S";
        seat[1][0] = "A";
        seat[2][0] = "B";
        for(int i = 0; i < 3; i++)
            for(int j = 1 ; j < 11; j++)
                seat[i][j] = "---";                     // 이름 초기화
    }
    void menu(){
        System.out.println("\n명품콘서트홀 예약 시스템입니다.");
        System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
    }
    void reserve(int reserve){                          // 예약 method(S: 0, A: 1, B: 2)
        int check_reserved = 0;
        System.out.print(seat[reserve][0] + ' ');
        for(int i = 1; i < 11; i++){
            System.out.print(seat[reserve][i] + ' ');
            if(seat[reserve][i].equals("---"))
                check_reserved++;
        }
        if(check_reserved == 0){                          // 자리가 없을 경우 menu로 return
            System.out.print("\n자리가 없습니다. 메뉴로 돌아갑니다..");
            return;
        }
        System.out.print("\n이름>>");                   // 이름 받음
        String name = sc.next();
        System.out.print("번호>>");                     // 번호 받음
        while(true){
            seat_where = res.check(10);
            if(seat[reserve][seat_where] == "---"){       // 해당 번호 가능한지 확인, 저장
                seat[reserve][seat_where] = name;
                break;
            }
            else
                System.out.print("이미 있는 자리, 재입력 요망>>");
        }
    }
    void show(){                                        // 조회
        for(int i = 0; i < 3; i++){                     // 전체 내용 print
            System.out.print(seat[i][0] + ">> ");
            for(int j = 1; j < 11; j++)
                System.out.print(seat[i][j] + ' ');
            System.out.print("\n");
        }
    }
    void cancle(int cancle){                            // 취소
        System.out.print(seat[cancle][0] + ' ');        // 해당 line 보여줌
        for(int i = 1; i < 11; i++)
            System.out.print(seat[cancle][i] + ' ');
            System.out.print('\n');
        while(true){                                    // 이름이 있는지 확인
            System.out.print("이름>>");             
            String name = sc.next();
            for(int i = 1; i < 11; i++){
                if(seat[cancle][i].equals(name)){
                    seat[cancle][i] = "---";
                    return;
                }
            }
            System.out.print("없는 이름. 메뉴(1), 재입력(2)>>");    // 실수로 취소화면 왔을 경우... menu return
            int seat_cancle_flag = res.check(2);
            if(seat_cancle_flag == 1) return;
            else    continue;
        }
    }
}


public class reservation_2_1 {
    Scanner sc = new Scanner(System.in);
    public int check(int a){       // 1 ~ a 까지의 숫자가 적절히 입력되었는지 확인하는 method
        int select;
        while(true){
            select = check_numexpression(); // 1. int형이 맞는가?
            for(int i = 1; i <= a; i++)     // 2. 범위 안의 정수가 맞는가?
                if(select == i)
                    return select;
            System.out.print("재입력 요망>>");
        }
    }
    public int check_numexpression(){       // int형이 맞는지 확인하는 method
        int select;
        while(true){
            try {
                select = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                sc.next();                  // 입력 stream 초기화
                System.out.print("숫자를 입력하시오>>");
            }
        }
        return select;
    }
    public static void main(String[] args){             // main method
        Seat seat = new Seat();                         // 초기 class 설정 + seat.method 사용하기 위해 선언
        reservation_2_1 res = new reservation_2_1();
        int select_menu = 0;
        int select_class = 0;
        while(true){
            seat.menu();
            select_menu = res.check(4);
            switch(select_menu){
                case(1):                                 // 예약
                    System.out.print("좌석구분 S(1), A(2), B(3)>>");
                    select_class = res.check(3);
                    seat.reserve(select_class-1);
                    break;
                case(2):                                 // 조회
                    seat.show();
                    break;
                case(3):                                 // 취소
                    System.out.print("좌석구분 S(1), A(2), B(3)>>");
                    select_class = res.check(3);
                    seat.cancle(select_class-1);
                    break;
                case(4):                                 // 종료
                    System.out.println("종료 완료");
                    break;
            }
            if(select_menu == 4)   break;
        }
    }  
}