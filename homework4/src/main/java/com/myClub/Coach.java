package com.myClub;

import org.springframework.stereotype.Component;

@Component
public class Coach {
    private String name = "Guardiola";

    public Coach(String name){
        this.name = name;
    }
    public Coach(){}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString(){return  getName();}
}
