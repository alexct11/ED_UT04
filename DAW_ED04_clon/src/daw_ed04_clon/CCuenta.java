/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package daw_ed04_clon;

/**
 *
 * @author Alejandro Sánchez Segado
 * @version 1.0
 */

public class CCuenta {
    String nombre;
    private String cuentaCorriente; //numero de cuenta
    private String clave; //contraseña del acceso web
    double saldo;
    private double tipoInteres;

    public CCuenta()
    {
    }

    /**
     *
     * @param nom
     * @param cue
     * @param sal
     */
    public CCuenta(String nom, String cue, double sal)
    {
        nombre=nom;
        cuentaCorriente=cue;
        saldo=sal;
    }

    /**
     * Metodo que permite modificar el nombre del titular
     * @param nom
     */

    public void setNombre(String nom)
    {
        nombre=nom;
    }

    /**
     * Metodo para consultar el nombre del titular de la cuenta corriente
     * @return nombre del titular de lac cuenta
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * Metodo para consultar el saldo de la cuenta corriente
     * @return saldo actual 
     */
    public double getSaldo()
    {
        return saldo;
    }

    /**
     * Metodo para ingresar una cantidad a la cuenta corriente
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Metodo para retirar una cantidad de dinero de la cuenta
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    public double porcentaje(double tantoPorCiento){
        return calcularPorcentaje(tantoPorCiento);
        
    }

    /**
     * Metodo que calcula el tanto por ciento del saldo
     * @param tantoPorCiento
     */
    public double calcularPorcentaje(double tantoPorCiento) {
        return saldo*tantoPorCiento/100;
    }

    /**
     * Metodo para consultar el numero de la cuenta corriente
     * @return numero de cuenta
     */

    public String getCuentaCorriente() {
        return cuentaCorriente;
    }

    /**
     * Metodo para consultar la clave de la cuenta corriente
     * @return clave de la cuenta
     */
    public String getClave() {
        return clave;
    }

    /**
     * Metodo para poner una nueva clave a la cuenta
     * @param clave
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * Metodo para consultar el tipo de interes
     * @return tipo de interes
     */
    public double getTipoInteres() {
        return tipoInteres;
    }
}
