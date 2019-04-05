package com.mycompany.relevoss;


import java.util.logging.Level;
import java.util.logging.Logger;
import static com.mycompany.relevoss.Principal.PersonaVector1;
import static com.mycompany.relevoss.Principal.contadorPasos;
import static com.mycompany.relevoss.Utilitaria.imprimir;


/**
 * cLase persona dos en la cual se declara el sexto hilo con sus atributos
 * @author stevenpc
 */
public class Persona2 extends Thread{
    
    private int duerme;
    
    private int avanza1;
    
    private int avanza2;
    
    private int avanza3;
    
    private String equipo;
    
    private Integer contadorPasos2;
    
    private boolean  ejecutar = true;
    
     private char[] PersonaVec2;
     
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

    public Persona2(int duerme, int avanza1, int avanza2, int avanza3, String equipo,Integer contadorPasos, char[] personaVect){
        this.PersonaVec2 = personaVect;
        this.duerme = duerme;
        this.avanza1 = avanza1;
        this.avanza2 = avanza2;
        this.avanza3 = avanza3;
        this.equipo = equipo;
        this.contadorPasos2 = contadorPasos;
    }
 /**
  * 
  * Metodo run en el cual el hilo se ejecuta y hace que el jugador comience a correr
  */
    @Override
    public void run(){
        Utilitaria logic = new Utilitaria();
        if(contadorPasos <= 14){
                    synchronized(contadorPasos2){
                        try {
                             contadorPasos2.wait();
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
                for (int i = contadorPasos2 ; i < 45; i++) {
                    if(PersonaVec2[i]=='2'){
                        PersonaVec2[i] ='_';
                        if(i+avanza3>=30){
                            PersonaVec2[29]='2';
                                synchronized(contadorPasos2){
                                contadorPasos2.notify();
                                detener();
                            } 
                            break;
                        }else{
                            contadorPasos = contadorPasos + avanza3;
                            PersonaVec2[i+avanza3] ='2';
                            break;
                        }//else
                    }//if
                }//for   
            }else if(numero == 1){
                for (int i = contadorPasos2; i < 45; i++) {
                    if(PersonaVec2[i]=='2'){
                        PersonaVec2[i] ='_'; 
                        if(i+avanza1 >=30){
                            PersonaVec2[29] ='2';
                                synchronized(contadorPasos2){
                                contadorPasos2.notify();
                                detener();
                            }                             
                            break;
                        }else{
                            contadorPasos = contadorPasos + avanza1;
                            PersonaVec2[i+avanza1] ='2';
                            break;
                        }//else
                    }//if
                }//for
            }else if(numero == 2){
                for (int i = contadorPasos2; i < 45; i++) {
                    if(PersonaVec2[i]=='2'){
                        PersonaVec2[i] ='_'; 
                        if(i+avanza2 >=30){
                            PersonaVec2[29] ='2';
                                synchronized(contadorPasos2){
                                contadorPasos2.notify();
                                detener();
                            }                             
                            break;
                        }else{
                            contadorPasos = contadorPasos + avanza2;
                            PersonaVec2[i+avanza2] ='2';
                            break;
                        }//else
                    }//if
                }//for  
            }else if(numero == 0){
                
            
            }
           imprimir(PersonaVec2);
           //detener();
        }//while
    }//run}
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
     * @return the PersonaVector2
     */   
}
