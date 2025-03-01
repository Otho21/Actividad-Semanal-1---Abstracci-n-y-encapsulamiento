/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controltemperatura;

/**
 *
 * @author davot
 */
public class Termometro {
    private double temperaturaCelsius;

    // Constructor para inicializar la temperatura en grados Celsius
    public Termometro(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    // Método para obtener la temperatura en grados Celsius
    public double obtenerTemperaturaCelsius() {
        return temperaturaCelsius;
    }

    // Método para establecer la temperatura en grados Celsius
    public void establecerTemperaturaCelsius(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    // Método para convertir la temperatura de Celsius a Fahrenheit
    public double convertirACelsiusAFahrenheit() {
        return (temperaturaCelsius * 9/5) + 32;
    }

    // Método para convertir la temperatura de Celsius a Kelvin
    public double convertirACelsiusAKelvin() {
        return temperaturaCelsius + 273.15;
    }
}
