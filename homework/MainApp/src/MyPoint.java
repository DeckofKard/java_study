
public class MyPoint {
    int x;
    int y;
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public boolean equals(Object obj){
        MyPoint q = (MyPoint)obj;
        if(q.x == x)
            if(q.y == y)
                return true;
        return false;
    }   
    public String toString(){                   // '객체 + 문자열' 연산 -> toString()이 자동으로 호출됨
        return "Point(" + x + "," + y + ")";
    }
    public static void main(String [] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p);
		if(p.equals(q)) System.out.println("같은 점");
		else System.out.println("다른 점");			
	}
}