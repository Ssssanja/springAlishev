package by.liukevich.springcourse;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private List<String>songList = Arrays.asList("Hungarian Rapsody", "Moon Sonate", "Seasons of Year");

    @Override
    public String getSong() {
        return songList.get((int)(Math.random()* songList.size()));
    }

}
