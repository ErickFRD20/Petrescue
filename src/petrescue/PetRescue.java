/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package petrescue;

import java.time.LocalDate;
import java.time.Period;
import mascotas.EstadoSalud;
import mascotas.Mascota;
import mascotas.TipoMascota;
import mascotas.Zonas;

public class PetRescue {

    public static void main(String[] args) {
        System.out.println("--- PRUEBA DEL SISTEMA DE MASCOTAS --- \n");

        // 1. Creamos una mascota que ingresó hoy
        // Pasamos datos simulados para los Enums (usa los nombres exactos de tus Enums reales)
        Mascota mascota1 = new Mascota(
                101, 
                "Sasha", 
                LocalDate.now(), // Fecha de hoy
                2, 
                EstadoSalud.SALUDABLE, // Cambiar por un valor real de tu Enum EstadoSalud
                Zonas.INGRESO_CLINICA, // Cambiar por un valor real de tu Enum Zonas
                TipoMascota.PERRO // Cambiar por un valor real de tu Enum TipoMascota
        );

        // 2. Creamos otra mascota que ingresó hace unos meses (ejemplo: 10 de Marzo de 2026)
        LocalDate fechaPasada = LocalDate.of(2026, 3, 10);
        Mascota mascota2 = new Mascota(
                102, 
                "Firulais", 
                fechaPasada, 
                4, 
                EstadoSalud.CRITICO, 
                Zonas.INGRESO_CLINICA, 
                TipoMascota.PERRO
        );

        // 3. Probar el método toString() de ambas
        System.out.println("Datos de Mascota 1:");
        System.out.println(mascota1);
        System.out.println();

        System.out.println("Datos de Mascota 2:");
        System.out.println(mascota2);
        System.out.println("\n---------------------------------------\n");

        // 4. Probar específicamente el método estadia() que acabamos de corregir
        System.out.println("CÁLCULO DE ESTADÍAS EN TIEMPO REAL:");
        
        Period estadiaMascota2 = mascota2.estadia();
        System.out.println("La estadía de " + mascota2.getNombre() + " es de:");
        System.out.println(estadiaMascota2.getYears() + " años, " 
                           + estadiaMascota2.getMonths() + " meses y " 
                           + estadiaMascota2.getDays() + " días.");
    }
}
