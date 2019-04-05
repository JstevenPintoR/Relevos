package com.mycompany.relevoss;

/**
 *Clase principal 
 * @author stevenpc
 */
public class Principal {
    
    static char[] PersonaVector1 = new char[45];
    static char[] PersonaVector2 = new char[45];
    static char[] PersonaVector3 = new char[45];
    static int duerme = 0;
    static private int avanza1 = 1;
    
   static private int avanza2 = 2;
    
    static private int avanza3 = 3;
    
    static Integer contadorPasos =0;
    static Integer contadorPasos2 =0;
    static Integer contadorPasos3 =0;

    Persona1 per1 = new Persona1(duerme,avanza1,avanza2,avanza3,"equipo1",contadorPasos);
    Persona2 per2 = new Persona2(duerme,avanza1,avanza2,avanza3,"equipo1",contadorPasos,PersonaVector1);
    Persona3 per3 = new Persona3(duerme,avanza1,avanza2,avanza3,"equipo1",PersonaVector1,contadorPasos);
    Persona4 per4 = new Persona4(duerme,avanza1,avanza2,avanza3,"equipo2",contadorPasos2);
    Persona5 per5 = new Persona5(duerme,avanza1,avanza2,avanza3,"equipo2",contadorPasos2,PersonaVector2);
    Persona6 per6 = new Persona6(duerme,avanza1,avanza2,avanza3,"equipo2",PersonaVector2,contadorPasos2);
    Persona7 per7 = new Persona7(duerme,avanza1,avanza2,avanza3,"equipo3",contadorPasos3);
    Persona8 per8 = new Persona8(duerme,avanza1,avanza2,avanza3,"equipo3",contadorPasos3,PersonaVector3);
    Persona9 per9 = new Persona9(duerme,avanza1,avanza2,avanza3,"equipo3",PersonaVector3,contadorPasos3);
    
    /**
     * principal utilizada para llenar los hilos con los corrdores
     * 
     */
    public Principal() {
    llenar();
    llenarEquipo2();
    llenarEquipo3();
    per1.start();
    per4.start();
    per7.start();
    
    per2.start();
    per5.start();
    per8.start();
    
    per3.start(); 
    per6.start();      
    per9.start();
    }
    /*
    * metodo llenar utilizado para marcar los pasos de equipo 1
    */
    private void llenar(){
        for (int i = 0; i <45; i++) {
            PersonaVector1[i] = '_';
        }//for
    }//llenar
    /*
    * metodo llenarEquipo2 utilizado para marcar los pasos de equipo 2
    */
    private void llenarEquipo2(){
        for (int i = 0; i <45; i++) {
            PersonaVector2[i] = '_';
        }//for
    }//llenar
    /*
    * metodo llenaEquipo3r utilizado para marcar los pasos de equipo 3
    */
    private void llenarEquipo3(){
        for (int i = 0; i <45; i++) {
            PersonaVector3[i] = '_';
        }//for
    }//llenar
}
