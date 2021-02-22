package by.liukevich.springcourse;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> songList = Arrays.asList("Bohemian Rapsody", "Smells Like Teen Spirit", "Another Brick In The Wall");
    @Override
    public String getSong() {
        return songList.get((int)(Math.random()* songList.size()));
    }
}
