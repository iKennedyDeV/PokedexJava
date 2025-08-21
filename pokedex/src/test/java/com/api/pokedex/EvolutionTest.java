package com.api.pokedex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class EvolutionTest {
     private Long evolutionId;
     private ArrayList<EvolutionStep> evolutions;
     private static Long idCounter = 0L;
     Evolution evo;



    @BeforeEach
    public void setUp(){
        this.evo = new Evolution(1,new Pokemon());
    }
    @Test
    public void seRetornaEvolutionId(){
        assertEquals(4,evo.getEvolutionId());
    }
    @Test
     public void seRetornaEvolutions(){
        assertEquals(1,evo.getEvolutions().size());
    }
    @Test
     public void seCriaConstructorSemArgs(){
        Evolution obj = new Evolution();
        assertTrue(obj instanceof Evolution);
    }




}

