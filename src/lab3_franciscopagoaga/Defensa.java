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
public class Defensa extends Jugador {
    private int nivel_agresividad;
    private double altura;
    private double peso;
    private String velocidad;

    public Defensa(int nivel_agresividad, double altura, double peso, String velocidad, String nombre, String apellido, int edad, String estado, String pais, String pie, int numero, double precio, String equipo) {
        super(nombre, apellido, edad, estado, pais, pie, numero, precio, equipo);
        this.nivel_agresividad = nivel_agresividad;
        this.altura = altura;
        this.peso = peso;
        this.velocidad = velocidad;
    }
  
    public void setNivel_agresividad(int nivel_agresividad) {
        this.nivel_agresividad = nivel_agresividad;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public int getNivel_agresividad() {
        return nivel_agresividad;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getVelocidad() {
        return velocidad;
    }

    @Override
    public String toString() {
        return "Defensa{" + "nivel_agresividad=" + nivel_agresividad + ", altura=" + altura + ", peso=" + peso + ", velocidad=" + velocidad + '}';
    }
    
    
}
