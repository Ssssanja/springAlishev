package by.liukevich.springcourse;

import java.util.List;


public class MusicPlayer {
    private List<Music>musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        return "Playing: " + musicList.get((int)(Math.random()* musicList.size())).getSong();
    }
}