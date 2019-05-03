/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_franciscopagoaga;

/**
 *
 * @author Francisco Pagoaga
 */
public class Medio extends Jugador {
    private int nivel_creat;
    private int nivel_dom;
    private double prom_asis;

    public Medio(int nivel_creat, int nivel_dom, double prom_asis, String nombre, String apellido, int edad, String estado, String pais, String pie, int numero, double precio, String equipo) {
        super(nombre, apellido, edad, estado, pais, pie, numero, precio, equipo);
        this.nivel_creat = nivel_creat;
        this.nivel_dom = nivel_dom;
        this.prom_asis = prom_asis;
    }

    public int getNivel_creat() {
        return nivel_creat;
    }

    public int getNivel_dom() {
        return nivel_dom;
    }

    public double getProm_asis() {
        return prom_asis;
    }

    public void setNivel_creat(int nivel_creat) {
        this.nivel_creat = nivel_creat;
    }

    public void setNivel_dom(int nivel_dom) {
        this.nivel_dom = nivel_dom;
    }

    public void setProm_asis(double prom_asis) {
        this.prom_asis = prom_asis;
    }
}
