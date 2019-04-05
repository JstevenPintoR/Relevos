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
 *
 * @author stevenpc
 */
public class Persona6 extends Thread{
    
    private int duerme;
    
    private int avanza1;
    
    private int avanza2;
    
    private int avanza3;
    
    private String equipo;
    
    private boolean  ejecutar = true;
    
    private char[] PersonaVector6;
    
    private Integer contadorPasos6;
 
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
     
    public Persona6(int duerme, int avanza1, int avanza2, int avanza3, String equipo, char[] personaVect, Integer contadorPasos6) {
        this.duerme = duerme;
        this.avanza1 = avanza1;
        this.avanza2 = avanza2;
        this.avanza3 = avanza3;
        this.equipo = equipo;
        this.PersonaVector6 = personaVect;
        this.contadorPasos6 = contadorPasos2;
    }


    @Override
    public void run(){
        Utilitaria logic = new Utilitaria();
        if(contadorPasos2 <= 30){
                    synchronized(contadorPasos6){
                        try {
                             contadorPasos6.wait();
                            } catch (InterruptedException ex) {
                              Logger.getLogger(Persona2.class.getName()).log(Level.SEVERE, null, ex);
                            }
                  }
        }
        while(ejecutar != false){
         while(PersonaVector2[44] != '6'){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Persona1.class.getName()).log(Level.SEVERE, null, ex);
            }  
            int numero = logic.generarNumero();
            if(numero == 3){
                for (int i = contadorPasos6 ; i < 45; i++) {
                    if(PersonaVector6[i]=='6'){
                        PersonaVector6[i] ='_';
                        if(i+avanza3>=45){
                            PersonaVector6[44]='6';
                            break;
                        }else{
                            contadorPasos2 = contadorPasos2 + avanza3;
                            PersonaVector6[i+avanza3] ='6';
                            break;
                        }//else
                    }//if
                }//for   
            }else if(numero == 1){
                for (int i = contadorPasos6; i < 45; i++) {
                    if(PersonaVector6[i]=='6'){
                        PersonaVector6[i] ='_'; 
                        if(i+avanza1 >=45){
                            PersonaVector6[44] ='6';
                            break;
                        }else{
                            contadorPasos2 = contadorPasos2 + avanza1;
                            PersonaVector6[i+avanza1] ='6';
                            break;
                        }//else
                    }//if
                }//for
            }else if(numero == 2){
                for (int i = contadorPasos2; i < 45; i++) {
                    if(PersonaVector6[i]=='6'){
                        PersonaVector6[i] ='_'; 
                        if(i+avanza2 >=45){
                            PersonaVector6[44] ='6';                         
                            break;
                        }else{
                            contadorPasos2 = contadorPasos2 + avanza2;
                            PersonaVector6[i+avanza2] ='6';
                            break;
                        }//else
                    }//if
                }//for  
            }else if(numero == 0){
                
            
            }
           imprimir(PersonaVector6);
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
