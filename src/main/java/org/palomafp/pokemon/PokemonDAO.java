package org.palomafp.pokemon;

import java.util.ArrayList;
import java.util.List;

import org.palomafp.pokemon.modelo.Estadisticas;
import org.palomafp.pokemon.modelo.Genero;
import org.palomafp.pokemon.modelo.Pokemon;
import org.palomafp.pokemon.modelo.Tipo;

public class PokemonDAO {
    
    private List<Pokemon> listPokemon = null;

    public PokemonDAO () {
        
        listPokemon = new ArrayList();
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
        
        // Crear un rhydon
        Estadisticas estadisticas3 = new Estadisticas(105, 130, 120, 45, 45, 40);
                
        Pokemon Rhydon = new Pokemon(112, "Rhydon");
        Rhydon.setEstadisticas(estadisticas3);
        Rhydon.setGenero(Genero.MACHO);

        Tipo tipoTierra = new Tipo("Tierra");
        
        Rhydon.addTipo(tipoTierra);
        Rhydon.addTipo(tipoRoca);


    }


    public Pokemon getPokemonRandom()
    {
        return listPokemon.get((int)(Math.random()+listPokemon.size()-1));   
    }

    
    public List<Pokemon> getAllPokemon()
    {
        List<Pokemon> list = new ArrayList<>();
        for (int i = 0; i < listPokemon.size(); i++) 
        {
            list.add(listPokemon.get(i));    
        }   
        return list;
    }


    public Pokemon getPokemonById(int id)
    {
        return listPokemon.get(id);
    }


}
