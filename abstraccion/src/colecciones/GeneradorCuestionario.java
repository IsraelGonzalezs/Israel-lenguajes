/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;

/**
 *
 * @author T-102
 */
public class GeneradorCuestionario {
    public ArrayList<Pregunta>/*Generico a Pregunta*/generar(){
    //Primero generamos el arreglo que contendra las preguntas
    ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
    //primero generemos cada opción de la primer pregunta
    Opcion opc1=new Opcion ("Moscu", false);
    Opcion opc2=new Opcion ("Kiev", false);
    Opcion opc3=new Opcion ("Helsinki", true);
    Opcion opc4=new Opcion ("Turin", false);
    ArrayList <Opcion> opciones1=new ArrayList <>();
    opciones1.add(opc1);
     opciones1.add(opc2);
      opciones1.add(opc3);
       opciones1.add(opc4);
       
       Pregunta p1=new Pregunta ("Capital de Finlandia",opciones1);
       preguntas.add(p1);
       //fin de la primer pregunta
       return preguntas;
       
}
