/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayobjetotarea1;
class Instrumentacion_Aplicada 
{ public int codigo_binario;
public String caracteristica;
Instrumentacion_Aplicada(int codigo_binario, String caracteristica) 
{
    this.codigo_binario = codigo_binario;
    this.caracteristica = caracteristica;
}
}
/**
 *
 * @author Medardo Rene Chango Caguana
 */
public class ArrayObjetoTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("  ***UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE*** ");
         System.out.println("             ***PROGRAMACION*** ");
         System.out.println("\033[34m-Autor: Medardo Chango");
          System.out.println("****************************************************");
           System.out.println("\033[31mINSTRUMENTACION APLICADA PARA EL ANALIZADOR DE GASES"); 
          System.out.println("");
              
             
         
        Instrumentacion_Aplicada[] arreglo;
        arreglo=new Instrumentacion_Aplicada[10];
        arreglo[0] = new Instrumentacion_Aplicada(   0,"      Computadora_personal");
        arreglo[1] = new Instrumentacion_Aplicada(   1,"      Escaner_automotor");
        arreglo[2] = new Instrumentacion_Aplicada(  10,"     Tarjeta_datos");
        arreglo[3] = new Instrumentacion_Aplicada(  11,"     Presion_admision");
        arreglo[4] = new Instrumentacion_Aplicada( 100,"    Rango_presion");
        arreglo[5] = new Instrumentacion_Aplicada( 101,"    Tipo_sensor");
        arreglo[6] = new Instrumentacion_Aplicada( 110,"    Voltaje");
        arreglo[7] = new Instrumentacion_Aplicada( 111,"    Analizador_gases");
        arreglo[8] = new Instrumentacion_Aplicada(1000,"   Rango_medicion_CO");
        arreglo[9] = new Instrumentacion_Aplicada(1001,"   Rango_medicion_HC");
        for(int i=0; i<arreglo.length;i++)
            System.out.println("Instrumentacion Aplicada "+i+":"+ 
                    arreglo[i].codigo_binario+""+ arreglo[i].caracteristica);
    }
    
}
