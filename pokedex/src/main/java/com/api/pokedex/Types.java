package com.api.pokedex;

public class Types {
   private Long pokemonId;
   private String pokemonType;

    public Types(Long pokemonId, String pokemonType) {
        this.pokemonId = pokemonId;
        this.pokemonType = pokemonType;
    }
    public Types(){}

    public Long getPokemonId() {return pokemonId;}

    public void setPokemonId(Long pokemonId) {this.pokemonId = pokemonId;}

    public String getPokemonType() {return pokemonType;}

    public void setPokemonType(String pokemonType) {this.pokemonType = pokemonType;}

    public String ToString(){
        return "";
    }
}
