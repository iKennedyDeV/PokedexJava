package com.api.pokedex;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class EvolutionStep {

  private Integer minLevel;
  private Pokemon pokemon;

  public EvolutionStep(Integer minLevel, Pokemon pokemon) {
      if (isLevelNull(minLevel)) {
          this.minLevel = minLevel;
      }
      if (isPokemonNull(pokemon)) {
          this.pokemon = pokemon;
      }

  }

  public Boolean isLevelNull(Integer level) {
    if (level <= 0) {
      throw new IllegalArgumentException("Nível mínimo inválido");
    }
    return true;
  }

  public Boolean isPokemonNull(Pokemon pokemon) {
    if (pokemon == null) {
      throw new IllegalArgumentException("Pokemon não pode ser nulo");
    }
    return true;
  }

  @Override
  public String toString() {
    return "Lv." + minLevel + " → " + pokemon.getName();
  }
}
