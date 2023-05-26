class TV{
    private int size;
    public TV(int size){this.size = size;}
    protected int getSize(){return size;}
}
public class ColorTV_ extends TV{        
    private int color;

    public ColorTV_(int size, int color){
        super(size);
        this.color = color;
    }
    protected void printProperty(){
        System.out.println("실행결과 : " + super.getSize() + "인치 " + color + "컬러");
    }

    public static void main(String[] args){
        ColorTV_ myTV = new ColorTV_(32, 1024);
        myTV.printProperty();
    }
}
