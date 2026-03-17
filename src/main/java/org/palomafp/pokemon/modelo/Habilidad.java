package org.palomafp.pokemon.modelo;

/**
 * Representa una habilidad que puede tener uno o varios Pokémon.
 *
 * <p>Una habilidad tiene un nombre y una descripción que detalla su
 * funcionamiento/efectos secundarios.</p>
 */
public class Habilidad {
    // Nombre de la habilidad
    private String nombre;
    // Descripción de la habilidad junto con sus efectos secundarios
    private String descripcion;

    /**
     * Crea una habilidad con nombre y descripción.
     *
     * @param nombre nombre de la habilidad
     * @param descripcion descripción de la habilidad
     */
    public Habilidad(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /**
     * Crea una habilidad sin inicializar sus campos.
     */
    public Habilidad() {
    }

    /**
     * Obtiene el nombre de la habilidad.
     *
     * @return el nombre de la habilidad
     */
    public String getNombre() { return nombre; }

    /**
     * Obtiene la descripción de la habilidad.
     *
     * @return la descripción de la habilidad
     */
    public String getDescripcion() { return descripcion; }

    /**
     * Establece el nombre de la habilidad.
     *
     * @param nombre nombre de la habilidad
     */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /**
     * Establece la descripción de la habilidad.
     *
     * @param descripcion descripción de la habilidad
     */
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    /**
     * Representación en texto de la habilidad (para depuración).
     *
     * @return cadena con los valores de los campos
     */
    @Override
    public String toString() {
        return "Habilidad{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
