import java.util.Scanner;
public class practice_2_upgrade {
    public static void main(String[] args) {
        String course [] = {"java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        String score [] = {"95", "88", "76", "62", "55"};
        String name;
        String answer;
        int check = 0;
        Scanner sc = new Scanner(System.in);

        while(true){
            check = 0;
            System.out.print("과목, 점수 중 입력>>");
            name = sc.next();
            if(name.equals("그만")){
                System.out.println("종료합니다..");
                break;
            }
            else{
                for(int i = 0; i < 5; i ++){
                    if(course[i].equals(name)){
                        answer = score[i];
                        check = 1;
                        System.out.println(name + "의 점수는" + answer); 
                        break;
                    }
                    else if(score[i].equals(name)){
                        answer = course[i];
                        check = 1;
                        System.out.println(name + "의 과목은" + answer);
                        break;
                    }
                }
                if(check == 0){
                    System.out.println("없는 정보입니다..");
                }
            }
        }
        sc.close();
    }
}

 
    
