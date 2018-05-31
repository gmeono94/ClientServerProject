package com.Villagrana.Vanesa.Modelos;

public class Transferencia {


    /*Nota para documentaciòn:
    Tipo 1: Entrante
    Tipo 2: Saliente
    Por lo tanto si es Tipo 1:
    Nombre usuario ---> Usuario Origen
    cuenta Usuario ---> Cuenta Origen

    Si es tipo 2:
    Cambiar origen por destino
     */

    private String nombreUsuario;
    private String cuentaUsuario;
    private int tipo;
    private String identificador;


    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCuentaUsuario() {
        return cuentaUsuario;
    }

    public void setCuentaUsuario(String cuentaUsuario) {
        this.cuentaUsuario = cuentaUsuario;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
}
