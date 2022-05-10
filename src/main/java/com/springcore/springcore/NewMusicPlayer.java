package com.springcore.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("newMusicPlayer")
public class NewMusicPlayer {
    private Music music;
    private Music music2;

    public NewMusicPlayer() {}
    @Autowired
    public NewMusicPlayer( Music music) {
        this.music = music;
    }
//    @Autowired
//    public NewMusicPlayer(RepMusic music, RuRepMusic music2) {
//        this.music = music;
//        this.music2 = music2;
//    }
    public String playMusic() {
        return  "zZzZzZ playing Music     " + music.getSong() ;
    }

//    public String playMusic() {
//        return  "zZzZzZ playing Music     " + music.getSong() + "              zZzZzZ playing Music     " + music2.getSong();
//    }

//    public void setMusic(RepMusic music) {
//        this.music = music;
//    }

}