import java.util.StringTokenizer;
import java.util.Scanner;
public class question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String temp;
        String stop = "그만";
        while(true){
            System.out.print(">>");
            temp = sc.nextLine();
            StringTokenizer st = new StringTokenizer(temp);

            if(st.countTokens() == 1)
                if(temp.equals(stop))
                    break;
                    
            System.out.println("어절 개수는 " + st.countTokens());
        }
        sc.close();
    }
}
