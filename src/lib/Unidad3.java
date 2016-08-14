/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import java.util.ArrayList;

/**
 *
 * @author JOSEF
 */
public class Unidad3 {
    /*** Valor equivalente al 95% de confianza */
    public final static double _95PORCIENTO = 1.65;
    public final static double _96PORCIENTO = 2.05;
    public final static double _99PORCIENTO = 2.58;
    /** Estimas por intervalos de confianza
     X +- Z (sigma/(raiz(n)))**/
    
    public ArrayList<Double> mediaPoblacional(double mediaMuestra, double varianza, double tamanoMuestra){
        ArrayList<Double> mp = new ArrayList<>();
        
        double suma = mediaMuestra + ( (_96PORCIENTO)*(varianza/Math.sqrt(tamanoMuestra)));
        double resta = mediaMuestra - ( (_96PORCIENTO)*(varianza/Math.sqrt(tamanoMuestra)));
        
        mp.add(suma);
        mp.add(resta);
        
        return mp;
    }
    
    public ArrayList<Double> mediaPoblacional(double mediaMuestra, double varianza, double tamanoMuestra, double gradoConfianza){
        ArrayList<Double> mp = new ArrayList<>();
        double suma = mediaMuestra + ( (gradoConfianza)*(varianza/Math.sqrt(tamanoMuestra)));
        double resta = mediaMuestra - ( (gradoConfianza)*(varianza/Math.sqrt(tamanoMuestra)));
        
        mp.add(suma);
        mp.add(resta);
        
        return mp;
    }
}
