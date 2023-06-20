/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jorge
 */
public class Puerto {
    private String nombrePuerto;
    private String[] nombresBarcos = new String[3];

    public Puerto() {
    }

    public Puerto(String nombrePuerto) {
        this.nombrePuerto = nombrePuerto;
    }

    public String getNombrePuerto() {
        return nombrePuerto;
    }

    public void setNombrePuerto(String nombrePuerto) {
        this.nombrePuerto = nombrePuerto;
    }

    public String[] getNombresBarcos() {
        return nombresBarcos;
    }

    public void setNombresBarcos(String[] nombresBarcos) {
        this.nombresBarcos = nombresBarcos;
    }

    @Override
    public String toString() {
        return "Puerto{" + "nombrePuerto=" + nombrePuerto + ", nombresBarcos=" + nombresBarcos + '}';
    }

    
}
