package com.api.pokedex;

import java.util.ArrayList;

public class Evolution {
    private static Long idCounter = 0L;
    private final Long evolutionId;
    private final ArrayList<EvolutionStep> evolutions = new ArrayList<>();

    public ArrayList<EvolutionStep> getEvolutions() {
        return evolutions;
    }
    public Evolution(){
        idCounter += 1;
        this.evolutionId = (idCounter);
    }

    public Long getEvolutionId() {
        return evolutionId;
    }

    public void addEvolution(Integer minLevel, Pokemon pokemon){
        this.evolutions.add(new EvolutionStep(minLevel,pokemon));
    }


}



