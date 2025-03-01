/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temporizadoralarma;

/**
 *
 * @author davot
 */
public class TemporizadorAlarma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Temporizador temporizador = new Temporizador();

        // Crear una alarma con un tiempo objetivo de 10 segundos
        Alarma alarma = new Alarma(10);

        // Asociar la alarma al temporizador
        temporizador.asociarAlarma(alarma);

        // Iniciar el temporizador
        temporizador.iniciar();
    }
}