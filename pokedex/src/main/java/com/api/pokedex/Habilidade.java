package com.api.pokedex;

import java.util.ArrayList;

public class Habilidade {
    private Long skillId;
    private String name;
    private String description;
    private String skillType;
    private Boolean hiddenSkill;
    private final ArrayList<Pokemon> compatiblePokemons = new ArrayList<>();

    public Habilidade(Long skillId, String name, String description, String skillType, Boolean hiddenSkill) {
        this.skillId = skillId;
        this.name = name;
        this.description = description;
        this.skillType = skillType;
        this.hiddenSkill = hiddenSkill;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public String getSkillType() {return skillType;}

    public void setSkillType(String skillType) {this.skillType = skillType;}

    public Boolean getHiddenSkill() {return hiddenSkill;}

    public void setHiddenSkill(Boolean hiddenSkill) {this.hiddenSkill = hiddenSkill;}

    public ArrayList<Pokemon> getCompatiblePokemons() {return compatiblePokemons;}

    public Long getSkillId() {return skillId;}

    public void setSkillId(Long skillId) {this.skillId = skillId;}


    public String ToString(){
        return "";
    }
}
