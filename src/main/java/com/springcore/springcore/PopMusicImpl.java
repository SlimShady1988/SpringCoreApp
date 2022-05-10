package com.springcore.springcore;

public class PopMusicImpl implements Music {
    @Override
    public String getSong() {
        return "Stronger";
    }
    private void getInit() {
        System.out.println("Init was loaded");
    }
    private void getDestroy() {
        System.out.println("Destroy was loaded");
    }
}