package com.springcore.springcore;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.*;

@org.springframework.context.annotation.Configuration
@ComponentScan("com.springcore.springcore")
public class Configuration {
    @Bean("ruRepBean")
    public  RuRepMusic ruRepMusic() {
        return new RuRepMusic();
    }
    @Bean
    public  NewMusicPlayer newMusicPlayer () {
        return new NewMusicPlayer(ruRepMusic());
    }
}
