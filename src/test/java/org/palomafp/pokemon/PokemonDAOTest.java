package org.palomafp.pokemon;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.palomafp.pokemon.modelo.Pokemon;
import java.util.List;

class PokemonDAOTest {


    @Test
    void testPokemonRandom() {

        PokemonDAO pokemonDAO = new PokemonDAO();
        Pokemon pokemon = pokemonDAO.getPokemonRandom();
        assertNotNull(pokemon, "El resultado no debe ser nulo, cuchurrumin");
    }

    @Test
    void testGetAllPokemon() {
        PokemonDAO pokemonDAO = new PokemonDAO();
        List<Pokemon> pokemon = pokemonDAO.getAllPokemon();
        assertNotNull(pokemon, "El resultado no debe ser nulo, cuchurrumin");
    }

    @Test
    void testGetPokemonById() {
        PokemonDAO pokemonDAO = new PokemonDAO();
        Pokemon pokemon = pokemonDAO.getPokemonById(100);
        int numPokedex = 100;
        String nombre = "Voltorb";
        assertEquals(numPokedex, pokemon.getNumPokedex(), "El id esperado no cincide con el recibido");
        assertEquals(nombre, pokemon.getNombre(), "El nombre esperado no coincide con el recibido");

    }
}
