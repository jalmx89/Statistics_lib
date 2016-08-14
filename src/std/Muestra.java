/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package std;

import lib.Unidad3;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author JOSEF
 */
public class Muestra {

    /**
     * @param args the command line arguments
     */
    private ArrayList<Integer> muestra;
    public int tamanoMuestra;
    private double media;
    private double desviacion;
    
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Dar numero de muestra: ");
        int n = new Scanner(System.in).nextInt();
        
        Muestra m = new Muestra();
        m.setMuestra(18, 25, n);
    
        Unidad3 u = new Unidad3();

        ArrayList<Double> w =  u.mediaPoblacional(m.getMedia(), m.getDesviacion(),n , Unidad3._99PORCIENTO);
        
        
        System.out.println("Muestra: " + m.getMuestra());
        System.out.println("Media: "+ String.format("%.4f", m.getMedia()));
        System.out.println("Desviacion: "+ String.format("%.4f",m.getDesviacion() ));
        
        System.out.println( w.get(1)+" < Media estimada < "+ w.get(0));
    }

        
    public void setMuestra(int minimo, int maximo, int tamano) {
        
        ArrayList<Integer> r = new ArrayList<>();
        this.tamanoMuestra = tamano;
        for (int x = 0; x < tamano;) {
            int w = new Random().nextInt(maximo);
            if (w > minimo) {
                x++;
                r.add(w);
            }
        }
        this.muestra = r;
        this.setMedia();
        this.setDesviacion();
   }
    
    private void setMedia(){
        double m = 0;
        for(int x = 0;x<muestra.size();x++){
            m+=muestra.get(x);
        }
        this.media = m/muestra.size();
    }
    
    public double getMedia(){
        return this.media;
    }
    
    private void setDesviacion(){
        double s =0;
        for(int x = 0; x < this.muestra.size(); x++){
            s += Math.pow((muestra.get(0)- (this.media)), 2.0);
        }
        this.desviacion = Math.sqrt(s/this.muestra.size());
    }
    
    public double getDesviacion(){
        return this.desviacion;
    }
    
    public ArrayList<Integer> getMuestra(){
        return muestra;
    }
}
