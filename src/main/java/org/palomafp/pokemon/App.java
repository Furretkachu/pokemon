package org.palomafp.pokemon;

import java.util.Scanner;

import org.palomafp.pokemon.modelo.Pokemon;


/**
 * Aplicación de Pokémon
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        //Generar el pokemon en pokemonDAO.java
        PokemonDAO pokemonDAO = new PokemonDAO();
        boolean salir = false;
        int opcion;

        while(!salir)
        {
            System.out.println("-------------------------------"
                            + "1. Mostrar Pokémon aleatorio"
                            + "\n2. Mostrar pokemon por nº de Pokédex"
                            + "\n3. Mostrar todos los Pokémon"
                            + "\n4. Salir >:("
                            + "-------------------------------");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("------------------------------------");
                    System.out.println("\n¡Se encontró un Pokémon salvaje!\n");
                    System.out.println(pokemonDAO.getPokemonRamdom);
                    System.out.println("------------------------------------");
                    break;
                
                case 2:
                    System.out.print("Introduce el número de Pokédex del pokemon que quieres mostrar: ");
                    opcion = sc.nextInt();
                    try{
                    System.out.println("------------------------------------");
                        System.out.println(pokemonDAO.getPokemonById);
                    System.out.println("------------------------------------");
                    }catch(Exception e)
                    {
                        System.err.println("ERROR: " + e);
                    }
                    break;

                case 3:
                    System.out.println("------------------------------------");
                    System.out.println(pokemonDAO.getAllPokemon);
                    System.out.println("------------------------------------");
                    break;

                case 4:
                    salir = true;
                    System.err.println("Saliendo...");
                default:
                    System.err.println("ERROR: Opción no válida");
                    break;
            }
        }
        // Mostrar información del Pokémon
        
    }
}