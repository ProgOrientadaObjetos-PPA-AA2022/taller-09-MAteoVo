/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author mateovalarezoojeda
 */
public class InstitucionEducativa {

    private String nombre;
    private String siglas;

    public InstitucionEducativa(String nom, String s) {
        nombre = nom;
        siglas = s;
    }
    
    public void setNombre(String nom){
        nombre = nom;
    }
    public String getNombre(){
        return nombre;
    }
    public void setSiglas(String s){
        siglas = s;
    }
    public String getSiglas(){
        return siglas;
    }
    
    public String toString(){
        String cadena = String.format("Nombre: %s\nSiglas: %s\n",nombre,siglas);
        return cadena;
    }
}
