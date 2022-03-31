/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.seleccionmexicana;

import java.util.ArrayList;

/**
 *
 * @author jmendoza
 */
public class SeleccionMexicana {

   public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<>();

	public static void main(String[] args) {

            Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "284EZ89");
            Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
            Masajista raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);

            integrantes.add(delBosque);
            integrantes.add(iniesta);
            integrantes.add(raulMartinez);

            // CONCENTRACION
            System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
            for (SeleccionFutbol integrante : integrantes) {
                    System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
                    integrante.Concentrarse();
            }

            // VIAJE
            System.out.println("nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
            for (SeleccionFutbol integrante : integrantes) {
                    System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
                    integrante.Viajar();
            }
        }
}
