/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relevoss;

import static com.mycompany.relevoss.Principal.PersonaVector2;
import static com.mycompany.relevoss.Principal.contadorPasos2;
import static com.mycompany.relevoss.Utilitaria.imprimir;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *cLase persona dos en la cual se declara el quinto hilo con sus atributos
 * @author stevenpc
 */
public class Persona5 extends Thread{
    
    private int duerme;
    
    private int avanza1;
    
    private int avanza2;
    
    private int avanza3;
    
    private String equipo;
    
    private Integer contadorPasos5;
    
    private boolean  ejecutar = true;
    
     private char[] PersonaVec5;
   /**
     * 
     *  Constructor
     * @param duerme
     * @param avanza1
     * @param avanza2
     * @param avanza3
     * @param equipo
     * @param contadorPasos
     * @param personaVect 
     */
    public Persona5(int duerme, int avanza1, int avanza2, int avanza3, String equipo,Integer contadorPasos, char[] personaVect){
        this.PersonaVec5 = personaVect;
        this.duerme = duerme;
        this.avanza1 = avanza1;
        this.avanza2 = avanza2;
        this.avanza3 = avanza3;
        this.equipo = equipo;
        this.contadorPasos5 = contadorPasos;
    }
 /**
  * 
  * Metodo run en el cual el hilo se ejecuta y hace que el jugador comience a correr
  */
    @Override
    public void run(){
        Utilitaria logic = new Utilitaria();
        if(contadorPasos2 <= 14){
                    synchronized(contadorPasos5){
                        try {
                             contadorPasos5.wait();
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
                for (int i = contadorPasos5 ; i < 45; i++) {
                    if(PersonaVec5[i]=='5'){
                        PersonaVec5[i] ='_';
                        if(i+avanza3>=30){
                            PersonaVec5[29]='5';
                                synchronized(contadorPasos5){
                                contadorPasos5.notify();
                                detener();
                            } 
                            break;
                        }else{
                            contadorPasos2 = contadorPasos2 + avanza3;
                            PersonaVec5[i+avanza3] ='5';
                            break;
                        }//else
                    }//if
                }//for   
            }else if(numero == 1){
                for (int i = contadorPasos5; i < 45; i++) {
                    if(PersonaVec5[i]=='5'){
                        PersonaVec5[i] ='_'; 
                        if(i+avanza1 >=30){
                            PersonaVec5[29] ='5';
                                synchronized(contadorPasos5){
                                contadorPasos5.notify();
                                detener();
                            }                             
                            break;
                        }else{
                            contadorPasos2 = contadorPasos2 + avanza1;
                            PersonaVec5[i+avanza1] ='5';
                            break;
                        }//else
                    }//if
                }//for
            }else if(numero == 2){
                for (int i = contadorPasos5; i < 45; i++) {
                    if(PersonaVec5[i]=='5'){
                        PersonaVec5[i] ='_'; 
                        if(i+avanza2 >=30){
                            PersonaVec5[29] ='5';
                                synchronized(contadorPasos5){
                                contadorPasos5.notify();
                                detener();
                            }                             
                            break;
                        }else{
                            contadorPasos2 = contadorPasos2 + avanza2;
                            PersonaVec5[i+avanza2] ='5';
                            break;
                        }//else
                    }//if
                }//for  
            }else if(numero == 0){            
            }
           imprimir(PersonaVec5);
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
