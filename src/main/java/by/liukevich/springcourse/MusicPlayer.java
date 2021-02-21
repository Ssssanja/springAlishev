package by.liukevich.springcourse;

public class MusicPlayer {
    public MusicPlayer(Music music) {
        this.music = music;
    }

    private Music music;

    public void playMusic(){
        System.out.println("Playing... " + music.getSong());
    }
}
