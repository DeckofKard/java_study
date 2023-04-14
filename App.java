import java.util.Scanner;
public class App {
    public static int sum(int n, int m){
        return n+m;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하라");
        String a = sc.nextLine();

        int i = 10;
        int s;
        s = sum(i, 10);
        System.out.println(a + " world");
        System.out.println("hello");
        System.out.println(s);

        sc.close();
    }
}
