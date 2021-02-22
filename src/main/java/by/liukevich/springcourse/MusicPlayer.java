package by.liukevich.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }


    public String playMusic(Jenre j){
        if (j==Jenre.ROCK){
           return rockMusic.getSong();
        }
        else return classicalMusic.getSong();
    }
}
