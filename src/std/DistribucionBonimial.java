/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package std;

import lib.Unidad2;
import java.util.Scanner;

/**
 *
 * @author josef
 */
public class DistribucionBonimial {

    /**
     * @param args the command line arguments
     */
      
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("Dar tamaño de la muestra: ");
//        double n = new Scanner(System.in).nextDouble();
//        System.out.println("Caso a análizar: ");
//        double x = new Scanner(System.in).nextDouble();
//        System.out.println("Dar probabilidad de exito: ");
//        double p = new Scanner(System.in).nextDouble();
////         System.out.println("Dar probabilidad de fracaso: ");
////        double q = new Scanner(System.in).nextDouble();
//        
        Unidad2 db = new Unidad2();
//        
//        double distribucionB = db.distribucionBinomial(n, x, p);
//        System.out.println("El valor de la distribucion Binomial es:  " + distribucionB);
//        System.out.println("El valor de la distribucion Binomial es:  " + (100*distribucionB)+"% de probabilidad de exito");
        
//        double distribucionBq = db.distribucionBinomial(n, x, p, q);
//        System.out.println("El valor de la distribucion Binomial es:  " + distribucionBq);
//        System.out.println("El valor de la distribucion Binomial es:  " + (100*distribucionBq)+"% de probabilidad de exito");
//        

        System.out.println("distribucion poisson: "+(String.format("%.2f",db.distribucionPoisson(4, 2)*100)));
        
    }
}
