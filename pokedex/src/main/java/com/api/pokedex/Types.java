package com.api.pokedex;


public class Types {
   private static Long idCounter = 0L;
   private Long typeId;
   private String typePokemon;

   public Types() {
   }

   public String getTypePokemon() {
      return typePokemon;
   }

   public void setTypePokemon(String typePokemon) {
      this.typePokemon = typePokemon;
   }

   public Types(String typePokemon){
      idCounter += 1;
      typeId = idCounter;
      this.typePokemon = typePokemon;
   }

   public Long getTypeId() {
      return typeId;
   }

}


