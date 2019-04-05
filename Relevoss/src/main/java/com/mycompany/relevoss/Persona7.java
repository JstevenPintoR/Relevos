/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relevoss;

import static com.mycompany.relevoss.Principal.PersonaVector3;
import static com.mycompany.relevoss.Utilitaria.imprimir;
import static com.mycompany.relevoss.Principal.contadorPasos3;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * cLase persona dos en la cual se declara el septimo hilo con sus atributos
 * @author stevenpc
 */
public class Persona7 extends Thread{
    
private int duerme;
    
    private int avanza1;
    
    private int avanza2;
    
    private int avanza3;
    
    private String equipo;
    
    private Integer contadorPasos7;
    
    private boolean  ejecutar = true;
    
    //private char[] PersonaVector1 = new char [100];
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

    public Persona7(int duerme, int avanza1, int avanza2, int avanza3, String equipo,Integer contadorPasos) {

        this.duerme = duerme;
        this.avanza1 = avanza1;
        this.avanza2 = avanza2;
        this.avanza3 = avanza3;
        this.equipo = equipo;
        this.contadorPasos7 = contadorPasos;
    }
 /**
  * 
  * Metodo run en el cual el hilo se ejecuta y hace que el jugador comience a correr
  */
    @Override
    public void run(){
        Utilitaria logic = new Utilitaria();
        PersonaVector3[0]='7';
        PersonaVector3[15]='8';
        PersonaVector3[30]='9';
        while(ejecutar != false){
        //while(PersonaVector1[44]!='1'){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Persona1.class.getName()).log(Level.SEVERE, null, ex);
            }  
            int numero = logic.generarNumero();
            if(numero == 3){
                for (int i = 0; i < 45; i++) {
                    if(PersonaVector3[i]=='7'){
                        PersonaVector3[i] ='_';
                        if(i+avanza3>=15){
                            try {
                                PersonaVector3[14]='7';
                                contadorPasos3 = contadorPasos3 + avanza3;
                                Thread.sleep(1000);
                                synchronized(contadorPasos7){
                                contadorPasos7.notify();
                                detener();
                                }
                                break;
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Persona1.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }else{
                            contadorPasos3 = contadorPasos3 + avanza3;
                            PersonaVector3[i+avanza3] ='7';
                            break;
                        }//else
                    }//if
                }//for   
            }else if(numero == 1){
                for (int i = 0; i < 45; i++) {
                    if(PersonaVector3[i]=='7'){
                        PersonaVector3[i] ='_'; 
                        if(i+avanza1 >=15){
                            PersonaVector3[14] ='7';
                            contadorPasos3 = contadorPasos3 + avanza1;
                            synchronized(contadorPasos7){
                                contadorPasos7.notify();
                                detener();
                            }                                
                            break;
                        }else{
                            contadorPasos3 = contadorPasos3 + avanza1;
                            PersonaVector3[i+avanza1] ='7';
                            break;
                        }//else
                    }//if
                }//for
            }else if(numero == 2){
                for (int i = 0; i < 45; i++) {
                    if(PersonaVector3[i]=='7'){
                        PersonaVector3[i] ='_'; 
                        if(i+avanza2 >=15){
                            PersonaVector3[14] ='7';
                                contadorPasos3 = contadorPasos3 + avanza2;
                                synchronized(contadorPasos7){
                                contadorPasos7.notify();
                                detener();
                                }
                                      
                            break;
                        }else{
                            PersonaVector3[i+avanza2] ='7';
                            contadorPasos3 = contadorPasos3 + avanza2;
                            break;
                        }//else
                    }//if
                }//for  
            }else if(numero == 0){
            }
           imprimir(PersonaVector3);
        }//while
       //}
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
