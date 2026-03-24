package org.palomafp.pokemon.modelo;

/**
 * Clase que define las propiedades de un ataque, este puede ser aprendido por uno o varios Pokémon
 */
public class Ataque {
    //Nombre con el que se identifica a el ataque
    private String nombre;
    //Cantidad de daño del ataque (de 0 a 250)
    private int danyo;
    //Precision del ataque (de 50 a 101)
    private int precision;
    //Power Points, indica las veces que se puedde usar un ataque (de 4 a 64)
    private int pp;
    //Indica el tipo del ataque, este determina sus eficacias, ineficacias...
    private Tipo tipo;
    //Tipo de efecto del movimiento (Físico, Especial o de estado)
    private Efecto efecto;

    /**
     * Constructor con todos los parametros del ataque
     * @param nombre el nombre del ataque
     * @param danyo el daño que causa el ataque
     * @param precision la precisión del ataque
     * @param pp los puntos de poder del ataque
     * @param tipo el tipo del ataque
     * @param efecto el efecto del ataque
     */
    public Ataque(String nombre, int danyo, int precision, int pp, Tipo tipo, Efecto efecto) {
        this.nombre = nombre;
        this.danyo = danyo;
        this.precision = precision;
        this.pp = pp;
        this.tipo = tipo;
        this.efecto = efecto;
    }

    /**
     * Constructor por defecto
     */
    public Ataque() {
    }

    /**
     * Método get del nombre del ataque
     * @return devuelve el nombre del ataque
     */
    public String getNombre() { return nombre; }
    /**
     * Método get del daño del ataque
     * @return devuelve el daño del ataque
     */
    public int getDanyo() { return danyo; }
    /**
     * Método get de la precisión del ataque
     * @return devuelve la precisión del ataque
     */
    public int getPrecision() { return precision; }
    /**
     * Método get de los pp del ataque
     * @return devuelve los pp del ataque
     */
    public int getPp() { return pp; }
    /**
     * Método get del tipo del ataque
     * @return devuelve el tipo del ataque
     */
    public Tipo getTipo() { return tipo; }
    /**
     * Método get del efecto del ataque
     * @return devuelve el efecto del ataque
     */
    public Efecto getEfecto() { return efecto; }

    /**
     * Método set del nombre del ataque
     * @param nombre recibe el nombre a establecer como parametro de entrada
     */
    public void setNombre(String nombre) { this.nombre = nombre; }
    /**
     * Método set del daño del ataque
     * @param danyo recibe el daño a establecer como parametro de entrada
     */
    public void setDanyo(int danyo) { this.danyo = danyo; }
    /**
     * Método set del nombre del ataque
     * @param precision recibe la precision a establecer como parametro de entrada
     */
    public void setPrecision(int precision) { this.precision = precision; }
    /**
     * Método set del nombre del ataque
     * @param pp recibe los pp a establecer como parametro de entrada
     */
    public void setPp(int pp) { this.pp = pp; }
    /**
     * Método set del nombre del ataque
     * @param tipo recibe el tipo a establecer como parametro de entrada
     */
    public void setTipo(Tipo tipo) { this.tipo = tipo; }
    /**
     * Método set del nombre del ataque
     * @param efecto recibe el efecto a establecer como parametro de entrada
     */
    public void setEfecto(Efecto efecto) { this.efecto = efecto; }

    /**
     * Override del método to string para mostrar la infromación de un ataque
     */
    @Override
    public String toString() {
        return "Ataque{" +
                "nombre='" + nombre + '\'' +
                ", danyo=" + danyo +
                ", precision=" + precision +
                ", pp=" + pp +
                ", tipo=" + (tipo != null ? tipo.getNombre() : "null") +
                ", efecto=" + efecto +
                '}';
    }
}
