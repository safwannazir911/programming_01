package designPatterns;
class DVDPlayer {
    void on() { System.out.println("DVD Player ON"); }
    void play(String movie) { System.out.println("Playing movie: " + movie); }
}

class Projector {
    void on() { System.out.println("Projector ON"); }
    void wideScreenMode() { System.out.println("Projector in widescreen mode"); }
}

class Amplifier {
    void on() { System.out.println("Amplifier ON"); }
    void setVolume(int level) { System.out.println("Volume set to " + level); }
}

class HomeTheaterFacade {
    private DVDPlayer dvd;
    private Projector projector;
    private Amplifier amp;

    public HomeTheaterFacade(DVDPlayer dvd, Projector projector, Amplifier amp) {
        this.dvd = dvd;
        this.projector = projector;
        this.amp = amp;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }
}

public class Facade {

    public static void main(String[] args){
        HomeTheaterFacade facade=new HomeTheaterFacade(new DVDPlayer(),new Projector(),new Amplifier());
        facade.watchMovie("3-idiots");

    }

}
