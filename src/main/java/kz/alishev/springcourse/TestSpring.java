package kz.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                " applicationContext.xml"
        );

        Music music = context.getBean("rockMusic", Music.class);
        Music music2 = context.getBean("classicalMusic", Music.class);
        MusicPlayer rockMusicPlayer = new MusicPlayer(music);
        MusicPlayer classicalMusic = new MusicPlayer(music2);
        rockMusicPlayer.playMusic();
        classicalMusic.playMusic();

        context.close();
    }
}
