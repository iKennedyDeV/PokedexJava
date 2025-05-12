package com.api.pokedex;

public class Habilidade {
    String name;
    String descricao;
    public Habilidade (String name,String descricao){
        this.name = name;
        this.descricao = descricao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
