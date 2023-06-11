import java.util.Scanner;
public class question2_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String temp;
        String stop = "그만";
        while(true){
            System.out.print(">>");
            temp = sc.nextLine();
            String[] str = temp.split(" ");

            if(str.length == 1)
                if(temp.equals(stop))
                    break;
            System.out.println("어절 개수 : " + str.length);
        }
        sc.close();
    }
}
