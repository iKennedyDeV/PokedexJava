package com.api.pokedex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PokemonTest {

    private Types type;
    private String name;
    private String url;
    private Pokemon pokemon1;
    private int minLevel;

    @BeforeEach
    public void setUp() {
        this.type = new Types("Raio");
        this.name = "Pikachu";
        this.url = "https://exemplo.com/imagem.png";
        this.minLevel = 1;

        // Cria Pokémon base
        this.pokemon1 = new Pokemon(this.name, this.url, this.type);

        // Cria evolução para o Pokémon
        Evolution evolution = new Evolution(this.minLevel, pokemon1);
        this.pokemon1.setEvolution(evolution);
    }

    @Test
    public void seRetornarNomeDoPokemon() {
        assertEquals("Pikachu", pokemon1.getName());
    }

    @Test
    public void seRetornarUrlDoPokemon() {
        assertEquals("https://exemplo.com/imagem.png", pokemon1.getImageUrl());
    }

    @Test
    public void seRetornarTipoDoPokemon() {
        assertEquals(this.type, pokemon1.getType());
        assertEquals("Raio", pokemon1.getType().getTypePokemon());
    }

    @Test
    public void seGerarIdValidoParaPokemon() {
        assertNotNull(pokemon1.getIdPokemon());
        assertTrue(pokemon1.getIdPokemon() > 0);
    }

    @Test
    public void seRetornarEvolucaoComNomeEMinLevel() {
        EvolutionStep step = pokemon1.getEvolution().getEvolutions().get(0);
        assertEquals("Pikachu", step.getPokemon().getName());
        assertEquals(1, step.getMinLevel());
    }

    @Test
    public void seRetornarEvolutionsVazioQuandoEvolutionNull() {
        Pokemon pokemon = new Pokemon(this.name, this.url, this.type);
        pokemon.setEvolution(null);

        String result = pokemon.toString();

        assertTrue(result.contains("Evolutions:"));
        assertTrue(result.endsWith("Evolutions: "));
    }

    @Test
    public void seRetornarEvolutionsVazioQuandoListaNull() {
        Pokemon pokemon = new Pokemon(this.name, this.url, this.type);
        pokemon.setEvolution(new Evolution());
        String result = pokemon.toString();

        assertTrue(result.contains("Evolutions:"));
        assertTrue(result.endsWith("Evolutions: "));
    }

    @Test
    public void seRetornarCamposNulosNoConstrutorSemArgs() {
        Pokemon pokemon2 = new Pokemon();
        assertNull(pokemon2.getName());
        assertNull(pokemon2.getImageUrl());
        assertNull(pokemon2.getType());
    }

    @Test
    public void seRetornarToStringComDadosDoPokemon() {
        String result = pokemon1.toString();

        assertTrue(result.contains("Name: Pikachu"));
        assertTrue(result.contains("Type: Raio"));
        assertTrue(result.contains("Img: https://exemplo.com/imagem.png"));
        assertTrue(result.contains("Evolutions: Lv.1 → Pikachu"));
    }
}
