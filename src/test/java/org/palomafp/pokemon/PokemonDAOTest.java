package org.palomafp.pokemon;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.palomafp.pokemon.modelo.Pokemon;

class PokemonDAOTest {


    @Test
    void testpokemon() {

        PokemonDAO pokemonDAO = new PokemonDAO();
        Pokemon shuckle = pokemonDAO.getPokemon();
        assertNotNull(shuckle, "El resultado no debe ser nulo, cuchurrumin");
    }
}
