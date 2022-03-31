/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seleccionmexicana;

/**
 *
 * @author jmendoza
 */
public class Entrenador extends SeleccionFutbol {
    private int id;
    private String Nombre;
    private String Apellidos;
    private int Edad;
    private String idFederacion;

    // constructor, getter y setter
    public Entrenador() {
        super();
    }

    public Entrenador(int identrenador, String nombre, String apellidos, int edadentre, String idfederacion) {
        super(identrenador, nombre, apellidos, edadentre);
        this.id = identrenador;
        this.Nombre = nombre;
        this.Apellidos = apellidos;
        this.Edad = edadentre;
        this.idFederacion = idfederacion;
        
    }
    
    public void Concentrarse() {
           
    }

    public void Viajar() {
           
    }

    public void dirigirPartido() {
           
    }

    public void dirigirEntreno() {
          
    }        
}
