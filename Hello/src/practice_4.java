class Song{
    private String title;   
    private String artist;
    private int year;
    private String country;
    public Song(){// 기본 생성자
        title = "title_default";
        artist = "artist_default";
        year = 0;
        country = "country_default";
    }

    public Song(String title, String artist, int year, String country){
        this.title = title;     // 매개변수 초기화 생성자(input을 받는 생성자)
        this.artist = artist;
        this.year = year;
        this.country = country;
    }

    void show(){    // 출력하는 show method
        System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
    }
}

public class practice_4 {
    public static void main(String[] args){
        Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
        song.show();
    }
}
