/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package std;

import lib.Estimacion;

/**
 *
 * @author JOSEF
 */
public class Estmaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Estimacion media = new Estimacion(256, Estimacion._95PORCIENTO);
        media.estimacionMedia(45420, 2050);
        
        System.out.println("limite inf: "+media.geteMedia().get(0));
        System.out.println("limite sup: "+media.geteMedia().get(1));
        System.out.println("-------------------------------------------");
        
        Estimacion media2 = new Estimacion(40, Estimacion._95PORCIENTO);
        media2.estimacionMedia(6.05, 2.44);
        
        System.out.println("limit inf: " + media2.geteMedia().get(0));
        System.out.println("limit inf: " + media2.geteMedia().get(1));
        System.out.println("-------------------------------------------");
        
        Estimacion proporcion2 = new Estimacion(400, Estimacion._95PORCIENTO);
        double p2 = 0.625;
        System.out.println("valor de p en problema: "+ String.valueOf(p2));
        proporcion2.estimacionProporcion(p2);
        
        System.out.println("n: " + proporcion2.getTamanioMuestra());
        System.out.println("proporcion: " + proporcion2.getProporcion());
        System.out.println("valor q: " + proporcion2.getQ());
        System.out.println("nivel de confianza: " + proporcion2.getNc());
        
        System.out.println("Proprocion limt inf: " + proporcion2.geteProporcion().get(0));
        System.out.println("Proprocion limt sup: " + proporcion2.geteProporcion().get(1));
        System.out.println("-------------------------------------------");
        
        
        Estimacion proporcion = new Estimacion(200, Estimacion._95PORCIENTO);
        double p = .15;
        System.out.println("valor de p en problema: "+ String.valueOf(p));
        proporcion.estimacionProporcion(p);
        
        System.out.println("n: " + proporcion.getTamanioMuestra());
        System.out.println("proporcion: " + proporcion.getProporcion());
        System.out.println("valor q: " + proporcion.getQ());
        System.out.println("nivel de confianza: " + proporcion.getNc());
        
        System.out.println("Proprocion limt inf: " + proporcion.geteProporcion().get(0));
        System.out.println("Proprocion limt sup: " + proporcion.geteProporcion().get(1));
        System.out.println("-------------------------------------------");     
        
    }
}

