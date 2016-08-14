/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

/**
 *
 * @author josef
 */
public class CombPerm {

    private double combinacion;
    private double permutacionR;
    private double permutacionS;

    /**
     * Retorna el valor de la <b> permutacion sin repeticion.</b>
     * <b>Formula: nPr   </b>
     * <b>Formula: nPr = n! / (n-r)!   </b> *
     * @return 
     */
    public double getPermutacionS() {
        return permutacionS;
    }

    /**
     * Metodo que recibe el valor de n y r , procesando los datos para <b>una
     * permutacion SIN repeticion.</b>
     * <b>Formula: nPr   </b>
     * <b>Formula: nPr = n! / (n-r)!   </b> *
     * @param n
     * @param r
     */
    public void setPermutacionS(double n, double r) {
        this.permutacionS = factorial(n) / factorial(n - r);
    }

    /**
     * Metodo que obtiene el valor de la combinacion.
     * <b>Formula: nCr  </b>  *
     * @return 
     */
    public double getCombinacion() {
        return combinacion;
    }

    /**
     * Metodo que recibe el valor de n y r , procesando los datos para la
     * combinacion.
     * <b>Formula: nCr   </b> *
     * @param n
     * @param r
     */
    public void setCombinacion(double n, double r) {
        this.combinacion = factorial(n) / (factorial(r) * factorial(n - r));
    }

    /**
     * Retorna el valor de la <b> permutacion CON repeticion.</b>
     * <b>Formula: nPr   </b>
     * <b>Formula: nPr = n^r   </b> *
     * @return 
     */
    public double getPermutacionR() {
        return permutacionR;
    }

    /**
     * Metodo que recibe el valor de n y r , procesando los datos para <b>una
     * permutacion CON repeticion.</b>
     * <b>Formula: nPr   </b>
     * <b>Formula: nPr = n^r  </b> *
     * @param n
     * @param r
     */
    public void setPermutacionR(double n, double r) {
        this.permutacionR = (int) Math.pow(n, r);
    }

    /**
     * Calcula el factorial de "f" -> <b>f! </b>  *
     */
    public static double factorial(double f) {
        double fact = 1;

        for (int i = 1; i <= f; i++) {
            fact *= i;
        }
        return fact;
    }

}
