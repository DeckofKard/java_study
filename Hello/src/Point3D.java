class Point {
	private int x, y;
	public Point(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}



public class Point3D extends Point {
    int z;
    public Point3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }
    public void moveUp(){
        z++;
    }
    public void moveDown(){
        z--;
    }
    @Override
    public void move(int x, int y){
        super.move(x, y);
    }
    public void move(int x, int y , int z){
        super.move(x, y);
        this.z = z;
    }
    public String toString(){
        String str;
        str = "(" + super.getX() + "," + super.getY() + "," + z + ")의 점";
        return str;
    }
	
	
	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3); // 1, 2, 3은 각각 x, y, z축의 값.
		System.out.println(p.toString() + "입니다.");

		p.moveUp(); // z 축으로 위쪽 이동 
		System.out.println(p.toString() + "입니다.");

		p.moveDown(); // z 축으로 아래쪽 이동
		p.move(10, 10); // 다음 x, y 좌표로 이동
		System.out.println(p.toString() + "입니다.");

		p.move(100, 200, 300); // 다음 x, y,  z 좌표로 이동
		System.out.println(p.toString() + "입니다.");		
	}
}
