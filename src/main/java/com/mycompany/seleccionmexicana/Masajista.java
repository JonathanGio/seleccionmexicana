/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seleccionmexicana;

/**
 *
 * @author jmendoza
 */
public class Masajista extends SeleccionFutbol {
    private int id;
    private String Nombre;
    private String Apellidos;
    private int Edad;
    private String Titulacion;
    private int aniosExperiencia;

  public Masajista() {
        super();
    }

    public Masajista(int id, String nombre, String apellidos, int edad, String Titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.id = id;
        this.Nombre = nombre;
        this.Apellidos = apellidos;
        this.Edad = edad;
        this.Titulacion = Titulacion;
        this.aniosExperiencia = aniosExperiencia;
        
    }

    // constructor, getter y setter

    public void Concentrarse() {
          
    }

    public void Viajar() {
          
    }

    public void darMasaje() {
            
    }
}
