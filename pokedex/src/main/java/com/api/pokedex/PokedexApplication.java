package com.api.pokedex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class PokedexApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokedexApplication.class, args);
		Habilidade ataqueRapido = new Habilidade("Ataque Rapido","Ataque com a calda");
		Pokemon pichu  = new Pokemon(1,"Pichu ","Raio",ataqueRapido);
		Pokemon pikachu = new Pokemon(1,"Pikachu","Raio",ataqueRapido);
		Pokemon raichu = new Pokemon(1,"Raichu","Raio",ataqueRapido);

		Evolution evo = new Evolution();
		evo.setPokemon(pikachu);
		evo.setPokemon(pichu);
		evo.setPokemon(raichu);
		pikachu.setEvolution(evo);
		System.out.println(pikachu);


	}

}
