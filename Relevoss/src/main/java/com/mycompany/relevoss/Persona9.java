/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relevoss;

import static com.mycompany.relevoss.Principal.PersonaVector3;
import static com.mycompany.relevoss.Principal.contadorPasos3;
import static com.mycompany.relevoss.Utilitaria.imprimir;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * cLase persona 9 en la cual se declara el noveno hilo con sus atributos
 * @author stevenpc
 */
public class Persona9 extends Thread{
    
  private int duerme;
    
    private int avanza1;
    
    private int avanza2;
    
    private int avanza3;
    
    private String equipo;
    
    private boolean  ejecutar = true;
    
    private char[] PersonaVector9;
    
    private Integer contadorPasos9;
    /**
     * 
     * Constructor
     * @param duerme
     * @param avanza1
     * @param avanza2
     * @param avanza3
     * @param equipo
     * @param personaVect
     * @param contadorPasos6 
     */
    public Persona9(int duerme, int avanza1, int avanza2, int avanza3, String equipo, char[] personaVect, Integer contadorPasos6) {
        this.duerme = duerme;
        this.avanza1 = avanza1;
        this.avanza2 = avanza2;
        this.avanza3 = avanza3;
        this.equipo = equipo;
        this.PersonaVector9 = personaVect;
        this.contadorPasos9 = contadorPasos3;
    }

 /**
  * 
  * Metodo run en el cual el hilo se ejecuta y hace que el jugador comience a correr
  */
    @Override
    public void run(){
        Utilitaria logic = new Utilitaria();
        if(contadorPasos3 <= 30){
                    synchronized(contadorPasos9){
                        try {
                             contadorPasos9.wait();
                            } catch (InterruptedException ex) {
                              Logger.getLogger(Persona2.class.getName()).log(Level.SEVERE, null, ex);
                            }
                  }
        }
        while(ejecutar != false){
            while(PersonaVector3[44] != '9'){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Persona1.class.getName()).log(Level.SEVERE, null, ex);
            }  
            int numero = logic.generarNumero();
            if(numero == 3){
                for (int i = contadorPasos9 ; i < 45; i++) {
                    if(PersonaVector9[i]=='9'){
                        PersonaVector9[i] ='_';
                        if(i+avanza3>=45){
                            PersonaVector9[44]='9';
                            break;
                        }else{
                            contadorPasos3 = contadorPasos3 + avanza3;
                            PersonaVector9[i+avanza3] ='9';
                            break;
                        }//else
                    }//if
                }//for   
            }else if(numero == 1){
                for (int i = contadorPasos9; i < 45; i++) {
                    if(PersonaVector9[i]=='9'){
                        PersonaVector9[i] ='_'; 
                        if(i+avanza1 >=45){
                            PersonaVector9[44] ='9';
                            break;
                        }else{
                            contadorPasos3 = contadorPasos3 + avanza1;
                            PersonaVector9[i+avanza1] ='9';
                            break;
                        }//else
                    }//if
                }//for
            }else if(numero == 2){
                for (int i = contadorPasos9; i < 45; i++) {
                    if(PersonaVector9[i]=='9'){
                        PersonaVector9[i] ='_'; 
                        if(i+avanza2 >=45){
                            PersonaVector9[44] ='9';                         
                            break;
                        }else{
                            contadorPasos3 = contadorPasos3 + avanza2;
                            PersonaVector9[i+avanza2] ='9';
                            break;
                        }//else
                    }//if
                }//for  
            }else if(numero == 0){
            }
           imprimir(PersonaVector9);
           //detener();
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
    
}
