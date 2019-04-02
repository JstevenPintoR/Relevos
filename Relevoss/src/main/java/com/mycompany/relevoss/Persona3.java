/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relevoss;

/**
 *
 * @author stevenpc
 */
public class Persona3 extends Thread{
    
    private int duerme = 0;
    
    private int avanza1 = 1;
    
    private int avanza2 = 2;
    
    private int avanza3 = 3;
    
    private String equipo;
    
     private char[] PersonaVector3 = new char [100];

    public Persona3() {
        this.equipo = "Equipo1";
        
        
 
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
