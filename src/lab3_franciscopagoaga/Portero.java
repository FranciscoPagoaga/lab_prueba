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
public class Portero extends Jugador {
    private int nivel_aereo;
    private int nivel_pies;

    public Portero(int nivel_aereo, int nivel_pies, String nombre, String apellido, int edad, String estado, String pais, String pie, int numero, double precio, String equipo) {
        super(nombre, apellido, edad, estado, pais, pie, numero, precio, equipo);
        this.nivel_aereo = nivel_aereo;
        this.nivel_pies = nivel_pies;
    }

    public int getNivel_aereo() {
        return nivel_aereo;
    }

    public int getNivel_pies() {
        return nivel_pies;
    }

    public void setNivel_aereo(int nivel_aereo) {
        this.nivel_aereo = nivel_aereo;
    }

    public void setNivel_pies(int nivel_pies) {
        this.nivel_pies = nivel_pies;
    }
}
