package com.myClub;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class FootballTeam {

    private String name;
    private String country;
    @Autowired
    private Coach coach;

    FootballTeam() {}

    public FootballTeam(String name, String country, Coach coach) {
        this.name = name;
        this.country = country;
        this.coach = coach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    @Override
    public String toString() {
        return "Team = " + name + ", country = " + country + "\nCoach = " +coach;
    }
}
