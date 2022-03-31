/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seleccionmexicana;

/**
 *
 * @author jmendoza
 */
public class SeleccionFutbol {
    protected int id;
    protected String Nombre;
    protected String Apellidos;
    protected int Edad;

    // constructor, getter y setter
    public SeleccionFutbol() {        
    }

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
            this.id = id;
            this.Nombre = nombre;
            this.Apellidos = apellidos;
            this.Edad = edad;
    }

    public void Concentrarse() {
        
    }

    public void Viajar() {
         
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String getApellidos() {
        return Apellidos;
    }
 
    public void getApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
}
