/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temporizadoralarma;

/**
 *
 * @author davot
 */
public class Alarma {
    
    private int tiempoObjetivo;

    // Constructor
    public Alarma(int tiempoObjetivo) {
        this.tiempoObjetivo = tiempoObjetivo;
    }

    // Método para obtener el tiempo objetivo de la alarma
    public int getTiempoObjetivo() {
        return tiempoObjetivo;
    }

    // Método para activar la alarma
    public void activar() {
        System.out.println("¡Alarma activada! El tiempo objetivo de " + tiempoObjetivo + " segundos ha sido alcanzado.");
    }
}