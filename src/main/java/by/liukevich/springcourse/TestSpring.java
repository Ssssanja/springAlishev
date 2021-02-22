package by.liukevich.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "ApplicationContext.xml"
        );

        ClassicalMusic music = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic music1 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(music==music1);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic());
        System.out.println(musicPlayer.getName() );
        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
