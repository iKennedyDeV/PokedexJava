package com.api.pokedex;

import lombok.Getter;

@Getter
public enum AbilityEnum {
  ATAQUERAPIDO("Ataque Rapido", "Um Avanço seguido de um ataque leve"),
  CHOQUETROVAO("Choque do Trovao", "Concentra um ataque poderoso a distancia");

  private String ability;
  private String description;

  AbilityEnum(String ability, String description) {
    this.ability = ability;
    this.description = description;
  }
}
