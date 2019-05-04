/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_franciscopagoaga;
import java.util.ArrayList;
/**
 *
 * @author Francisco Pagoaga
 */
public class Equipo {
    private String nombre;
    private String palmar;
    private String ciudad;
    private double presupuesto;
    private ArrayList jugador=new ArrayList();

    public Equipo(String nombre, String palmar, String ciudad, double presupuesto) {
        this.nombre = nombre;
        this.palmar = palmar;
        this.ciudad = ciudad;
        this.presupuesto = presupuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPalmar() {
        return palmar;
    }

    public String getCiudad() {
        return ciudad;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public ArrayList getJugador() {
        return jugador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPalmar(String palmar) {
        this.palmar = palmar;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public void setJugador(ArrayList jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", palmar=" + palmar + ", ciudad=" + ciudad + ", presupuesto=" + presupuesto + '}';
    }
    
    
}
