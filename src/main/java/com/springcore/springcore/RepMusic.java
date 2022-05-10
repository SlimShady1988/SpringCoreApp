package com.springcore.springcore;

import org.springframework.stereotype.Component;

@Component("repBean")
public class RepMusic implements Music {
    @Override
    public String getSong() {
        return "Sing for the moment";
    }
}
