class Rectangle{
    int x;
    int y;
    int width;
    int height;
    public Rectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    int square(){
        return width*height;
    }
    void show(){
        System.out.println("(" + x + "," + y + ")에서 크기가 " + width + "x" + height + "인 사각형");
    }
    boolean contanins(Rectangle r){
        if(x < r.x && r.x + r.width < x + width)
            if(y < r.y && r.y + r.height < y + height)
                return true;
        return false;
    }
}
public class practice_5 {
    public static void main(String[] args){
        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 " + s.square());
        if(t.contanins(r))  System.out.println("t는 r을 포함합니다.");
        if(t.contanins(s))  System.out.println("t는 s를 포함합니다.");
    }    
}
