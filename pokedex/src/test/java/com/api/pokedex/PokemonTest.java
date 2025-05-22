package com.api.pokedex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokemonTest {

    private Types type;
    private String name;
    private String url;
    private Pokemon pokemon;
    private int minLevel;

    @BeforeEach
    public void setUp() {
        this.type = new Types("Raio");
        this.name = "Pikachu";
        this.url = "https://exemplo.com/imagem.png";
        this.pokemon = new Pokemon(this.name, this.url, this.type);
        this.minLevel = 1;

        // Supondo que sua classe Evolution tenha um método addEvolution(int, Pokemon)
        Evolution evolution = new Evolution();
        evolution.addEvolution(this.minLevel, this.pokemon);
        this.pokemon.setEvolution(evolution);
    }

    @Test
    public void testeSeNomeDoPokemonRetorna() {
        assertEquals(this.name, this.pokemon.getName());
    }
    @Test
    public void testeSeUrlDoPokemonRetorna() {
        assertEquals(this.name, this.pokemon.getImageUrl());
    }
    @Test
    public void testeSeIdDoPokemonRetorna() {
        assertEquals(this.name, this.pokemon.getIdPokemon());
    }
    @Test
    public void testeSeTypeDoPokemonRetorna() {
        assertEquals(this.name, this.pokemon.getType());
    }

    @Test
    public void testeParaRetornoDoToString() {
        String expected = "Name: " + this.name + "\n" +
                "Type: " + this.type.getTypePokemon() + "\n" +
                "Img: " + this.url + "\n" +
                "Evolutions: Lv." + this.minLevel + " → " + this.pokemon.getName();

        assertEquals(expected, this.pokemon.toString());
    }
}
