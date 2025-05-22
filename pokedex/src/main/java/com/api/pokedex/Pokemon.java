package com.api.pokedex;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class Pokemon {
    private static Long idCounter = 0L;
    private Long idPokemon;
    private String name;
    private String imageUrl;
    private Types type;
    private Evolution evolution;

    public Pokemon(String name, String imageUrl, Types type) {
        idCounter += 1;
        this.idPokemon = idCounter;
        this.name = name;
        this.imageUrl = imageUrl;
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder evolutionsStr = new StringBuilder();
        if (this.evolution != null && this.evolution.getEvolutions() != null) {
            for (EvolutionStep s : this.evolution.getEvolutions()) {
                evolutionsStr.append(s).append(", ");
            }
            if (!evolutionsStr.isEmpty()) {
                evolutionsStr.setLength(evolutionsStr.length() - 2);
            }
        }

        return "Name: " + this.name + "\n" +
                "Type: " + this.type.getTypePokemon() + "\n" +
                "Img: " + this.imageUrl + "\n" +
                "Evolutions: " + evolutionsStr;
    }
}
