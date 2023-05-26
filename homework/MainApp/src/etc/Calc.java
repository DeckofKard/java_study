package etc;			// vs code 에서의 package는 폴더 생성만 해서 넣으면 됨
public class Calc {
	private int x, y;
	public Calc(int x, int y) { this.x = x; this.y = y; }
	public int sum() { return x+y; }
} 