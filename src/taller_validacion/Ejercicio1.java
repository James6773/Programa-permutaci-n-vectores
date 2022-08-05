
package taller_validacion;

import java.util.*;


public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int [] vector,vectorNew;
        int vectorSize;
        int leer;
        int nPermutaciones;
        
        System.out.println("Ingrese por favor el tamaño del vector: ");
        
        vectorSize = teclado.nextInt(); 
        
        vector = new int[vectorSize];
        vectorNew = new int[vectorSize];
        
        System.out.println("A continuación, ingrese 0 o 1 para llenar cada una "
                + "de las posiciones del vector...");
        
        for(int i=0;i<vector.length;i++) {
            System.out.println("Ingrese el valor de la posición N° "+i+":");
            leer=teclado.nextInt();
            
            while (leer>1 || leer<0)
                 {
                    System.out.println("Error: ¡Sólo puede ingresar 0 o 1!");
                    System.out.print("Inténtelo nuevamente...");
                    System.out.println("");
                    System.out.println("Ingrese el valor de la posición "
                            + "N° "+i+":");
                    leer=teclado.nextInt();
                   }
                 vector[i]=leer;
        }
        
        System.out.println("Ingrese por favor el número de permutaciones "
                + "que desea ejecutar: ");
        
        nPermutaciones = teclado.nextInt();
        
  
        for(int i=0;i< nPermutaciones;i++) {
           for(int k=0;k<vector.length-1;k++) {
                if(k==0) 
                   if(vector[k+1]==0){
                      vectorNew[k]=0;
                    }else vectorNew[k]=1;
                else{
                    if(vector[k-1]==vector[k+1]){
                        vectorNew[k]=0;}
                    else
                        vectorNew[k]=1;
                }
            }
                if(vector[vector.length-1]==0){
                        vectorNew[vectorNew.length-1]=0;
                        }else vectorNew[vectorNew.length-1]=1;
                
                for(int l=0;l< vector.length-1;l++){
                    vector[l]=vectorNew[l];
                }
        }


        System.out.println("El vector resultante de "+vectorSize+
                " posiciones después de "+nPermutaciones+" permutación(es) es:");
        
        System.out.print("["); 
         for(int j=0;j<vectorNew.length;j++) {       
             System.out.print(vectorNew[j]);
             System.out.print(" ");
         }
        System.out.print("]");
        
    }
}
