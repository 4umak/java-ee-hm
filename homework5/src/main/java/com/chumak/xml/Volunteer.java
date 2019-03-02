package com.chumak.xml;

public class Volunteer implements Thinker {
    private String thoughts;

    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
    }

    public String getThoughts(){
        return thoughts;
    }
}