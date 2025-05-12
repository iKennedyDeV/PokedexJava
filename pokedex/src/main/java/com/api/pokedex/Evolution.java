package com.api.pokedex;


import java.util.ArrayList;

public class Evolution {
    private final ArrayList<Pokemon> pokemon = new ArrayList<>();

    public ArrayList<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon.add(pokemon);
    }
    @Override
    public String toString() {
        StringBuilder nomes = new StringBuilder();
        for (Pokemon value : pokemon) {
            nomes.append(value.getName()).append(",");
        }
        return nomes.toString();
    }

}



