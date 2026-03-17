package org.palomafp.pokemon.modelo;
/**
 * Clase que determ9ina las estadisticas de un Pokémon
 */
public class Estadisticas {
    //Puntos de salud
    private int hp;
    //Ataque físico
    private int atk;
    //Defensa fisica
    private int def;
    //Ataque especial
    private int atkSp;
    //Defensa especial
    private int defSp;
    //Velocidad
    private int spe;

    /**
     * Constructor con todas las estadisticas de uun Pokémon
     * @param hp determina la salud
     * @param atk determina el ataque fisico
     * @param def determina la defensa fisica
     * @param atkSp determina el ataque especial
     * @param defSp determina la defensa especial
     * @param spe determina la velocidad
     */
    public Estadisticas(int hp, int atk, int def, int atkSp, int defSp, int spe) {
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.atkSp = atkSp;
        this.defSp = defSp;
        this.spe = spe;
    }

    /**
     * Constructor por defecto
     */
    public Estadisticas() {
    }


    /**
     * Método get del valor de la salud
     * @return devuelve el valor de la salud
     */
    public int getHp() { return hp; }
    /**
     * Método get del valor del ataque fisico
     * @return devuelve el valor del ataque fisico
     */
    public int getAtk() { return atk; }
    /**
     * Método get del valor de la defensa fisica
     * @return devuelve el valor de la defensa fisica
     */
    public int getDef() { return def; }
    /**
     * Método get del valor del ataque especial
     * @return devuelve el valor del ataque especial
     */
    public int getAtkSp() { return atkSp; }
    /**
     * Método get del valor de la defensa especial
     * @return devuelve el valor de la defensa especial
     */
    public int getDefSp() { return defSp; }
    /**
     * Método get del valor de la salud
     * @return devuelve el valor de la salud
     */
    public int getSpe() { return spe; }

    /**
     * Método set del valor de la salud
     * @param hp recibe el valor de salud a establecer como parametro de entrada
     */
    public void setHp(int hp) { this.hp = hp; }
    /**
     * Método set del valor del ataque fisico
     * @param atk recibe el valor del ataque fisico a establecer como parametro de entrada
     */
    public void setAtk(int atk) { this.atk = atk; }
    /**
     * Método set del valor de la defensa fisica
     * @param def recibe el valor de la defensa fisica a establecer como parametro de entrada
     */
    public void setDef(int def) { this.def = def; }
    /**
     * Método set del valor del ataque especial
     * @param atkSp recibe el valor del ataque especial a establecer como parametro de entrada
     */
    public void setAtkSp(int atkSp) { this.atkSp = atkSp; }
    /**
     * Método set del valor de la defensa especial
     * @param defSp recibe el valor de la defensa especial a establecer como parametro de entrada
     */
    public void setDefSp(int defSp) { this.defSp = defSp; }
    /**
     * Método set del valor de la velocidad
     * @param spe recibe el valor de velocidad a establecer como parametro de entrada
     */
    public void setSpe(int spe) { this.spe = spe; }

    /**
     * Override del método to string para mostrar la información de las estadisticas
     */
    @Override
    public String toString() {
        return "Estadisticas{" +
                "hp=" + hp +
                ", atk=" + atk +
                ", def=" + def +
                ", atkSp=" + atkSp +
                ", defSp=" + defSp +
                ", spe=" + spe +
                '}';
    }
}
