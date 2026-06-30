/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotas;

import java.time.LocalDate;
import java.time.Period;
import static mascotas.Zonas.INGRESO_CLINICA;

/**
 *
 * @author Dylan
 */
public class Mascota {
    int chip;
    String nombre;
    LocalDate fechaIngreso;
    Period estadia;
    int edadAprox;
    EstadoSalud estadoSalud;
    Zonas zonaMascota;
    TipoMascota tipo;

    public int getChip() {
        return chip;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public int getEdadAprox() {
        return edadAprox;
    }

    public EstadoSalud getEstadoSalud() {
        return estadoSalud;
    }

    public Zonas getZonaMascota() {
        return zonaMascota;
    }

    public TipoMascota getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdadAprox(int edadAprox) {
        this.edadAprox = edadAprox;
    }

    public void setEstadoSalud(EstadoSalud estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public void setAreaMascota(Zonas zonaMascota) {
        this.zonaMascota = zonaMascota;
    }

    public void setTipo(TipoMascota tipo) {
        this.tipo = tipo;
    }

    public Period estadia(){
        if (this.fechaIngreso == null) {
            return Period.ZERO;
        }
        return Period.between(fechaIngreso, LocalDate.now());
    }
    
    public Mascota(int chip, String nombre, LocalDate fechaIngreso, int edadAprox, EstadoSalud estadoSalud, Zonas areaMascota, TipoMascota tipo) {
        this.chip = chip;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.edadAprox = edadAprox;
        this.estadoSalud = estadoSalud;
        this.zonaMascota = INGRESO_CLINICA;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Mascota{" + "chip=" + chip + ", nombre=" + nombre + ", fechaIngreso=" + fechaIngreso + ", edadAprox=" + edadAprox + ", estadoSalud=" + estadoSalud + ", zonaMascota=" + zonaMascota + ", tipo=" + tipo + '}';
    }
    
    
    
}
