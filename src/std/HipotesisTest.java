/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package std;

import lib.Hipotesis;

/**
 *
 * @author JOSEF
 */
public class HipotesisTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Hipotesis h1 = new Hipotesis(1000);
        double h11 = h1.hipotesisMedia(203.5, 200, 16);
        
        System.out.println("n: " + h1.getTamanioMuestra());
        System.out.println("media muestral: " + h1.getMediaMuestral());
        System.out.println("media poblaiconal: " + h1.getMediaPoblacional());
        System.out.println("desviacion: " + h1.getDesviacionEstandar());
        
        System.out.println("hipotesis: " + h11);
        System.out.println("--------------------------------------------");
        
         Hipotesis h2 = new Hipotesis(48);
         h2.hipotesisMedia(59500, 60000, 5000);
         System.out.println("hipotesis 2: " + h2.hipotesisMedia(59500, 60000, 5000));
        
    }
    
}
