/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrodeproductoinventario;

/**
 *
 * @author davot
 */
public class RegistroDeProductoInventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto1 = new Producto("P001", "Camiseta", 29.99);

        System.out.println("Código: " + producto1.getCodigo());
        System.out.println("Nombre: " + producto1.getNombre());
        System.out.println("Precio: " + producto1.getPrecio());

        producto1.setPrecio(-15.50); // No debe permitir el cambio

        producto1.setPrecio(25.50);
        System.out.println("Nuevo precio: " + producto1.getPrecio());
    }
}