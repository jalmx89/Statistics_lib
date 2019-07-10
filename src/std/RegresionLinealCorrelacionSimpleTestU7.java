/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package std;

import lib.RegresionLinealCorrelacionSimple;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JOSEF
 */
public class RegresionLinealCorrelacionSimpleTestU7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int x = 0;
        ArrayList<Double> tx = new ArrayList();
        ArrayList<Double> ty = new ArrayList();

        System.out.println("Dar una letra para ver los resultados");
        while (true) {
            try {
                System.out.println("Introducir valor de X");
                double w = new Scanner(System.in).nextDouble();
                tx.add(w);
                System.out.println("Introducir valor de Y");
                double q = new Scanner(System.in).nextDouble();
                ty.add(q);
                
            } catch (Exception e) {
                break;
            }
        }

        RegresionLinealCorrelacionSimple mmc = new RegresionLinealCorrelacionSimple(tx, ty);

        System.out.println("Sumatoria en X: " + mmc.getSumatoriaX());
        System.out.println("Sumatoria en Y: " + mmc.getSumatoriaY());
        System.out.println("Sumatoria en X2: " + mmc.getSumatoriaX2());
        System.out.println("Sumatoria en Y2: " + mmc.getSumatoriaY2());
        System.out.println("Sumatoria en XY: " + mmc.getSumatoriaXY());
        
        System.out.println("Ecuacion Y sobre X: " + mmc.getYsobreX());
        System.out.println("Ecuacion X sobre Y: " + mmc.getXsobreY());
        
        mmc.setR();
        
        System.out.println("Coefic r " + mmc.getR());
        System.out.println("Coefic r2 " + mmc.getR2());
        
        mmc.setT();
        System.out.println("Coefic t " + mmc.getT());
    }
}
