package com.api.pokedex;

public class Pokemon {
    int number;
    private String name;
    private String type;
    private Evolution evolution;
    private Habilidade habilidade;
    public Pokemon(int number,String name,String type, Evolution evolution,Habilidade habilidade){
        this.number = number;
        this.name = name;
        this.type = type;
        this.evolution = evolution;
    }
    public Pokemon(int number,String name,String type,Habilidade habilidade){
        this.number = number;
        this.name = name;
        this.type = type;
    }

    public void setEvolution(Evolution evolution) {
        this.evolution = evolution;
    }
    @Override
    public String toString(){
        return "Name:"+ this.name +" type: "+this.type+" Evolution: "+ this.evolution;
    }
}
