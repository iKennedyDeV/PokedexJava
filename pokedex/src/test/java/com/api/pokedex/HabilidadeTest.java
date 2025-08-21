package com.api.pokedex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class HabilidadeTest {

    private String name;
    private String description;
    private Types skillType;
    private Boolean hiddenSkill;
    private final ArrayList<Pokemon> compatiblePokemons = new ArrayList<>();
    private Habilidade habilidade;

    @BeforeEach
    public void setUp() {
        Types types = new Types("Fogo");
        Pokemon pokemon1 = new Pokemon("Pikachu", "", types);
        this.name = "Ataque Rapido";
        this.description = " ";
        this.skillType = types;
        this.hiddenSkill = false;
        this.compatiblePokemons.add(pokemon1);
        this.habilidade = new Habilidade(this.name, this.description, this.skillType, this.hiddenSkill);
        this.habilidade.setCompatiblePokemons(pokemon1);
    }

    @Test
    public void seRetornaName() {
        assertEquals("Ataque Rapido", habilidade.getName());
    }

    @Test
    public void seRetornaDescription() {
        assertEquals(" ", habilidade.getDescription());
    }

    @Test
    public void seRetornarONomeDaHabilidade() {
        assertEquals("Fogo", habilidade.getSkillType().getTypePokemon());
    }

    @Test
    public void seRetornaNameHiddenSkill() {
        assertFalse(habilidade.getHiddenSkill());
    }

    @Test
    public void seRetornaPokemonCompatible() {
        assertEquals("Pikachu", habilidade.getCompatiblePokemons().get(0).getName());
    }

    @Test
    public void seAdicionaNovoPokemonNaListaCompatible() {
        Pokemon novo = new Pokemon("Charmander", "", new Types("Fogo"));
        habilidade.setCompatiblePokemons(novo);
        assertTrue(habilidade.getCompatiblePokemons().contains(novo));
        assertEquals(2, habilidade.getCompatiblePokemons().size());
    }

    @Test
    public void deveConterNomeDescricaoETipoNoToString() {
        String toString = habilidade.toString();
        assertAll(
                () -> assertTrue(toString.contains("Ataque Rapido")),
                () -> assertTrue(toString.contains("Descrição=' '")),
                () -> assertTrue(toString.contains("Tipo=")),
                () -> assertTrue(toString.contains("Pikachu"))
        );
    }


    @Test
    public void seIdEhGeradoCorretamente() {
        assertNotNull(habilidade.getSkillId());
        assertTrue(habilidade.getSkillId() > 0);
    }
    @Test
    public void seSetaTodosParametros(){
        Pokemon obj = new Pokemon();
        habilidade.setCompatiblePokemons(obj);
        habilidade.setName("Pokemon");
        habilidade.setDescription("Ataque");
        habilidade.setHiddenSkill(false);
        assertTrue( habilidade.getCompatiblePokemons().contains(obj) );
        assertEquals("Pokemon",habilidade.getName());
        assertEquals("Ataque",habilidade.getDescription());
        assertEquals(false,habilidade.getHiddenSkill());

    }
    @Test
    public void seRetornaPokemonToString(){
        String expected = "Habilidade {" +
                "Nome='" + name + '\'' +
                ", Descrição='" + description + '\'' +
                ", Tipo=" + skillType +
                ", É Oculta=" + hiddenSkill +
                ", Pokémons Compatíveis=[" + "Pikachu" + "]" +
                '}';
        assertEquals(expected,habilidade.toString());

    }
    @Test
    public void deveRetornarNenhumQuandoNaoHaPokemonsCompatíveis(){
        Habilidade obj = new Habilidade(name,description,skillType,hiddenSkill);
        String expected = "Habilidade {" +
                "Nome='" + name + '\'' +
                ", Descrição='" + description + '\'' +
                ", Tipo=" + skillType +
                ", É Oculta=" + hiddenSkill +
                ", Pokémons Compatíveis=[" + "Nenhum" + "]" +
                '}';
        assertEquals(expected,obj.toString());

    }
}
