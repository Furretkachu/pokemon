package org.palomafp.pokemon;

import org.junit.jupiter.api.Test;
import org.palomafp.pokemon.modelo.Pokemon;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AppTest {


    @Test
    void testpokemon() {

        PokemonDAO pokemonDAO = new PokemonDAO();
        Pokemon shuckle = pokemonDAO.getPokemon();
        assertNotNull(shuckle, "El resultado no debe ser nulo, cuchurrumin");
    }
}
