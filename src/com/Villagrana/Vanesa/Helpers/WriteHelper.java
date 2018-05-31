package com.Villagrana.Vanesa.Helpers;

import com.Villagrana.Vanesa.Modelos.Cuenta;
import com.Villagrana.Vanesa.Modelos.Movimiento;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteHelper {

    private static String NOMBRE_ARCHIVO_CUENTAS = "cuentas.txt";
    private static String NOMBRE_ARCHIVO_PERSONAS = "personas.txt";
    private static String NOMBRE_ARCHIVO_MOVIMIENTOS = "movimientos.txt";
    private static String NOMBRE_ARCHIVO_TRANSFERENCIAS = "transferencias.txt";
    private static char CARACTER_DIVISIOR = '&';


    public void writeNewAccount(Cuenta cuenta) {
        char c = CARACTER_DIVISIOR;
        FileWriter cuentaWriter = null;
        FileWriter personaWriter = null;
        try {
            personaWriter = new FileWriter(NOMBRE_ARCHIVO_PERSONAS);
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter printWriter = new PrintWriter(personaWriter);

        String noCuenta = cuenta.getNumeroDeCuenta();
        String nombre = cuenta.getPersona().getNombre();
        String apellido = cuenta.getPersona().getApellido();
        String direccion = cuenta.getPersona().getDireccion();
        String cumpleanios = cuenta.getPersona().getCumpleAnios();


        /*NOTA:
        Identificamos EN LOS ARCHIVOS a que persona le pertenece la cuenta, al añadir la columna
        numeroDeCuenta en el renglon de archivo.
         */

        printWriter.print(noCuenta + c + nombre + c + apellido + c + direccion + c + cumpleanios);
        try {
            personaWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ///Hasta aqui guardamos la persona en el archivo, momento de guardar los datos de la cuenta;
        double fondos = cuenta.getFondos();
        String password = cuenta.getPassword();


        try {
            cuentaWriter = new FileWriter(NOMBRE_ARCHIVO_CUENTAS);
        } catch (IOException e) {
            e.printStackTrace();
        }
        printWriter = new PrintWriter(cuentaWriter);

        printWriter.print(noCuenta + c + password + fondos);
        printWriter.close();


    }

    public void writeNewMovement(Movimiento movimiento) {
        char c = CARACTER_DIVISIOR;
        PrintWriter printWriter = null;
        if (movimiento.getTipo() > 2) {
            FileWriter transferenciaWriter = null;

            try {
                transferenciaWriter = new FileWriter(NOMBRE_ARCHIVO_TRANSFERENCIAS);
            } catch (IOException e) {
                e.printStackTrace();

                printWriter = new PrintWriter(transferenciaWriter);
                int tipo = movimiento.getTransferencia().getTipo();
                String nOrigen = movimiento.getTransferencia().getNombreUsuario();
                String cOrigen = movimiento.getTransferencia().getCuentaUsuario();
                String identificador = movimiento.getTransferencia().getIdentificador();
                printWriter.print(identificador + c + tipo + nOrigen + c + cOrigen);
                printWriter.close();

            }
        }

        FileWriter movimientoWriter = null;

        try {
            movimientoWriter = new FileWriter(NOMBRE_ARCHIVO_MOVIMIENTOS);
        } catch (IOException e) {
            e.printStackTrace();
        }

        printWriter = new PrintWriter(movimientoWriter);

        String cuenta = movimiento.getCuenta();
        String identificador = movimiento.getIdentificador();
        int tipo = movimiento.getTipo();
        String fecha = movimiento.getFecha();
        double monto = movimiento.getMonto();

        printWriter.print(cuenta + c + identificador + c + tipo + c + fecha + c + monto);
        printWriter.close();


    }

}
