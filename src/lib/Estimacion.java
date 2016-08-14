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
public class Estimacion {

    public final static double _95PORCIENTO = 1.96;
    public final static double _96PORCIENTO = 2.05;
    public final static double _99PORCIENTO = 2.58;

    private double mediaMuestral;
    private double desviacionEstandar;
    private final double tamanioMuestra;
    private final double nc;        //nivel de confianza
    private double proporcion;
    private double q;

    private ArrayList<Double> eMedia;
    private ArrayList<Double> eProporcion;

    public Estimacion(double tamanioMuestra, double nc) {
        this.tamanioMuestra = tamanioMuestra;
        this.nc = nc;
    }

    public double getMediaMuestral() {
        return mediaMuestral;
    }

    public double getDesviacionEstandar() {
        return desviacionEstandar;
    }

    public double getTamanioMuestra() {
        return tamanioMuestra;
    }

    public double getNc() {
        return nc;
    }

    public double getProporcion() {
        return proporcion;
    }

    public ArrayList<Double> geteMedia() {
        return eMedia;
    }

    public ArrayList<Double> geteProporcion() {
        return eProporcion;
    }

    public void estimacionMedia(double mediaMuestral, double desviacionEstandar) {
        eMedia = new ArrayList<>();
        this.mediaMuestral = mediaMuestral;
        this.desviacionEstandar = desviacionEstandar;

        double ii = this.mediaMuestral - (nc * (desviacionEstandar / Math.sqrt(tamanioMuestra)));
        double is = this.mediaMuestral + (nc * (desviacionEstandar / Math.sqrt(tamanioMuestra)));
        this.eMedia.add(ii);
        this.eMedia.add(is);
    }

    public double getQ() {
        return q;
    }

    public void setMediaMuestral(double mediaMuestral) {
        this.mediaMuestral = mediaMuestral;
    }

    public void setDesviacionEstandar(double desviacionEstandar) {
        this.desviacionEstandar = desviacionEstandar;
    }

    public void setProporcion(double proporcion) {
        this.proporcion = proporcion;
    }

    public void setQ(double q) {
        this.q = q;
    }

    public void estimacionProporcion(double proporcion) {
        eProporcion = new ArrayList<>();
        setProporcion(proporcion);

        this.q = 1 - proporcion;
        double ii = getProporcion() - (nc * Math.sqrt((this.proporcion * q) / tamanioMuestra));
        
        System.out.println("porp " + getProporcion());
        System.out.println("ppppppp " + nc * Math.sqrt((this.proporcion * q) / tamanioMuestra));
        
        double is = getProporcion() + (nc * Math.sqrt((this.proporcion * q) / tamanioMuestra));
        this.eProporcion.add(ii * 100);
        this.eProporcion.add(is * 100);
    }
}
