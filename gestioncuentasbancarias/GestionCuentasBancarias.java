/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestioncuentasbancarias;

/**
 *
 * @author davot
 */
public class GestionCuentasBancarias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CuentaBanco cuenta = new CuentaBanco("12345", 1000);
     
        System.out.println("Saldo actual: " + cuenta.consultarSaldo());

        cuenta.depositar(500);

        cuenta.retirar(200);
        cuenta.retirar(2000); 

        System.out.println("Saldo final: " + cuenta.consultarSaldo());
    }
}