package org.palomafp.pokemon.modelo;

import java.util.ArrayList;
import java.util.List;

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

    public Pokemon(int numPokedex, String nombre) {
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.genero = Genero.DESCONOCIDO;
    }

    public Pokemon() {
        this.genero = Genero.DESCONOCIDO;
    }

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

    public int getNumPokedex() { return numPokedex; }
    public String getNombre() { return nombre; }
    public Estadisticas getEstadisticas() { return estadisticas; }
    public Genero getGenero() { return genero; }
    public List<Pokemon> getLineaEvolutiva() { return lineaEvolutiva; }
    public String getRequisitosEvolutivos() { return requisitosEvolutivos; }
    public List<Pokemon> getFormasAlternativas() { return formasAlternativas; }
    public List<Tipo> getTipos() { return tipos; }
    public List<Habilidad> getHabilidades() { return habilidades; }
    public List<Ataque> getAtaques() { return ataques; }

    public void setEstadisticas(Estadisticas estadisticas) { this.estadisticas = estadisticas; }
    public void setGenero(Genero genero) { this.genero = genero; }
    public void setRequisitosEvolutivos(String requisitos) { this.requisitosEvolutivos = requisitos; }

    public void addLineaEvolutiva(Pokemon p) { this.lineaEvolutiva.add(p); }
    public void addFormaAlternativa(Pokemon p) { this.formasAlternativas.add(p); }
    public void addTipo(Tipo t) { this.tipos.add(t); }
    public void addHabilidad(Habilidad h) { this.habilidades.add(h); }
    public void addAtaque(Ataque a) { this.ataques.add(a); }

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
