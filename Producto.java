/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrodeproductoinventario;

/**
 *
 * @author davot
 */
public class Producto {
    private String codigo;
    private String nombre;
    private double precio;

    // Constructor para inicializar el producto con un código, nombre y precio
    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        setPrecio(precio); // Usamos el setter para validar el precio
    }

    // Método getter para obtener el código del producto
    public String getCodigo() {
        return codigo;
    }

    // Método setter para establecer el código del producto
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // Método getter para obtener el nombre del producto
    public String getNombre() {
        return nombre;
    }

    // Método setter para establecer el nombre del producto
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método getter para obtener el precio del producto
    public double getPrecio() {
        return precio;
    }

    // Método setter para establecer el precio del producto, con validación
    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo. El precio no se ha cambiado.");
        }
    }
}