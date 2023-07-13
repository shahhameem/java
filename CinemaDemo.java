class Cinema{
    private String movieName;
    private String timing;
    Cinema(String name, String time){
        this.movieName = name;
        this.timing = time;
    }
    Cinema(Cinema c){
        this.movieName = c.movieName;
        this.timing = c.timing;
    }
    public void show(){
        System.out.println("Name of the movie = " + movieName);
        System.out.println("Timing of the movie = " + timing);
    }
}

public class CinemaDemo{
    public static void main(String[] args) {
        Cinema pvr = new Cinema("Titanic", "1.30");
        System.out.println("Information about pvr");
        pvr.show();
        Cinema wave = new Cinema(pvr);
        System.out.println("Information about Wave");
        wave.show();
    }
}