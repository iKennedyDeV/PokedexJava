package com.api.pokedex;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class EvolutionStep {
    private Integer minLevel;
    private Pokemon pokemon;

    public EvolutionStep(Integer minLevel, Pokemon pokemon) {
        if (minLevel == null || minLevel < 0) {
            throw new IllegalArgumentException("Nível mínimo inválido");
        }
        if (pokemon == null) {
            throw new IllegalArgumentException("Pokemon não pode ser nulo");
        }
        this.minLevel = minLevel;
        this.pokemon = pokemon;
    }

    @Override
    public String toString() {
        return "Lv." + minLevel + " → " + pokemon.getName();
    }
}
