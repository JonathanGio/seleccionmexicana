/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seleccionmexicana;

/**
 *
 * @author jmendoza
 */
public class Futbolista extends SeleccionFutbol{
    private int id;
    private String Nombre;
    private String Apellidos;
    private int Edad;
    private int dorsal;
    private String demarcacion;

    // constructor, getter y setter
    public Futbolista() {
        super();
    }

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
        
    public void Concentrarse() {
           
    }

    public void Viajar() {
           
    }

    public void jugarPartido() {
          
    }

    public void entrenar() {
           
    }

}
