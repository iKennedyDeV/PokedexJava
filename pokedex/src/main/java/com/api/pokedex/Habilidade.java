package com.api.pokedex;


import java.util.ArrayList;


public class Habilidade {
    private static Long idCounter = 0L;
    private Long skillId;
    private String name;
    private String description;
    private Types skillType;
    private Boolean hiddenSkill;
    private ArrayList<Pokemon> compatiblePokemons = new ArrayList<>();

    public Habilidade(String name, String description, Types skillType, Boolean hiddenSkill, ArrayList<Pokemon> compatiblePokemons) {
        this.name = name;
        this.description = description;
        this.skillType = skillType;
        this.hiddenSkill = hiddenSkill;

    }

    public Habilidade(String name, String description, Types skillType, Boolean hiddenSkill){
        idCounter += 1;
        this.skillId = idCounter;
        this.name = name;
        this.description = description;
        this.skillType = skillType;
        this.hiddenSkill = hiddenSkill;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Types getSkillType() {
        return skillType;
    }

    public void setSkillType(Types skillType) {
        this.skillType = skillType;
    }

    public Boolean getHiddenSkill() {
        return hiddenSkill;
    }

    public void setHiddenSkill(Boolean hiddenSkill) {
        this.hiddenSkill = hiddenSkill;
    }

    public ArrayList<Pokemon> getCompatiblePokemons() {
        return compatiblePokemons;
    }

    public void setCompatiblePokemons(Pokemon pokemon) {
        this.compatiblePokemons.add(pokemon);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
