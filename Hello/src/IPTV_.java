public class IPTV_ {
    public static void main(String[] args){
        ColorTV myColorTV = new ColorTV(24, 1024);
        myColorTV.printProperty();
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
        iptv.printProperty();
    }
}
