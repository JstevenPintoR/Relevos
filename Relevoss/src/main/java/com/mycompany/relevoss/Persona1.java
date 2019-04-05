package com.mycompany.relevoss;

import java.util.logging.Level;
import java.util.logging.Logger;
import static com.mycompany.relevoss.Principal.PersonaVector1;
import static com.mycompany.relevoss.Utilitaria.imprimir;
import static com.mycompany.relevoss.Principal.contadorPasos;


/**
 * Clase persona1 en la cual se delcara el primer hilo con sus atributos
 * @author stevenpc
 */
public class Persona1 extends Thread{
    
    private int duerme;
    
    private int avanza1;
    
    private int avanza2;
    
    private int avanza3;
    
    private String equipo;
    
    private Integer contadorPasos1;
    
    private boolean  ejecutar = true;
    
    //private char[] PersonaVector1 = new char [100];
    
  /**
   *  constructor de la clase 
   * @param duerme
   * @param avanza1
   * @param avanza2
   * @param avanza3
   * @param equipo
   * @param contadorPasos 
   */

    public Persona1(int duerme, int avanza1, int avanza2, int avanza3, String equipo,Integer contadorPasos) {

        this.duerme = duerme;
        this.avanza1 = avanza1;
        this.avanza2 = avanza2;
        this.avanza3 = avanza3;
        this.equipo = equipo;
        this.contadorPasos1 = contadorPasos;
    }
  /**
   * 
   *   Metodo run en el cual el hilo se ejecuta y hace queel juegador comience a correr
   */
    @Override
    public void run(){
        Utilitaria logic = new Utilitaria();
        PersonaVector1[0]='1';
        PersonaVector1[15]='2';
        PersonaVector1[30]='3';
        while(ejecutar != false){
        //while(PersonaVector1[44]!='1'){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Persona1.class.getName()).log(Level.SEVERE, null, ex);
            }  
            int numero = logic.generarNumero();
            if(numero == 3){
                for (int i = 0; logic.mayorCorredor2(i); i++) {
                    if(PersonaVector1[i]=='1'){
                        PersonaVector1[i] ='_';
                        if(logic.mayorCorredor1(i+avanza3)){
                            try {
                                PersonaVector1[14]='1';
                                contadorPasos = contadorPasos + avanza3;
                                Thread.sleep(1000);
                                synchronized(contadorPasos1){
                                contadorPasos1.notify();
                                detener();
                                }
                                break;
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Persona1.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }else{
                            contadorPasos = contadorPasos + avanza3;
                            PersonaVector1[i+avanza3] ='1';
                            break;
                        }//else
                    }//if
                }//for   
            }else if(numero == 1){
                for (int i = 0; i < 45; i++) {
                    if(PersonaVector1[i]=='1'){
                        PersonaVector1[i] ='_'; 
                        if(i+avanza1 >=15){
                            PersonaVector1[14] ='1';
                            contadorPasos = contadorPasos + avanza1;
                            synchronized(contadorPasos1){
                                contadorPasos1.notify();
                                detener();
                            }                                
                            break;
                        }else{
                            contadorPasos = contadorPasos + avanza1;
                            PersonaVector1[i+avanza1] ='1';
                            break;
                        }//else
                    }//if
                }//for
            }else if(logic.bandera(0)){
                for (int i = 0; i < 45; i++) {
                    if(PersonaVector1[i]=='1'){
                        PersonaVector1[i] ='_'; 
                        if(i+avanza2 >=15){
                            PersonaVector1[14] ='1';
                                contadorPasos = contadorPasos + avanza2;
                                synchronized(contadorPasos1){
                                contadorPasos1.notify();
                                detener();
                                }
                                      
                            break;
                        }else{
                            PersonaVector1[i+avanza2] = '1';
                            contadorPasos = contadorPasos + avanza2;
                            break;
                        }//else
                    }//if
                }//for  
            }else if(numero == 0){
            }
           imprimir(PersonaVector1);
        }//while
       //}
    }//run
        /**
         * 
         * metodo en el cual convierte en false el ejecutar para deternet el corredor
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
     * @return the PersonaVector1
     */
    public char[] getPersonaVector1() {
        return PersonaVector1;
    }    
}
