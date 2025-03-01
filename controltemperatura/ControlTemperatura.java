/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controltemperatura;

/**
 *
 * @author davot
 */
public class ControlTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Termometro termometro = new Termometro(25.0);

        System.out.println("Temperatura en Celsius: " + termometro.obtenerTemperaturaCelsius());

        double temperaturaFahrenheit = termometro.convertirACelsiusAFahrenheit();
        System.out.println("Temperatura en Fahrenheit: " + temperaturaFahrenheit);

        double temperaturaKelvin = termometro.convertirACelsiusAKelvin();
        System.out.println("Temperatura en Kelvin: " + temperaturaKelvin);

        termometro.establecerTemperaturaCelsius(30.0);
        
        System.out.println("Nueva temperatura en Celsius: " + termometro.obtenerTemperaturaCelsius());

        System.out.println("Nueva temperatura en Fahrenheit: " + termometro.convertirACelsiusAFahrenheit());
        System.out.println("Nueva temperatura en Kelvin: " + termometro.convertirACelsiusAKelvin());
    }
}