import java.lang.Math;
import java.util.Scanner;
public class practice_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int[] arr_input = new int[10];

        int value;
        int value_input;

        value = 0;
        value_input = 0;
    

        for (int i = 0; i < 10; i++){
            int j = (int)(Math.random()*10 + 1);
            arr[i] = j;
            value += arr[i];
        }
        value = value / 10;
        
        for(int i = 0; i< 10; i++){
            System.out.println("숫자를 입력하시오("+ (i+1) +"번째)");
            int j = sc.nextInt();
            arr_input[i] = j;
            value_input += arr_input[i];
        }
        value_input = value_input / 10;

        System.out.print("랜덤한 정수들: ");
        for(int i = 0; i < 10; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\n평균: "+ value);

        System.out.print("입력한 정수들: ");
        for(int i = 0; i < 10; i++){
            System.out.print(arr_input[i]+ " ");
        }
        System.out.println("\n평균: "+ value_input);
        sc.close();
    }
}
