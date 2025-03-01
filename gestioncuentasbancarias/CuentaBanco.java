/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioncuentasbancarias;

/**
 *
 * @author davot
 */
public class CuentaBanco {
    
    private String numeroCuenta;
    private double saldo;
    
     public CuentaBanco(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0; // Si el saldo inicial es negativo, se establece en 0
            System.out.println("El saldo inicial no puede ser negativo. Se ha establecido en 0.");
        }
    }

    // Método para depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Se ha depositado " + monto + ". Saldo actual: " + saldo);
        } else {
            System.out.println("El monto a depositar debe ser mayor que 0.");
        }
    }

    // Método para retirar dinero
    public void retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            System.out.println("Se ha retirado " + monto + ". Saldo actual: " + saldo);
        } else if (monto > 0 && saldo < monto) {
            System.out.println("Fondos insuficientes para retirar " + monto + ". Saldo actual: " + saldo);
        } else {
            System.out.println("El monto a retirar debe ser mayor que 0.");
        }
    }

    // Método para consultar el saldo
    public double consultarSaldo() {
        return saldo;
    }

    // Método para obtener el número de cuenta
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
}