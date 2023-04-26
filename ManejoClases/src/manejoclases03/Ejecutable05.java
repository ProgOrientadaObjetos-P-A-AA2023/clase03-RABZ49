/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoclases03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Ejecutable05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        Hospital miHospital = new Hospital();
        System.out.println("Nombre:  ");
        String nombres = entrada.nextLine();
        System.out.println("Numero de camas:  ");
        int camas = entrada.nextInt();
        System.out.println("Presupuesto:  ");
        double presupuesto = entrada.nextDouble();
        miHospital.establecerNombre(nombres);
        miHospital.establecerNumeroCamas(camas);
        miHospital.establecerPresupuesto(presupuesto);

        System.out.printf("nombre:%s - Numero de camas: %d - "
                + "Presupuesto: %.2f\n", miHospital.obtenerNombre(),
                miHospital.obtenerNumeroCamas(),
                miHospital.obtenerPresupuesto());
        // Dar valores a los atributos
        //los valores ingresar por teclado

        //presentar los valores del objeto
    }
}
