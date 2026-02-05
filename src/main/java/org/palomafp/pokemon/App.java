package org.palomafp.pokemon;

import org.palomafp.pokemon.modelo.Pokemon;


/**
 * Aplicación de Pokémon
 */
public class App 
{
    public static void main( String[] args )
    {
        //Generar el pokemon en pokemonDAO.java
        PokemonDAO pokemonDAO = new PokemonDAO();
        Pokemon shuckle = pokemonDAO.getPokemon();

        // Mostrar información del Pokémon
        System.out.println("\n¡Se encontró un Pokémon salvaje!\n");
        System.out.println(shuckle);
        System.out.println();
    }
}
