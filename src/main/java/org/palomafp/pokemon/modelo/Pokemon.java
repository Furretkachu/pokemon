package org.palomafp.pokemon.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Modelo de un Pokémon con sus atributos básicos.
 *
 * <p>Incluye datos de la pokédex, estadísticas base, género, líneas de evolución,
 * tipos, habilidades y ataques.</p>
 */
public class Pokemon {
    private int numPokedex;
    private String nombre;
    private Estadisticas estadisticas;
    private Genero genero;
    private List<Pokemon> lineaEvolutiva = new ArrayList<>();
    private String requisitosEvolutivos;
    private List<Pokemon> formasAlternativas = new ArrayList<>();
    private List<Tipo> tipos = new ArrayList<>();
    private List<Habilidad> habilidades = new ArrayList<>();
    private List<Ataque> ataques = new ArrayList<>();

    /**
     * Crea un Pokémon mínimo con número de pokédex y nombre.
     *
     * @param numPokedex número de la pokédex
     * @param nombre nombre del Pokémon
     */
    public Pokemon(int numPokedex, String nombre) {
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.genero = Genero.DESCONOCIDO;
    }

    /**
     * Crea un Pokémon sin inicializar sus campos (usa valores por defecto).
     */
    public Pokemon() {
        this.genero = Genero.DESCONOCIDO;
    }

    /**
     * Crea un Pokémon con todos los campos.
     *
     * @param numPokedex número de la pokédex
     * @param nombre nombre del Pokémon
     * @param estadisticas estadísticas base
     * @param genero género (o {@link Genero#DESCONOCIDO} si es null)
     * @param lineaEvolutiva lista de evoluciones (puede ser null)
     * @param requisitosEvolutivos requisitos para evolucionar
     * @param formasAlternativas formas alternativas (puede ser null)
     * @param tipos tipos de Pokémon (puede ser null)
     * @param habilidades lista de habilidades (puede ser null)
     * @param ataques lista de ataques (puede ser null)
     */
    public Pokemon(int numPokedex, String nombre, Estadisticas estadisticas, Genero genero, List<Pokemon> lineaEvolutiva, String requisitosEvolutivos, List<Pokemon> formasAlternativas, List<Tipo> tipos, List<Habilidad> habilidades, List<Ataque> ataques) {
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.estadisticas = estadisticas;
        this.genero = genero != null ? genero : Genero.DESCONOCIDO;
        this.lineaEvolutiva = lineaEvolutiva != null ? lineaEvolutiva : new ArrayList<>();
        this.requisitosEvolutivos = requisitosEvolutivos;
        this.formasAlternativas = formasAlternativas != null ? formasAlternativas : new ArrayList<>();
        this.tipos = tipos != null ? tipos : new ArrayList<>();
        this.habilidades = habilidades != null ? habilidades : new ArrayList<>();
        this.ataques = ataques != null ? ataques : new ArrayList<>();
    }

    /**
     * Obtiene el número de la pokédex.
     *
     * @return número de la pokédex
     */
    public int getNumPokedex() { return numPokedex; }

    /**
     * Obtiene el nombre del Pokémon.
     *
     * @return nombre del Pokémon
     */
    public String getNombre() { return nombre; }

    /**
     * Obtiene las estadísticas base del Pokémon.
     *
     * @return estadísticas del Pokémon
     */
    public Estadisticas getEstadisticas() { return estadisticas; }

    /**
     * Obtiene el género del Pokémon.
     *
     * @return género del Pokémon
     */
    public Genero getGenero() { return genero; }

    /**
     * Obtiene la línea evolutiva del Pokémon.
     *
     * @return lista de Pokémon en la línea evolutiva
     */
    public List<Pokemon> getLineaEvolutiva() { return lineaEvolutiva; }

    /**
     * Obtiene los requisitos para evolucionar.
     *
     * @return requisitos de evolución
     */
    public String getRequisitosEvolutivos() { return requisitosEvolutivos; }

    /**
     * Obtiene las formas alternativas del Pokémon.
     *
     * @return lista de formas alternativas
     */
    public List<Pokemon> getFormasAlternativas() { return formasAlternativas; }

    /**
     * Obtiene los tipos del Pokémon.
     *
     * @return lista de tipos
     */
    public List<Tipo> getTipos() { return tipos; }

    /**
     * Obtiene las habilidades del Pokémon.
     *
     * @return lista de habilidades
     */
    public List<Habilidad> getHabilidades() { return habilidades; }

    /**
     * Obtiene los ataques del Pokémon.
     *
     * @return lista de ataques
     */
    public List<Ataque> getAtaques() { return ataques; }

    /**
     * Establece las estadísticas del Pokémon.
     *
     * @param estadisticas estadísticas base
     */
    public void setEstadisticas(Estadisticas estadisticas) { this.estadisticas = estadisticas; }

    /**
     * Establece el género del Pokémon.
     *
     * @param genero género del Pokémon
     */
    public void setGenero(Genero genero) { this.genero = genero; }

    /**
     * Establece los requisitos para evolucionar.
     *
     * @param requisitos requisitos de evolución
     */
    public void setRequisitosEvolutivos(String requisitos) { this.requisitosEvolutivos = requisitos; }

    /**
     * Agrega un Pokémon a la línea evolutiva.
     *
     * @param p Pokémon a agregar
     */
    public void addLineaEvolutiva(Pokemon p) { this.lineaEvolutiva.add(p); }

    /**
     * Agrega una forma alternativa.
     *
     * @param p forma alternativa a agregar
     */
    public void addFormaAlternativa(Pokemon p) { this.formasAlternativas.add(p); }

    /**
     * Agrega un tipo al Pokémon.
     *
     * @param t tipo a agregar
     */
    public void addTipo(Tipo t) { this.tipos.add(t); }

    /**
     * Agrega una habilidad al Pokémon.
     *
     * @param h habilidad a agregar
     */
    public void addHabilidad(Habilidad h) { this.habilidades.add(h); }

    /**
     * Agrega un ataque al Pokémon.
     *
     * @param a ataque a agregar
     */
    public void addAtaque(Ataque a) { this.ataques.add(a); }

    /**
     * Representación en texto del Pokémon, útil para depuración.
     *
     * @return cadena con los principales campos del Pokémon
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pokemon{");
        sb.append("numPokedex=").append(numPokedex);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", genero=").append(genero);
        sb.append(", estadisticas=").append(estadisticas);
        sb.append(", tipos=");
        if (tipos != null && !tipos.isEmpty()) {
            for (int i = 0; i < tipos.size(); i++) {
                if (i > 0) sb.append("/");
                sb.append(tipos.get(i).getNombre());
            }
        } else {
            sb.append("[]");
        }
        sb.append(", habilidades=");
        if (habilidades != null && !habilidades.isEmpty()) {
            for (int i = 0; i < habilidades.size(); i++) {
                if (i > 0) sb.append(", ");
                sb.append(habilidades.get(i).getNombre());
            }
        } else {
            sb.append("[]");
        }
        sb.append(", ataques=");
        if (ataques != null && !ataques.isEmpty()) {
            for (int i = 0; i < ataques.size(); i++) {
                if (i > 0) sb.append(", ");
                sb.append(ataques.get(i).getNombre());
            }
        } else {
            sb.append("[]");
        }
        sb.append('}');
        return sb.toString();
    }
}
