/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relevoss;

import java.util.logging.Level;
import java.util.logging.Logger;
import static com.mycompany.relevoss.Principal.PersonaVector1;
import static com.mycompany.relevoss.Principal.contadorPasos;
import static com.mycompany.relevoss.Utilitaria.imprimir;

/**
 * cLase persona dos en la cual se declara el tercer hilo con sus atributos
 * @author stevenpc
 */
public class Persona3 extends Thread{
    
    private int duerme;
    
    private int avanza1;
    
    private int avanza2;
    
    private int avanza3;
    
    private String equipo;
    
    private boolean  ejecutar = true;
    
    private char[] PersonaVector3;
    
    private Integer contadorpasos3;
    
    /**
      * 
      * constructor 
      * @param duerme
      * @param avanza1
      * @param avanza2
      * @param avanza3
      * @param equipo
      * @param contadorPasos
      * @param personaVect 
      */

    public Persona3(int duerme, int avanza1, int avanza2, int avanza3, String equipo, char[] personaVect, Integer contadorpasos3) {
        this.duerme = duerme;
        this.avanza1 = avanza1;
        this.avanza2 = avanza2;
        this.avanza3 = avanza3;
        this.equipo = equipo;
        this.PersonaVector3 = personaVect;
        this.contadorpasos3 = contadorPasos;
    }

  /**
  * 
  * Metodo run en el cual el hilo se ejecuta y hace que el jugador comience a correr
  */
    @Override
    public void run(){
        Utilitaria logic = new Utilitaria();
        if(contadorPasos <= 30){
                    synchronized(contadorpasos3){
                        try {
                             contadorpasos3.wait();
                            } catch (InterruptedException ex) {
                              Logger.getLogger(Persona2.class.getName()).log(Level.SEVERE, null, ex);
                            }
                  }
        }
        while(ejecutar != false){
        while(PersonaVector1[44] != '3'){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Persona1.class.getName()).log(Level.SEVERE, null, ex);
            }  
            int numero = logic.generarNumero();
            if(numero == 3){
                for (int i = contadorpasos3 ; i < 45; i++) {
                    if(PersonaVector3[i]=='3'){
                        PersonaVector3[i] ='_';
                        if(i+avanza3>=45){
                            PersonaVector3[44]='3';
                            break;
                        }else{
                            contadorPasos = contadorPasos + avanza3;
                            PersonaVector3[i+avanza3] ='3';
                            break;
                        }//else
                    }//if
                }//for   
            }else if(numero == 1){
                for (int i = contadorpasos3; i < 45; i++) {
                    if(PersonaVector3[i]=='3'){
                        PersonaVector3[i] ='_'; 
                        if(i+avanza1 >=45){
                            PersonaVector3[44] ='3';
                            break;
                        }else{
                            contadorPasos = contadorPasos + avanza1;
                            PersonaVector3[i+avanza1] ='3';
                            break;
                        }//else
                    }//if
                }//for
            }else if(numero == 2){
                for (int i = contadorpasos3; i < 45; i++) {
                    if(PersonaVector3[i]=='3'){
                        PersonaVector3[i] ='_'; 
                        if(i+avanza2 >=45){
                            PersonaVector3[44] ='3';                         
                            break;
                        }else{
                            contadorPasos = contadorPasos + avanza2;
                            PersonaVector3[i+avanza2] ='3';
                            break;
                        }//else
                    }//if
                }//for  
            }else if(numero == 0){
                
            
            }
           imprimir(PersonaVector3);
        }//while
        logic.imprimirGanador(equipo);
        detener();
      }
    }//run     
    /**
    * 
    * metodo en el cual convierte en false el ejecutar para detener el corredor
    */
    public void detener(){
        ejecutar = false;
    }
    /**
     * @return the duerme
     */
    public int getDuerme() {
        return duerme;
    }

    /**
     * @param duerme the duerme to set
     */
    public void setDuerme(int duerme) {
        this.duerme = duerme;
    }

    /**
     * @return the avanza1
     */
    public int getAvanza1() {
        return avanza1;
    }

    /**
     * @param avanza1 the avanza1 to set
     */
    public void setAvanza1(int avanza1) {
        this.avanza1 = avanza1;
    }

    /**
     * @return the avanza2
     */
    public int getAvanza2() {
        return avanza2;
    }

    /**
     * @param avanza2 the avanza2 to set
     */
    public void setAvanza2(int avanza2) {
        this.avanza2 = avanza2;
    }

    /**
     * @return the avanza3
     */
    public int getAvanza3() {
        return avanza3;
    }

    /**
     * @param avanza3 the avanza3 to set
     */
    public void setAvanza3(int avanza3) {
        this.avanza3 = avanza3;
    }

    /**
     * @return the equipo
     */
    public String getEquipo() {
        return equipo;
    }

    /**
     * @param equipo the equipo to set
     */
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    /**
     * @return the PersonaVector3
     */
    public char[] getPersonaVector3() {
        return PersonaVector3;
    }

    /**
     * @param PersonaVector3 the PersonaVector3 to set
     */
    public void setPersonaVector3(char[] PersonaVector3) {
        this.PersonaVector3 = PersonaVector3;
    }

}
