package org.palomafp.pokemon.modelo;

import java.util.ArrayList;
import java.util.List;

public class Tipo {
    private String nombre;
    private List<Tipo> debilidades = new ArrayList<>();
    private List<Tipo> resistencias = new ArrayList<>();
    private List<Tipo> inmunidades = new ArrayList<>();
    private String propiedades;

    public Tipo(String nombre) {
        this.nombre = nombre;
    }

    public Tipo() {
    }

    public String getNombre() { return nombre; }
    public List<Tipo> getDebilidades() { return debilidades; }
    public List<Tipo> getResistencias() { return resistencias; }
    public List<Tipo> getInmunidades() { return inmunidades; }
    public String getPropiedades() { return propiedades; }

    public void setPropiedades(String propiedades) { this.propiedades = propiedades; }
    public void addDebilidad(Tipo t) { debilidades.add(t); }
    public void addResistencia(Tipo t) { resistencias.add(t); }
    public void addInmunidad(Tipo t) { inmunidades.add(t); }

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
