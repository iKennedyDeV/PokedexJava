package com.api.pokedex;


import java.util.ArrayList;

public class Evolution {
    private Long pokemonId;
    private Integer minLevel;
    private String triggerName;
    private Pokemon self;
    private Pokemon evolution;

    public Evolution(long pokemonId,int minLevel,String triggerName,Pokemon self,Pokemon evolution){
        this.pokemonId =pokemonId;
        this.minLevel = minLevel;
        this.triggerName = triggerName;
        this.self = self;
        this.evolution = evolution;

    }
    public Evolution(){}


    public Integer getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(Integer minLevel) {
        this.minLevel = minLevel;
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public Pokemon getSelf() {
        return self;
    }

    public void setSelf(Pokemon self) {
        this.self = self;
    }

    public Pokemon getEvolution() {
        return evolution;
    }

    public void setEvolution(Pokemon evolution) {
        this.evolution = evolution;
    }
}



