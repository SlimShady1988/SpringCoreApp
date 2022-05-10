package com.springcore.springcore;

import org.springframework.stereotype.Component;

@Component("ruRepBean")
public class RuRepMusic implements Music {
    @Override
    public String getSong() {
        return "холод";
    }
}
