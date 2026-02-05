package org.palomafp.pokemon.modelo;

public class Ataque {
    private String nombre;
    private int danyo;
    private int precision;
    private int pp;
    private Tipo tipo;
    private Efecto efecto;

    public Ataque(String nombre, int danyo, int precision, int pp, Tipo tipo, Efecto efecto) {
        this.nombre = nombre;
        this.danyo = danyo;
        this.precision = precision;
        this.pp = pp;
        this.tipo = tipo;
        this.efecto = efecto;
    }

    public Ataque() {
    }

    public String getNombre() { return nombre; }
    public int getDanyo() { return danyo; }
    public int getPrecision() { return precision; }
    public int getPp() { return pp; }
    public Tipo getTipo() { return tipo; }
    public Efecto getEfecto() { return efecto; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDanyo(int danyo) { this.danyo = danyo; }
    public void setPrecision(int precision) { this.precision = precision; }
    public void setPp(int pp) { this.pp = pp; }
    public void setTipo(Tipo tipo) { this.tipo = tipo; }
    public void setEfecto(Efecto efecto) { this.efecto = efecto; }

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
