/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package daw_ed04_clon;

public class Main {
    public static void main(String[] args) {
        operaciones();
    }

    public static void operaciones() {
        CCuenta a;
        double saldoA;

        a = new CCuenta("Felipe Segundo","2222-2222-22-1230456789", 2222);
        saldoA = a.getSaldo();
        System.out.println("El saldo actual es"+ saldoA );

        try {
            a.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            a.ingresar(600);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
        System.out.println("Datos de la cuenta: "+ a.nombre + a.getCuentaCorriente() + a.saldo + a.getTipoInteres());
    }
}
