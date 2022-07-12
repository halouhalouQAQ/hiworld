package com.domain;

import com.domain.World;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Demo01{

    public List<World> worlds;
    public Demo01(List<World> worlds){
        this.worlds = worlds;
        System.out.println(worlds.size());
    }
}
