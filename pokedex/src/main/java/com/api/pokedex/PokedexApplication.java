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
		Pokemon pichu = new Pokemon("Pichu","https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/full/172.png",raio);
		Pokemon raichu = new Pokemon("Raichu","",raio);

		Habilidade ataqueRapido = new Habilidade("Ataque Rapido",
				"Um Avanço seguido de um ataque leve",corpoACorpo,true);
		Habilidade choqueTrovao = new Habilidade("Choque do Trovao",
				"Concentra um ataque poderoso a distancia",raio,true);

        choqueTrovao.setCompatiblePokemons(pikachu);
		choqueTrovao.setCompatiblePokemons(raichu);
		choqueTrovao.setCompatiblePokemons(pikachu);

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
