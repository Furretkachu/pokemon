package org.palomafp.pokemon.modelo;

public class Estadisticas {
    private int hp;
    private int atk;
    private int def;
    private int atkSp;
    private int defSp;
    private int spe;

    public Estadisticas(int hp, int atk, int def, int atkSp, int defSp, int spe) {
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.atkSp = atkSp;
        this.defSp = defSp;
        this.spe = spe;
    }

    public Estadisticas() {
    }

    public int getHp() { return hp; }
    public int getAtk() { return atk; }
    public int getDef() { return def; }
    public int getAtkSp() { return atkSp; }
    public int getDefSp() { return defSp; }
    public int getSpe() { return spe; }

    public void setHp(int hp) { this.hp = hp; }
    public void setAtk(int atk) { this.atk = atk; }
    public void setDef(int def) { this.def = def; }
    public void setAtkSp(int atkSp) { this.atkSp = atkSp; }
    public void setDefSp(int defSp) { this.defSp = defSp; }
    public void setSpe(int spe) { this.spe = spe; }

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
