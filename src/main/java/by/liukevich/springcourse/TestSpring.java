package by.liukevich.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "ApplicationContext.xml"
        );

//        Music music = context.getBean("classicalMusic", Music.class);
//        Music music1 = context.getBean("rockMusic", Music.class);
//        Music music2 = context.getBean("rapMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
//        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
//        musicPlayer.playMusic();
//        musicPlayer1.playMusic();
//        musicPlayer2.playMusic();
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();
    }
}
