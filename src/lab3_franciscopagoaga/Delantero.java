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
public class Delantero extends Jugador {
    private int nivel;
    private double altura;
    private String velocidad;
    private double prom_goles;

    public Delantero(int nivel, double altura, String velocidad, double prom_goles, String nombre, String apellido, int edad, String estado, String pais, String pie, int numero, double precio, String equipo) {
        super(nombre, apellido, edad, estado, pais, pie, numero, precio, equipo);
        this.nivel = nivel;
        this.altura = altura;
        this.velocidad = velocidad;
        this.prom_goles = prom_goles;
    }

    public int getNivel() {
        return nivel;
    }

    public double getAltura() {
        return altura;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public double getProm_goles() {
        return prom_goles;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public void setProm_goles(double prom_goles) {
        this.prom_goles = prom_goles;
    }

    @Override
    public String toString() {
        return "Delantero{" + "nivel=" + nivel + ", altura=" + altura + ", velocidad=" + velocidad + ", prom_goles=" + prom_goles + '}';
    }
    
    
}
    
