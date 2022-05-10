package com.springcore.springcore;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("musicPlayer")
public class MusicPlayer {
    private Music music;
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer() {}
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(ArrayList<Music> song) {
        this.musicList = song;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        System.out.println("zZzZzZ playing Music " + music.getSong());;
    }
    public void playMusicList() {
        for (Music song : musicList) {
            System.out.println(song.getSong());
        }
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}
