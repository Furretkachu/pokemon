package org.palomafp.pokemon;

import org.palomafp.pokemon.modelo.Pokemon;
import org.palomafp.pokemon.modelo.Estadisticas;
import org.palomafp.pokemon.modelo.Genero;
import org.palomafp.pokemon.modelo.Tipo;

/**
 * Aplicación de Pokémon
 */
public class App 
{
    public static void main( String[] args )
    {
        // Crear estadísticas para Shuckle
        Estadisticas estadisticas = new Estadisticas(20, 10, 230, 10, 230, 5);
        
        // Crear un Shuckle
        Pokemon shuckle = new Pokemon(213, "Shuckle");
        shuckle.setEstadisticas(estadisticas);
        shuckle.setGenero(Genero.MACHO);
        
        // Agregar tipos
        Tipo tipoRoca = new Tipo("Roca");
        Tipo tipoInsecto = new Tipo("Insecto");
        shuckle.addTipo(tipoRoca);
        shuckle.addTipo(tipoInsecto);
        
        // Mostrar información del Pokémon
        System.out.println("\n¡Se encontró un Pokémon salvaje!\n");
        System.out.println(shuckle);
        System.out.println();
    }
}
