
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases01;

public class Ejecutable {

    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();

        // Se asigna valores particulares al objeto
        hospital.nombre = "Isidro Ayora";
        hospital.numeroCamas = 100;
        hospital.numeroEmpleados = 500;
        hospital.presupuesto = 560340.43;

        // Se presenta valores en pantalla
        System.out.printf("%s - %d - %.2f - %d \n", hospital.nombre,
                hospital.numeroCamas, hospital.presupuesto,
                hospital.numeroEmpleados);

        // System.out.println(hospital.nombre + "-" + hospital.numeroCamas);
        // un objeto de tipo Hospital
        Hospital hospitalNorte = new Hospital();
        hospitalNorte.nombre = "Hospital del Norte";
        hospitalNorte.numeroCamas = 100;
        hospitalNorte.numeroEmpleados = 500;
        hospitalNorte.presupuesto = 560340.43;
        System.out.printf("%s - %d - %.2f - %d \n", hospitalNorte.nombre,
                hospitalNorte.numeroCamas, hospitalNorte.presupuesto,
                hospitalNorte.numeroEmpleados);
        //Roberto Bustamante
    }
}
