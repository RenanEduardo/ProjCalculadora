/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.seminario.calculadora.Operacoes;

/**
 *
 * @author Silva
 */
public class Divisao {

    /**
     * @return the a
     */
    public float getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public float getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return the resultado
     */
    public float getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    private float a;
    private float b;
    private float resultado;
    
    
    public Divisao()
    {
        this.a = 0;
        this.b = 0;
        this.resultado = 0;
    }
    
    public float divide(int x, int y)
   {
       this.setA(x);
       this.setB(y);
       this.setResultado(x / y);
       return this.getResultado();
   }
}
