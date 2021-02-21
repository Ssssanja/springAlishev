package by.liukevich.springcourse;

public class MusicPlayer {
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    private Music music;

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing... " + music.getSong());
    }
}
