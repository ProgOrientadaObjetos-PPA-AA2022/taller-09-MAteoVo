/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo {
    protected Persona beneficiario;
    protected int tiempoMesesPrestamo;
    protected String ciudadPrestamo;

    public Prestamo(Persona bene, int tMPres, String cPre) {
        beneficiario = bene;
        tiempoMesesPrestamo = tMPres;
        ciudadPrestamo = cPre;
    }

    public Prestamo(Persona bene, int tMPres) {
        beneficiario = bene;
        tiempoMesesPrestamo = tMPres;
    }
    

    public Persona getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Persona bene) {
        beneficiario = bene;
    }

    public int getTiempoMesesPrestamo() {
        return tiempoMesesPrestamo;
    }

    public void setTiempoMesesPrestamo(int tMPres) {
        tiempoMesesPrestamo = tMPres;
    }

    public String getCiudadPrestamo() {
        return ciudadPrestamo;
    }

    public void setCiudadPrestamo(String cPres) {
       ciudadPrestamo = cPres;
    }
    
    public String toString() {
        String cadena = String.format("BENEFICIARIO\n%sTiempo de Prestamo: %d\nCiudad del Prestamo: %s\n"
                ,beneficiario,tiempoMesesPrestamo,ciudadPrestamo);
        return cadena;
    }
    
}
