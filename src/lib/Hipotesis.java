/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

/**
 *
 * @author JOSEF
 */
public class Hipotesis {
        
    private double mediaMuestral;
    private double mediaPoblacional;
    private double desviacionEstandar;
    private final double tamanioMuestra;
    private double proporcionH;
    private double proporcion;
    private double q;

    public Hipotesis(double tamanioMuestra) {
        this.tamanioMuestra = tamanioMuestra;
    }    

    public double getMediaMuestral() {
        return mediaMuestral;
    }

    public void setMediaMuestral(double mediaMuestral) {
        this.mediaMuestral = mediaMuestral;
    }

    public double getMediaPoblacional() {
        return mediaPoblacional;
    }

    public void setMediaPoblacional(double mediaPoblacional) {
        this.mediaPoblacional = mediaPoblacional;
    }

    public double getDesviacionEstandar() {
        return desviacionEstandar;
    }

    public void setDesviacionEstandar(double desviacionEstandar) {
        this.desviacionEstandar = desviacionEstandar;
    }

    public double getProporcionH() {
        return proporcionH;
    }

    public double getTamanioMuestra() {
        return tamanioMuestra;
    }

    
    public void setProporcionH(double proporcion) {
        this.proporcionH = proporcion;
    }

    public double getProporcion() {
        return proporcion;
    }

    public void setProporcion(double proporcion) {
        this.proporcion = proporcion;
    }

    public double getQ() {
        return q;
    }

    public void setQ(double q) {
        this.q = q;
    }
    
    public double hipotesisMedia(double mediaMuestral, double mediaPoblacional, double desviacionEstandar){
        this.setMediaMuestral(mediaMuestral);
        this.setMediaPoblacional(mediaPoblacional);
        this.setDesviacionEstandar(desviacionEstandar);
        
        return (getMediaMuestral()-getMediaPoblacional())/(getDesviacionEstandar()/Math.sqrt(this.tamanioMuestra));
    }
    
    public double hipotesisMedia(){
        return (getMediaMuestral()-getMediaPoblacional())/(getDesviacionEstandar()/Math.sqrt(this.tamanioMuestra));
    }
    
    public double hipotesisProporcion(double proporcionH, double proporcion){
        this.setQ(1 - proporcionH);
        this.setProporcion(proporcion);
               
        return (getProporcion() - getProporcionH())/Math.sqrt((getProporcionH()*getQ())/this.tamanioMuestra);
    }
    
    public double hipotesisProporcion(){
        
        return (getProporcion() - getProporcionH())/Math.sqrt((getProporcionH()*getQ())/this.tamanioMuestra);
    }
}
