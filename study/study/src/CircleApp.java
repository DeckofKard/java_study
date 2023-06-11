class Circle{
    int x;
    int y;
    int r;
    public Circle(int x, int y, int r){
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public String toString(){
        String str;
        str = "Circle(" + this.x + "," + this.y + ") 반지름" + this.r;
        return str;
    }
    public boolean equals(Circle c){
        if(x == c.x & y == c.y)    return true;
        else return false;
    }
}
public class CircleApp {
    public static void main(String[] args){
        Circle a = new Circle(2,3,5);
        Circle b = new Circle(2, 3, 30);
        System.out.println("원 a : " + a);
        System.out.println("원 b : " + b);
        if(a.equals(b))
            System.out.println("같은 원");
        else
            System.out.println("다른 원"); 
    }
}
