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
public class Unidad2 {

    private double n;
    private double x;
    private double p;
    private double q;

    CombPerm combinacion;

    /**
     * *** Distribución Binomial p(x) = (nCx )(p^x) (q ^(n-x))
     * @param n
     * @param x
     * @param p
     * @return
     */

    public Unidad2() {
        combinacion = new CombPerm();
    }

    public double distribucionBinomial(double n, double x, double p) {
        this.setP(p);
        this.setN(n);
        this.setX(x);
        this.falloQ();

        combinacion.setCombinacion(this.getN(), this.getX());
        double p_ = Math.pow(this.getP(), this.getX());
        double q_ = Math.pow(this.getQ(), this.getN() - this.getX());

        return combinacion.getCombinacion() * p_ * q_;
    }

    public double distribucionBinomial(double n, double x, double p, double q) {
        this.setP(p);
        this.setN(n);
        this.setX(x);
        this.setQ(q);

        combinacion.setCombinacion(this.getN(), this.getX());
        double p_ = Math.pow(this.getP(), this.getX());
        double q_ = Math.pow(this.getQ(), this.getN() - this.getX());

        return combinacion.getCombinacion() * p_ * q_;
    }
    
    private void falloQ() {// p+q=1 -> q = 1-p
        double f = 1 - this.p;
        this.setQ(f);
    }

    private double getN() {
        return n;
    }

    private void setN(double n) {
        this.n = n;
    }

    private double getX() {
        return x;
    }

    private void setX(double x) {
        this.x = x;
    }

    private double getP() {
        return p;
    }

    private void setP(double p) {
        this.falloQ();
        this.p = p;
    }

    private double getQ() {
        return q;
    }

    private void setQ(double q) {
        this.q = q;
    }

    public Double distribucionPoisson(double lamda, double x ){
        double l = Math.pow(lamda, x);
        double e = Math.pow(Math.E,-lamda);
        double x2 = CombPerm.factorial(x);
        
        return (l*e)/x2;
    }
}
