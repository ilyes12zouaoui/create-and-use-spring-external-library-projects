package com.lass;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

@Component
public class Calcul {

    public Long multiple2(Long l){
        return l*2;
    }
}
