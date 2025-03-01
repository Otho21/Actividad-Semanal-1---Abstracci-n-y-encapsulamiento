/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temporizadoralarma;

/**
 *
 * @author davot
 */
public class Temporizador {
    private int tiempoActual; // En segundos
    private Alarma alarma;    // La alarma asociada al temporizador

    public Temporizador() {
        this.tiempoActual = 0;
        this.alarma = null;
    }

    public void iniciar() {
        // Simulación de incremento de tiempo (en un programa real, se usarían hilos para este proceso)
        System.out.println("Temporizador iniciado...");
        for (int i = 1; i <= 100; i++) {  // Simulamos 100 segundos para fines demostrativos
            tiempoActual = i;
            System.out.println("Tiempo transcurrido: " + tiempoActual + " segundos");
            verificarAlarma();  // Verificar si la alarma debe sonar
            try {
                Thread.sleep(1000);  // Pausa de 1 segundo entre cada incremento (simulando tiempo real)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void asociarAlarma(Alarma alarma) {
        this.alarma = alarma;
    }

    private void verificarAlarma() {
        if (alarma != null && tiempoActual == alarma.getTiempoObjetivo()) {
            alarma.activar();  // Activa la alarma si el tiempo objetivo se alcanza
        }
    }

    public int getTiempoActual() {
        return tiempoActual;
    }
}