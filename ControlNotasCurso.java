/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlnotascurso;

/**
 *
 * @author davot
 */
public class ControlNotasCurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Curso curso = new Curso();

        // Crear estudiantes y agregar al curso
        Estudiante estudiante1 = new Estudiante("David Vasquez", "57894", 92);
        Estudiante estudiante2 = new Estudiante("Luisa Lopez", "85796", 87);
        Estudiante estudiante3 = new Estudiante("Walter Morales", "25463", 58); // No aprueba
        Estudiante estudiante4 = new Estudiante("Patricia Smith", "45358", 77);

        curso.agregarEstudiante(estudiante1);
        curso.agregarEstudiante(estudiante2);
        curso.agregarEstudiante(estudiante3);
        curso.agregarEstudiante(estudiante4);

        // Mostrar todos los estudiantes
        System.out.println("Estudiantes del curso:");
        curso.mostrarEstudiantes();

        // Calcular y mostrar el promedio del curso
        double promedio = curso.calcularPromedio();
        System.out.println("\nPromedio del curso: " + promedio);

        // Mostrar estudiantes aprobados
        System.out.println("\nEstudiantes aprobados:");
        for (Estudiante estudiante : curso.obtenerAprobados()) {
            System.out.println(estudiante.getNombre());
        }
    }
}