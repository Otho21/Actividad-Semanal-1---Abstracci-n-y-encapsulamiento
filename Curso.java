/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlnotascurso;

/**
 *
 * @author davot
 */
import java.util.ArrayList;
import java.util.List;

public class Curso {
    // Atributo privado para almacenar los estudiantes
    private List<Estudiante> estudiantes;

    // Constructor
    public Curso() {
        estudiantes = new ArrayList<>();
    }

    // Método para agregar un estudiante al curso
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    // Método para calcular el promedio de notas del curso
    public double calcularPromedio() {
        double sumaNotas = 0;
        for (Estudiante estudiante : estudiantes) {
            sumaNotas += estudiante.getNotaFinal();
        }
        return estudiantes.size() > 0 ? sumaNotas / estudiantes.size() : 0;
    }

    // Método para obtener la lista de estudiantes aprobados (nota >= 61)
    public List<Estudiante> obtenerAprobados() {
        List<Estudiante> aprobados = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.aprobo()) {
                aprobados.add(estudiante);
            }
        }
        return aprobados;
    }

    // Método para mostrar la lista de estudiantes con sus notas
    public void mostrarEstudiantes() {
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre() + 
                               ", Carnet: " + estudiante.getCarnet() + 
                               ", Nota Final: " + estudiante.getNotaFinal());
        }
    }
}
