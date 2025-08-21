package com.api.pokedex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TypesTest {
    private long typeId;
    private String typePokemon;
    Types type;


    @BeforeEach
    public void setUP(){
        this.typePokemon = "Fogo";
        this.type = new Types(this.typePokemon);
    }
    @Test void seCriaSemArgs(){
        Types types = new Types();
            assertEquals(null,types.getTypePokemon());
    }
    @Test
    public void SeRetornaTypePokemon(){
        assertEquals("Fogo",this.type.getTypePokemon());

    }
    @Test
    public void SeSetaTypePokemon(){
        Types types = new Types("Raio");
        types.setTypePokemon("Aguá");
        assertEquals("Aguá",types.getTypePokemon());
    }

    @Test void SeSetaTypeId(){
        Types types = new Types();
        types.setTypeId(5L);
        assertEquals(5L,types.getTypeId());
    }

    @Test
    public void SeRetornaId(){
        assertEquals(5,this.type.getTypeId());

    }




}
