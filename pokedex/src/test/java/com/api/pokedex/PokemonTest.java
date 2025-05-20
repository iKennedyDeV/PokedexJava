package com.api.pokedex;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PokemonTest {
    Types type = new Types("Raio");
    String name = "Pikachu";
    String url = "";
    Pokemon pokemon = new Pokemon(this.name,this.url,this.type);
    int minLevel = 01;
    Evolution evolution = new Evolution(this.minLevel,this.pokemon);




    @Test
    public void testeSeNomeDoPokemonRetorna(){
       pokemon.setName(this.name);
       assertEquals(this.name,this.pokemon.getName());
    }


    @Test
    public void testeParaRetornoDoToString(){
        String expected = "Name: " + this.name + "\n" +
                "Type: " + this.type.getTypePokemon() + "\n" +
                "Img: " + this.url + "\n" +
                "Evolutions: " + "Lv." + this.minLevel + " → " + this.pokemon.getName();


    }


}
