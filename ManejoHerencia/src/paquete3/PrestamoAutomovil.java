/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {
    private String tipoAutomovil;
    private String marcaAutomovil;
    private Persona garante1;
    private double valorAutomovil;
    private double valorMensualAutomovil;

    public PrestamoAutomovil(String c,String tAuto, String mAuto, Persona g1, double vAuto,Persona bene, int tMPres) {
        super(bene, tMPres);
        setCiudadPrestamo(c);
        tipoAutomovil = tAuto;
        marcaAutomovil = mAuto;
        garante1 = g1;
        valorAutomovil = vAuto;
    }
    @Override
    public void setCiudadPrestamo(String c){
        ciudadPrestamo = c.toLowerCase();
    }
    public String getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(String tAuto) {
        tipoAutomovil = tAuto;
    }

    public String getMarcaAutomovil() {
        return marcaAutomovil;
    }

    public void setMarcaAutomovil(String mAuto) {
        marcaAutomovil = mAuto;
    }

    public Persona getGarante1() {
        return garante1;
    }

    public void setGarante1(Persona g1) {
        garante1 = g1;
    }

    public double getValorAutomovil() {
        return valorAutomovil;
    }

    public void setValorAutomovil(double vAuto) {
        valorAutomovil = vAuto;
    }

    public double getValorMensualAutomovil() {
        return valorMensualAutomovil;
    }

    public void setValorMensualAutomovil() {
        valorMensualAutomovil = valorAutomovil/tiempoMesesPrestamo;
    }

    @Override
    public String toString() {
        String cadena = String.format("%sTipo Automovil: %s\nMarca Automovil: %s\nGarante\n%sValor Automovil: %.2f\nValor Mensual Automovil: %.2f\n"
                ,super.toString(),tipoAutomovil,marcaAutomovil,garante1,valorAutomovil,valorMensualAutomovil);
        return cadena;
    }
    
}
