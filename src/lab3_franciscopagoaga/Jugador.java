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
public class Jugador {
    private String nombre;
    private String apellido;
    private int edad;
    private String estado;
    private String pais;
    private String pie;
    private int numero;
    private double precio;
    private String equipo;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, int edad, String estado, String pais, String pie, int numero, double precio, String equipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estado = estado;
        this.pais = pais;
        this.pie = pie;
        this.numero = numero;
        this.precio = precio;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstado() {
        return estado;
    }

    public String getPais() {
        return pais;
    }

    public String getPie() {
        return pie;
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecio() {
        return precio;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setPie(String pie) {
        this.pie = pie;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    
    
}
