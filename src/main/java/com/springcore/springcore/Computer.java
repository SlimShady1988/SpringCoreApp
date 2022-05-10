package com.springcore.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private final int id = 1;
    private NewMusicPlayer musicPlayer;

    @Autowired
    public Computer(NewMusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", musicPlayer=" + (String)musicPlayer.playMusic() +
                '}';
    }
}
