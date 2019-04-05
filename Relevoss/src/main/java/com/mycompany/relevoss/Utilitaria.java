package com.mycompany.relevoss;
/**
 *Clase utilitaria en la cual se generan numeros aleatorios 
 * @author stevenpc
 */
public class Utilitaria {
    
        public static int generarNumero(){
        int numero = (int) (Math.random() * 3) + 1;
        return numero;
    }//generarNumero

        public  static synchronized void imprimir(char [] vector){
        System.out.print("\n");
        for (int i = 0; i < 45; i++) {
            System.out.print(vector[i]);
        }//for
        System.out.print("\n");
        }//imprimir 
     /**
      * utilizada para imprimir el equipo ganador
      * @param equipo 
      */   
        public void imprimirGanador(String equipo){
        System.out.print("         *            \n");
        System.out.print("        * *           \n");
        System.out.print("       *   *          \n");
        System.out.print("      *     *         \n");
        System.out.print("    *         *       \n");
        System.out.print("  *             *     \n");
        System.out.print("*    Ganó el     *    \n");
        System.out.print("*   "+equipo+"       *\n");
        System.out.print("  *             *     \n");
        System.out.print("    *         *       \n");
        System.out.print("      *     *         \n");
        System.out.print("       *   *          \n");
        System.out.print("        * *          \n");
        System.out.print("         *           \n");
        }//imprimir 
        
        public boolean mayorCorredor1(int numero){
           if(numero>=15){
               return true;
           }else{
               return false;
           }
        }
       
           public boolean bandera (int recibe) {
           if(recibe == 2){
           return true;
           }else{
        return false;
         }
}

            public boolean mayorCorredor2(int numero){
           if(numero<45){
               return true;
           }else{
               return false;
           }
        }
}


