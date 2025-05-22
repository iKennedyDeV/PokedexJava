package com.api.pokedex;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class Types {
   private static Long idCounter = 0L;
   private Long typeId;
   private String typePokemon;

   public Types(String typePokemon) {
      idCounter += 1;
      this.typeId = idCounter;
      this.typePokemon = typePokemon;
   }
}
