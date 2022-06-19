/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author mateovalarezoojeda
 */
public class Persona {

    private String nombre;
    private String apellido;
    private String username;

    public Persona(String nom, String ape, String user) {
        nombre = nom;
        apellido = ape;
        username = user;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String ape) {
        apellido = ape;
    }

    public String getApellido() {
        return apellido;
    }

    public void setUsername(String user) {
        username = user;
    }

    public String getUsername() {
        return username;
    }

    public String toString() {
        String cadena = String.format("Nombre: %s\nApellido: %s\nUsername: %s\n",
                 nombre, apellido, username);
        return cadena;
    }
}
