package com.api.pokedex;




import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;


@Getter
@Setter
@AllArgsConstructor
@ToString
public class Habilidade {
    private static Long idCounter = 0L;
    private Long skillId;
    private String name;
    private String description;
    private Types skillType;
    private Boolean hiddenSkill;
    private ArrayList<Pokemon> compatiblePokemons;

    public Habilidade(String name,String description,Types skillType,Boolean hiddenSkill){
        idCounter += 1;
        this.skillId = idCounter;
        this.name = name;
        this.description = description;
        this.skillType = skillType;
        this.hiddenSkill = hiddenSkill;
    }
}
