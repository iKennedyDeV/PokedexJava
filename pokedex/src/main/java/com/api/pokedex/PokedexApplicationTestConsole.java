package com.api.pokedex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.api.pokedex.TestEnum.*;
import static com.api.pokedex.AbilityEnum.*;

@SpringBootApplication
public class PokedexApplicationTestConsole {

  public static void main(String[] args) {
    SpringApplication.run(PokedexApplicationTestConsole.class, args);
    Types raio = new Types("Raio");
    Types corpoACorpo = new Types("Corpo a corpo");

    var pikachu = new Pokemon(PIKACHU.getName(), PIKACHU.getUrl(), raio);
    var pichu = new Pokemon(PICHU.name(), PICHU.getUrl(), raio);
    var raichu = new Pokemon(RAICHU.name(), PICHU.getUrl(), raio);

    var ataqueRapido = new Ability(ATAQUERAPIDO.getAbility(),
        ATAQUERAPIDO.getDescription(), corpoACorpo, true);
    var choqueTrovao = new Ability(CHOQUETROVAO.getAbility(),
        CHOQUETROVAO.getDescription(), raio, true);

    choqueTrovao.setCompatiblePokemons(pichu);
    choqueTrovao.setCompatiblePokemons(pikachu);
    choqueTrovao.setCompatiblePokemons(raichu);

    ataqueRapido.setCompatiblePokemons(pikachu);
    ataqueRapido.setCompatiblePokemons(pichu);
    ataqueRapido.setCompatiblePokemons(raichu);

    Evolution pikachuEvo = new Evolution();
    pikachuEvo.addEvolution(0, raichu);
    pikachuEvo.addEvolution(10, pikachu);
    pikachuEvo.addEvolution(20, raichu);

    pichu.setEvolution(pikachuEvo);
    pikachu.setEvolution(pikachuEvo);
    raichu.setEvolution(pikachuEvo);

    System.out.println(pichu);
    System.out.println(pikachu);
    System.out.println(raichu);

  }

}
