class TV{
    private int size;
    public TV(int size){this.size = size;}
    protected int getSize(){return size;}
}
class ColorTV extends TV{        
    private int color;

    public ColorTV(int size, int color){
        super(size);
        this.color = color;
    }
    protected void printProperty(){
        System.out.println("실행결과 : " + super.getSize() + "인치 " + color + "컬러");
    }
    protected int getColor(){return color;}
}
class IPTV extends ColorTV{
    private String ip;

    public IPTV(String ip, int size, int color){
        super(size, color);
        this.ip = ip;
    }
    protected void printProperty(){
        System.out.println("나의 IPTV는 " + ip + "주소의 " + super.getSize() + "인치 " + super.getColor() + "컬러");
    }
}