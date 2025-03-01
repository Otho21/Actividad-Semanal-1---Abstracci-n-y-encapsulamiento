/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlnotascurso;

/**
 *
 * @author davot
 */
public class Estudiante {
    
 private String nombre;
    private String carnet;
    private double notaFinal;

    // Constructor
    public Estudiante(String nombre, String carnet, double notaFinal) {
        this.nombre = nombre;
        this.carnet = carnet;
        setNotaFinal(notaFinal); // Establece la nota final utilizando el setter
    }

    // Método getter para el nombre
    public String getNombre() {
        return nombre;
    }

    // Método getter para el carnet
    public String getCarnet() {
        return carnet;
    }

    // Método getter para la nota final
    public double getNotaFinal() {
        return notaFinal;
    }

    // Método setter para la nota final, validando que esté entre 0 y 100
    public void setNotaFinal(double notaFinal) {
        if (notaFinal >= 0 && notaFinal <= 100) {
            this.notaFinal = notaFinal;
        } else {
            System.out.println("La nota debe estar entre 0 y 100. Nota no válida.");
        }
    }

    // Método para verificar si el estudiante aprobó (nota >= 61)
    public boolean aprobo() {
        return this.notaFinal >= 61;
    }
}