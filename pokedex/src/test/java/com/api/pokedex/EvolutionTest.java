package com.api.pokedex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvolutionTest {

  private ArrayList<EvolutionStep> evolutions;
  Evolution evo;

  @BeforeEach
  public void setUp() {
    this.evo = new Evolution(1, new Pokemon());
  }

  @Test
  public void EvolutionTestProperties() {
    assertAll(
        ()->assertEquals(4, evo.getEvolutionId()),
        ()->assertEquals(1, evo.getEvolutions().size()));

  }
  @Test
  public void seCriaConstructorSemArgs() {
    var obj = new Evolution();
    assertTrue(obj instanceof Evolution);
  }


}

