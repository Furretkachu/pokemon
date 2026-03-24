package org.palomafp.pokemon;

import java.util.Scanner;

import org.palomafp.pokemon.modelo.Pokemon;


/**
 * Aplicación de Pokémon
 */
public class App 
{
    /**
     * Constructor por defecto
     */
    public App() {
    }

    /**
     * Main, clase principal
     * @param args argumoentos que se pasarian al ejecutar por terminal
     */
    public static void main( String[] args )
    {
        //Scanner
        Scanner sc = new Scanner(System.in);
        //Objeto de acceso de datos
        PokemonDAO pokemonDAO = new PokemonDAO();
        //Instancia del pokemon regu+istrado actualmente
        Pokemon pokemon;
        //Boolean para el bucle
        boolean salir = false;
        //Opciones del menu
        int opcion;

        while(!salir)
        {
            System.out.println("-------------------------------"
                            + "\nNº Pokémon: " + pokemonDAO
                            + "\n1. Mostrar Pokémon aleatorio"
                            + "\n2. Mostrar pokemon por nº de Pokédex"
                            + "\n3. Mostrar todos los Pokémon"
                            + "\n4. Salir >:("
                            + "\n-------------------------------");
            
            try {
                opcion = sc.nextInt();
            }
            catch (Exception e) {
                opcion = -1;
                sc.nextLine();
            }

            switch (opcion) {
                case 1:
                    pokemon = pokemonDAO.getPokemonRandom();
                    System.out.println("------------------------------------");
                    System.out.println("\n¡Se encontró un Pokémon salvaje!\n");
                    System.out.println(pokemon);
                    System.out.println("------------------------------------");
                    break;
                
                case 2:
                    System.out.print("Introduce el número de Pokédex del pokemon que quieres mostrar: ");
                    opcion = sc.nextInt();
                    try{
                        pokemon = pokemonDAO.getPokemonById(opcion);
                        System.out.println("------------------------------------");
                        System.out.println(pokemon);
                        System.out.println("------------------------------------");
                    }catch(Exception e)
                    {
                        System.err.println("ERROR: " + e);
                    }
                    break;

                case 3:
                    System.out.println("------------------------------------");
                    for(Pokemon pok : pokemonDAO.getAllPokemon())
                    {
                        System.out.println("------------------------------------");
                        System.out.println(pok);
                        System.out.println("------------------------------------");
                    }
                    System.out.println("------------------------------------");
                    break;

                case 4:
                    salir = true;
                    System.err.println("Saliendo...");
                    break;
                default:
                    System.err.println("ERROR: Opción no válida");
                    break;
            }
        }
        sc.close();
    }
}