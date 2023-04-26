/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases02;

public class Hospital {
    private String nombre;
    private int numeroCamas;
    private double presupuesto;

    public String establecerNombre() {
        return nombre;
    }

    public void obtenerNombre(String n) {
        nombre = n;
    }

    public int establecerNumeroCamas() {
        return numeroCamas;
    }

    public void obtenerNumeroCamas(int n) {
        numeroCamas = n;
    }

    public double establecerPresupuesto() {
        return presupuesto;
    }

    public void obtenerPresupuesto(double n) {
        presupuesto = n;
    }
    
}
