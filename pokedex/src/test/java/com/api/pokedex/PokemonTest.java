package com.api.pokedex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PokemonTest {
    private static Long idCounter = 0l;
    private Types type;
    private String name;
    private String url;
    private Pokemon pokemon1;
    private int minLevel;
    private Evolution evolution;

    @BeforeEach
    public void setUp() {
        idCounter += 1;
        this.type = new Types("Raio");
        this.name = "Pikachu";
        this.url = "https://exemplo.com/imagem.png";
        this.minLevel = 1;

        this.pokemon1 = new Pokemon(this.name, this.url, this.type);
        this.evolution = new Evolution();
        Evolution evolution = new Evolution(this.minLevel, pokemon1);
        pokemon1.setEvolution(evolution);



    }

    @Test
    public void testeSeNomeDoPokemonRetorna() {
        assertEquals(this.name, this.pokemon1.getName());
    }
    @Test
    public void testeSeRetornaEvolucao(){
        String nome = "";
        Integer minLevel = 0;
        for(EvolutionStep i : this.pokemon1.getEvolution().getEvolutions()){
            nome = i.getPokemon().getName();
            minLevel = i.getMinLevel();
        }
        assertEquals("Pikachu",nome);
        assertEquals(1, minLevel);
    }

    @Test
    public void TesteSeEvolutionRetornaNull(){
      Pokemon pokemon = new Pokemon(this.name,this.url,this.type);
      String result = pokemon.toString();
        assertTrue(result.contains("Evolutions:"));
        assertTrue(result.endsWith("Evolutions: "));
    }
    @Test
    public void TesteSeEvolutionListaNull(){
        Evolution evolution = new Evolution();
        Pokemon pokemon = new Pokemon(this.name,this.url,this.type);
        String result = pokemon.toString();
        assertTrue(result.contains("Evolutions:"));
        assertTrue(result.endsWith("Evolutions: "));
    }

    @Test
    public void testeSeConstrutorSemArgumento(){
        Pokemon pokemon2 = new Pokemon();
        assertEquals(null,pokemon2.getName());
        assertEquals(null,pokemon2.getImageUrl());
        assertEquals(null,pokemon2.getType());
}
    @Test
    public void testeSeUrlDoPokemonRetorna() {
        assertEquals(this.url, this.pokemon1.getImageUrl());
    }
    @Test
    public void testeSeIdDoPokemonRetorna() {
        assertEquals(this.idCounter, this.pokemon1.getIdPokemon());
    }
    @Test
    public void testeSeTypeDoPokemonRetorna() { assertEquals(this.type, this.pokemon1.getType());
    }

    @Test
    public void testeParaRetornoDoToString() {
        String expected = "Name: " + this.name + "\n" +
                "Type: " + this.type.getTypePokemon() + "\n" +
                "Img: " + this.url + "\n" +
                "Evolutions: Lv." + this.minLevel + " → " + this.pokemon1.getName();

        assertEquals(expected, this.pokemon1.toString());
    }
}
