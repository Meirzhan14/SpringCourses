package kz.alishev.springcourse;

import org.springframework.stereotype.Component;


@Component
public class MusicPlayer {

    private Music music;

    public MusicPlayer(){}

//    List<Music> playMusic() {
//        return musicList;
//    }

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void playMusic(){
        System.out.println("Playing: "+ music.getSong());
    }
}