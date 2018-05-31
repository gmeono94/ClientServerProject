package com.Villagrana.Vanesa.Modelos;

public class Movimiento {

    private int tipo;
    private double monto;
    private String fecha;
    private String identificador;
    private Transferencia transferencia;
    private String cuenta;



    /*TIPO MOVIMIENTO

    1: Compra
    2: Deposito en Efectivo
    3: Transferencia a otra cuenta
    4: Deposito por Transferencia
     */



    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Transferencia getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(Transferencia transferencia) {
        this.transferencia = transferencia;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

}
