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
 *cLase persona8 en la cual se declara el octavo hilo con sus atributos
 * @author stevenpc
 */
public class Persona8 extends Thread{
    
    private int duerme;
    
    private int avanza1;
    
    private int avanza2;
    
    private int avanza3;
    
    private String equipo;
    
    private Integer contadorPasos8;
    
    private boolean  ejecutar = true;
    
     private char[] PersonaVec8;
     /**
      * constructor
      * @param duerme
      * @param avanza1
      * @param avanza2
      * @param avanza3
      * @param equipo
      * @param contadorPasos
      * @param personaVect 
      */
    public Persona8(int duerme, int avanza1, int avanza2, int avanza3, String equipo,Integer contadorPasos, char[] personaVect){
        this.PersonaVec8 = personaVect;
        this.duerme = duerme;
        this.avanza1 = avanza1;
        this.avanza2 = avanza2;
        this.avanza3 = avanza3;
        this.equipo = equipo;
        this.contadorPasos8 = contadorPasos;
    }
  /**
  * 
  * Metodo run en el cual el hilo se ejecuta y hace que el jugador comience a correr
  */
    @Override
    public void run(){
        Utilitaria logic = new Utilitaria();
        if(contadorPasos3 <= 14){
                    synchronized(contadorPasos8){
                        try {
                             contadorPasos8.wait();
                            } catch (InterruptedException ex) {
                              Logger.getLogger(Persona2.class.getName()).log(Level.SEVERE, null, ex);
                            }
                  }
        }
        while(ejecutar != false){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Persona1.class.getName()).log(Level.SEVERE, null, ex);
            }  
            int numero = logic.generarNumero();
            if(numero == 3){
                for (int i = contadorPasos8 ; i < 45; i++) {
                    if(PersonaVec8[i]=='8'){
                        PersonaVec8[i] ='_';
                        if(i+avanza3>=30){
                            PersonaVec8[29]='8';
                                synchronized(contadorPasos8){
                                contadorPasos8.notify();
                                detener();
                            } 
                            break;
                        }else{
                            contadorPasos3 = contadorPasos3 + avanza3;
                            PersonaVec8[i+avanza3] ='8';
                            break;
                        }//else
                    }//if
                }//for   
            }else if(numero == 1){
                for (int i = contadorPasos8; i < 45; i++) {
                    if(PersonaVec8[i]=='8'){
                        PersonaVec8[i] ='_'; 
                        if(i+avanza1 >=30){
                            PersonaVec8[29] ='8';
                                synchronized(contadorPasos8){
                                contadorPasos8.notify();
                                detener();
                            }                             
                            break;
                        }else{
                            contadorPasos3 = contadorPasos3 + avanza1;
                            PersonaVec8[i+avanza1] ='8';
                            break;
                        }//else
                    }//if
                }//for
            }else if(numero == 2){
                for (int i = contadorPasos8; i < 45; i++) {
                    if(PersonaVec8[i]=='8'){
                        PersonaVec8[i] ='_'; 
                        if(i+avanza2 >=30){
                            PersonaVec8[29] ='8';
                                synchronized(contadorPasos8){
                                contadorPasos8.notify();
                                detener();
                            }                             
                            break;
                        }else{
                            contadorPasos3 = contadorPasos3 + avanza2;
                            PersonaVec8[i+avanza2] ='8';
                            break;
                        }//else
                    }//if
                }//for  
            }else if(numero == 0){            
            }
           imprimir(PersonaVec8);
           //detener();
        }//while
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
