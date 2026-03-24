package org.palomafp.pokemon;

import java.util.ArrayList;
import java.util.List;

import org.palomafp.pokemon.modelo.Estadisticas;
import org.palomafp.pokemon.modelo.Genero;
import org.palomafp.pokemon.modelo.Pokemon;
import org.palomafp.pokemon.modelo.Tipo;

/**
 * Clase de acceso a los datos
 */
public class PokemonDAO {
    //Lista que almacena todos nuestros Pokémon
    private List<Pokemon> listPokemon = null;
    /**
     * Constructor de la clase, genera los Pokémon
     */
    public PokemonDAO () {
        
        listPokemon = new ArrayList<>();
        // Crear un Shuckle
        Estadisticas estadisticas = new Estadisticas(20, 10, 230, 10, 230, 5);
              
        Pokemon shuckle = new Pokemon(213, "Shuckle");
        shuckle.setEstadisticas(estadisticas);
        shuckle.setGenero(Genero.MACHO);
        
        Tipo tipoRoca = new Tipo("Roca");
        Tipo tipoInsecto = new Tipo("Insecto");
        shuckle.addTipo(tipoRoca);
        shuckle.addTipo(tipoInsecto);

        listPokemon.add(shuckle);

        // Crear un voltorb
        Estadisticas estadisticas2 = new Estadisticas(40, 30, 50, 55, 55, 100);
                
        Pokemon Voltorb = new Pokemon(100, "Voltorb");
        Voltorb.setEstadisticas(estadisticas2);
        Voltorb.setGenero(Genero.DESCONOCIDO);

        Tipo tipoElectrico = new Tipo("Electrico");
        
        Voltorb.addTipo(tipoElectrico);
        listPokemon.add(Voltorb);
        
        // Crear un rhydon
        Estadisticas estadisticas3 = new Estadisticas(105, 130, 120, 45, 45, 40);
                
        Pokemon Rhydon = new Pokemon(112, "Rhydon");
        Rhydon.setEstadisticas(estadisticas3);
        Rhydon.setGenero(Genero.MACHO);

        Tipo tipoTierra = new Tipo("Tierra");
        
        Rhydon.addTipo(tipoTierra);
        Rhydon.addTipo(tipoRoca);
        listPokemon.add(Rhydon);


    }

    /**
     * Metodo para generar un Pokémon de manera aleaotria entre los almacenados
     * @return devuelve una instancia tipo Pokemon del Pokémon generado
     */
    public Pokemon getPokemonRandom()
    {
        return listPokemon.get((int)(Math.random() * listPokemon.size()));   
    }

    /**
     * Metodo para generar una lista de todos los Pokémon almacenados
     * @return devuelve la lista de objetos Pokémon generada
     */
    public List<Pokemon> getAllPokemon()
    {
        List<Pokemon> list = new ArrayList<>();
        for (int i = 0; i < listPokemon.size(); i++) 
        {
            list.add(listPokemon.get(i));    
        }   
        return list;
    }


    /**
     * Metodo para buscar un Pokémon por su id (número de Pokédex)
     * @param id Número de Pokédex del Pokémon a buscar
     * @return devuelve el Pokémon correspondiente al numero indicado
     */
    public Pokemon getPokemonById(int id)
    {
        int cont = 0;
        for(Pokemon pok : listPokemon)
        {
            if(pok.getNumPokedex() == id) {
                id = cont;
                break;
            }
            cont++;

        }
        return listPokemon.get(id);
    }

    @Override
    public String toString() {
        String strg = listPokemon.size() + ": | ";
        for (Pokemon p : listPokemon) {
            
            strg += p.getNumPokedex() + " | ";
        }
        return  strg;
    }

}
