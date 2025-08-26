package com.api.pokedex;

import lombok.Getter;

@Getter
public enum TestEnum {
  PIKACHU("Pikachu",
      "https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/full/025.png"),
  RAICHU("Riachu",
      "https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/full/172.png"),
  PICHU("Pichu",
      "https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/full/172.png");

  private String name;
  private String url;

  TestEnum(String name, String url) {
    this.name = name;
    this.url = url;
  }


}





