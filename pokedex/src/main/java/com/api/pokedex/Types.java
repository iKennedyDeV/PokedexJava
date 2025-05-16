package com.api.pokedex;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Types {
   private static Long idCounter = 0L;
   private Long typeId;
   private String typePokemon;


   public Types(String typePokemon){
      idCounter += 1;
      typeId = idCounter;
      this.typePokemon = typePokemon;
   }
}


