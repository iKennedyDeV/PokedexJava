package com.api.pokedex;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
public class Habilidade {
    private static Long idCounter = 0L;

    private Long skillId;
    private String name;
    private String description;
    private Types skillType;
    private Boolean hiddenSkill;
    private final ArrayList<Pokemon> compatiblePokemons = new ArrayList<>();

    public Habilidade(String name, String description, Types skillType, Boolean hiddenSkill) {
        idCounter += 1;
        this.skillId = idCounter;
        this.name = name;
        this.description = description;
        this.skillType = skillType;
        this.hiddenSkill = hiddenSkill;
    }

    public void setCompatiblePokemons(Pokemon pokemon) {
        this.compatiblePokemons.add(pokemon);
    }

    @Override
    public String toString() {
        StringBuilder pokemons = new StringBuilder();
        for (Pokemon p : compatiblePokemons) {
            pokemons.append(p.getName()).append(", ");
        }
        String pokemonList = pokemons.length() > 0
                ? pokemons.substring(0, pokemons.length() - 2)
                : "Nenhum";

        return "Habilidade {" +
                "Nome='" + name + '\'' +
                ", Descrição='" + description + '\'' +
                ", Tipo=" + skillType +
                ", É Oculta=" + hiddenSkill +
                ", Pokémons Compatíveis=[" + pokemonList + "]" +
                '}';
    }
}
