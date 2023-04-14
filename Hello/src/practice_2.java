import java.util.Scanner;
public class practice_2 {
    public static void main(String[] args) {
        String course [] = {"java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int score [] = {95, 88, 76, 62, 55};
        String name;
        int n = 0;
        int check = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("과목이름 >>");
            name = sc.next();
            if(name.equals("그만")){
                System.out.println("종료합니다..");
                break;
            }
            else{
                for(int i = 0; i < 5; i++){
                    if(course[i].equals(name)){
                        n = score[i];
                        System.out.println(course[i] + "의 점수는" + n);
                        check = 1;
                        break;
                    }
                }
                if(check == 0){
                    System.out.println("없는 과목입니다.");
                }
            }
        }
        sc.close();
    }
    
}
