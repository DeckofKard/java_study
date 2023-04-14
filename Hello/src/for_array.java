import java.util.Scanner;
public class for_array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = {1,2,3,4,5};
        int sum = 0;
        int Arr[] = new int[5];
        int sum_arr = 0;
        for(int i = 0; i < 5; i++){
            Arr[i] = sc.nextInt();
            sum_arr+=Arr[i];
        }
        float sum_arr_float = (float)sum_arr;
        sum_arr_float /= 5;


        for(int i : num){
            sum += i;
        }
        System.out.println("평균은>>" + sum/5);
        System.out.println("입력한 값의 평균은>>" + sum_arr_float);
        sc.close();
    }
}