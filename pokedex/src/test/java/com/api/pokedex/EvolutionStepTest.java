package com.api.pokedex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EvolutionStepTest {

  private Integer minLevel;
  private Pokemon pokemon;
  private EvolutionStep pikachus;
  private Pokemon pikachu;

  @BeforeEach
  public void setUP() {
    pikachu = new Pokemon();
    this.minLevel = 1;
    this.pokemon = pikachu;
    pikachu.setName("pikachu");
    pikachus = new EvolutionStep(minLevel, pokemon);

  }

  @Test
  public void SeCriaSemArgs() {
    var semNome = new EvolutionStep();
    assertEquals(null, semNome.getMinLevel());
  }

  @Test
  public void EvolutionStepTestProperties() {
    assertAll(
        ()-> assertEquals("pikachu",pikachus.getPokemon()),
        ()-> assertEquals(1,pikachus.getMinLevel()));
  }

  @Test
  public void seRetornToString() {
    String expected = "Lv." + this.minLevel + " → " + this.pokemon.getName();
    assertEquals(expected, pikachus.toString());
  }

  @Test
  public void seRetorThrowPokemonNull() {
    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
        () -> new EvolutionStep(1, null));
    assertEquals("Pokemon não pode ser nulo", exception.getMessage());
  }

  @Test
  public void seRetorThrowNivelInvalidoNull() {
    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
        () -> new EvolutionStep(null, new Pokemon()));
    assertEquals("Nível mínimo inválido", exception.getMessage());
  }

  @Test
  public void seRetorThrowNivelInvalidoZero() {
    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
        () -> new EvolutionStep(-1, new Pokemon()));
    assertEquals("Nível mínimo inválido", exception.getMessage());
  }


}



