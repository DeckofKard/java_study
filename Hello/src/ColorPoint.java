class Point {
	private int x, y;
	public Point(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

public class ColorPoint extends Point {
	public String color;
    public ColorPoint(int x, int y, String color){
        super(x,y);
        this.color = color;
    }
    void setColor(String color_){
        color = color_;
    }
    void setXY(int x, int y){
        super.move(x, y);
    }
    public String toString(){
        String str;
        str = color + "색의 " + "(" + super.getX() + "," + super.getY() + ")의 점";
        return str;
    }
    
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}
}