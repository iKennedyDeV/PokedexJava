package com.api.pokedex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class PokedexApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokedexApplication.class, args);
		Types raio = new Types("Raio");
		Types corpoACorpo = new Types("Corpo a corpo");

		Pokemon pikachu = new Pokemon("Pikachu","",raio);
		Pokemon pichu = new Pokemon("Pichu","",raio);
		Pokemon raichu = new Pokemon("Raichu","",raio);

		Habilidade ataqueRapido = new Habilidade("Ataque Rapido",
				"Um Avanço seguido de um ataque leve",corpoACorpo,true);
		Habilidade choqueTrovao = new Habilidade("Choque do Trovao",
				"Concentra um ataque poderoso a distancia",raio,true);

        choqueTrovao.getCompatiblePokemons().add(pikachu);
		choqueTrovao.getCompatiblePokemons().add(raichu);
		choqueTrovao.getCompatiblePokemons().add(pikachu);

		ataqueRapido.getCompatiblePokemons().add(pikachu);
		ataqueRapido.getCompatiblePokemons().add(pichu);
		ataqueRapido.getCompatiblePokemons().add(raichu);

		Evolution pikachuEvo = new Evolution();
		pikachuEvo.addEvolution(0,raichu);
		pikachuEvo.addEvolution(10,pikachu);
        pikachuEvo.addEvolution(20,raichu);

		pichu.setEvolution(pikachuEvo);
		pikachu.setEvolution(pikachuEvo);
		raichu.setEvolution(pikachuEvo);

		System.out.println(pichu);


	}

}
