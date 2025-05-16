package com.api.pokedex;


import lombok.*;

import java.util.ArrayList;


@Getter
@Setter
@AllArgsConstructor
@ToString
public class Evolution {
    private static Long idCounter = 0L;
    private Long evolutionId;

    public ArrayList<EvolutionStep> getEvolutions() {
        return new ArrayList<>();
    }

    private ArrayList<EvolutionStep> evolutions;

    public Evolution(){
        idCounter += 1;
        this.evolutionId = idCounter;
    }

    public void addEvolution(Integer minLevel,Pokemon pokemon){
        this.evolutions.add(new EvolutionStep(minLevel,pokemon));
    }


}



