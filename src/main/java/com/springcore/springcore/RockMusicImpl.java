package com.springcore.springcore;

import org.springframework.stereotype.Component;

@Component("musicRockBean")
public class RockMusicImpl implements Music {
    private RockMusicImpl(){}

    public static RockMusicImpl getRockBean() {
        return new RockMusicImpl();
    }

    @Override
    public String getSong() {
        return "We Will Rock You";
    }
}