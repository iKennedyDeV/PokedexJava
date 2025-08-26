package com.api.pokedex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AbilityTest {

  private String name;
  private String description;
  private Types skillType;
  private Boolean hiddenSkill;
  private final ArrayList<Pokemon> compatiblePokemons = new ArrayList<>();
  private Ability ability;

  @BeforeEach
  public void setUp() {
    Types types = new Types("Fogo");
    Pokemon pokemon1 = new Pokemon("Pikachu", "", types);
    this.name = "Ataque Rapido";
    this.description = " ";
    this.skillType = types;
    this.hiddenSkill = false;
    this.compatiblePokemons.add(pokemon1);
    this.ability = new Ability(this.name, this.description, this.skillType, this.hiddenSkill);
    this.ability.setCompatiblePokemons(pokemon1);
  }

  @Test
  public void testAbilityProperties() {
    assertAll(() -> assertEquals("Ataque Rapido", ability.getName()),
        () -> assertEquals(" ", ability.getDescription()),
        () -> assertEquals("Fogo", ability.getSkillType().getTypePokemon()),
        () -> assertFalse(ability.getHiddenSkill()),
        () -> assertEquals("Pikachu", ability.getCompatiblePokemons().get(0).getName()));
  }

  @Test
  public void seAdicionaNovoPokemonNaListaCompatible() {
    Pokemon novo = new Pokemon("Charmander", "", new Types("Fogo"));
    ability.setCompatiblePokemons(novo);
    assertTrue(ability.getCompatiblePokemons().contains(novo));
    assertEquals(2, ability.getCompatiblePokemons().size());
  }

  @Test
  public void seConterNomeDescricaoETipoNoToString() {
    String toString = ability.toString();
    assertAll(() -> assertTrue(toString.contains("Ataque Rapido")),
        () -> assertTrue(toString.contains("Descrição=' '")),
        () -> assertTrue(toString.contains("Tipo=")),
        () -> assertTrue(toString.contains("Pikachu")));
  }

  @Test
  public void seIdEhGeradoCorretamente() {
    assertNotNull(ability.getSkillId());
    assertTrue(ability.getSkillId() > 0);
  }

  @Test
  public void seSetaTodosParametros() {
    Pokemon obj = new Pokemon();
    ability.setCompatiblePokemons(obj);
    ability.setName("Pokemon");
    ability.setDescription("Ataque");
    ability.setHiddenSkill(false);
    assertTrue(ability.getCompatiblePokemons().contains(obj));
    assertEquals("Pokemon", ability.getName());
    assertEquals("Ataque", ability.getDescription());
    assertEquals(false, ability.getHiddenSkill());

  }

  @Test
  public void seRetornaPokemonToString() {
    String expected =
        "Habilidade {" + "Nome='" + name + '\'' + ", Descrição='" + description + '\'' + ", Tipo="
            + skillType + ", É Oculta=" + hiddenSkill + ", Pokémons Compatíveis=[" + "Pikachu" + "]"
            + '}';
    assertEquals(expected, ability.toString());

  }

  @Test
  public void seRetornarNenhumQuandoNaoHaPokemonsCompatíveis() {
    Ability obj = new Ability(name, description, skillType, hiddenSkill);
    String expected =
        "Habilidade {" + "Nome='" + name + '\'' + ", Descrição='" + description + '\'' + ", Tipo="
            + skillType + ", É Oculta=" + hiddenSkill + ", Pokémons Compatíveis=[" + "Nenhum" + "]"
            + '}';
    assertEquals(expected, obj.toString());

  }
}
