package com.api.pokedex;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class EvolutionStep {
    private Integer minLevel;
    private Pokemon pokemon;

    public EvolutionStep(Integer minLevel, Pokemon pokemon) {
        this.minLevel = minLevel;
        this.pokemon = pokemon;
    }
  @Override
   public String toString() {
       return "Lv." + minLevel + " → " + pokemon.getName();
   }

}
