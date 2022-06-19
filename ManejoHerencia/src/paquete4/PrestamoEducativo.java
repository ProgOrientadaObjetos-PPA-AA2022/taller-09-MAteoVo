/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Prestamo;
import paquete5.InstitucionEducativa;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {
    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensualPrestamo;

    public PrestamoEducativo(String c,String nEstudio, InstitucionEducativa cEducativo, double vCarrera,Persona bene, int tMPres) {
        super(bene, tMPres);
        setCiudadPrestamo(c);
        nivelEstudio = nEstudio;
        centroEducativo = cEducativo;
        valorCarrera = vCarrera;
    }
    @Override
    public void setCiudadPrestamo(String c){
        ciudadPrestamo = c.toLowerCase();
    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nEstudio) {
        nivelEstudio = nEstudio;
    }

    public InstitucionEducativa getCentroEducativo() {
        return centroEducativo;
    }

    public void setCentroEducativo(InstitucionEducativa cEducativo) {
        centroEducativo = cEducativo;
    }

    public double getValorCarrera() {
        return valorCarrera;
    }

    public void setValorCarrera(double vCarrera) {
        valorCarrera = vCarrera;
    }

    public double getValorMensualPrestamo() {
        return valorMensualPrestamo;
    }

    public void setValorMensualPrestamo() {
        valorMensualPrestamo = (valorCarrera/tiempoMesesPrestamo)-(0.1*(valorCarrera/tiempoMesesPrestamo));
    }
    @Override
    public String toString(){
        String cadena = String.format("%sNivel de Estudio: %s\nInstitución Educativa\n%sValor Carrera: %.2f\nValor Mensual Carrera: %.2f\n",
                super.toString(),nivelEstudio,centroEducativo,valorCarrera,valorMensualPrestamo);
        return cadena;
    }
}
