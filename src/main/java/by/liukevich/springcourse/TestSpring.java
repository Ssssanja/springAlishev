package by.liukevich.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "ApplicationContext.xml"
        );

        ClassicalMusic music = context.getBean("classicalMusic", ClassicalMusic.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic());
        System.out.println(musicPlayer.getName() );
        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
