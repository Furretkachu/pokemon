package org.palomafp.pokemon.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un tipo de Pokémon (Fuego, Agua, Planta, etc.).
 *
 * <p>Los tipos se usan para determinar fortalezas, debilidades e inmunidades
 * en combate.</p>
 */
public class Tipo {
    private String nombre;
    private List<Tipo> debilidades = new ArrayList<>();
    private List<Tipo> resistencias = new ArrayList<>();
    private List<Tipo> inmunidades = new ArrayList<>();
    private String propiedades;

    /**
     * Crea un tipo con nombre.
     *
     * @param nombre nombre del tipo
     */
    public Tipo(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Crea un tipo sin inicializar sus campos.
     */
    public Tipo() {
    }

    /**
     * Obtiene el nombre del tipo.
     *
     * @return nombre del tipo
     */
    public String getNombre() { return nombre; }

    /**
     * Obtiene los tipos a los que este tipo es débil.
     *
     * @return lista de tipos que son efectivos contra este tipo
     */
    public List<Tipo> getDebilidades() { return debilidades; }

    /**
     * Obtiene los tipos a los que este tipo resiste.
     *
     * @return lista de tipos a los que este tipo resiste
     */
    public List<Tipo> getResistencias() { return resistencias; }

    /**
     * Obtiene los tipos a los que este tipo es inmune.
     *
     * @return lista de tipos a los que este tipo es inmune
     */
    public List<Tipo> getInmunidades() { return inmunidades; }

    /**
     * Obtiene propiedades adicionales del tipo.
     *
     * @return propiedades del tipo
     */
    public String getPropiedades() { return propiedades; }

    /**
     * Establece propiedades adicionales del tipo.
     *
     * @param propiedades propiedades descriptivas
     */
    public void setPropiedades(String propiedades) { this.propiedades = propiedades; }

    /**
     * Añade un tipo que debilita a este tipo.
     *
     * @param t tipo que causa debilidad
     */
    public void addDebilidad(Tipo t) { debilidades.add(t); }

    /**
     * Añade un tipo al que este tipo resiste.
     *
     * @param t tipo resistente
     */
    public void addResistencia(Tipo t) { resistencias.add(t); }

    /**
     * Añade un tipo al que este tipo es inmune.
     *
     * @param t tipo inmune
     */
    public void addInmunidad(Tipo t) { inmunidades.add(t); }

    /**
     * Representación en texto del tipo que incluye el número de debilidades,
     * resistencias e inmunidades.
     *
     * @return cadena con los principales valores del tipo
     */
    @Override
    public String toString() {
        return "Tipo{" +
                "nombre='" + nombre + '\'' +
                ", debilidades=" + debilidades.size() +
                ", resistencias=" + resistencias.size() +
                ", inmunidades=" + inmunidades.size() +
                ", propiedades='" + propiedades + '\'' +
                '}';
    }
}
