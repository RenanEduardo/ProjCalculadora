/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.seminario.calculadora.Operacoes;

/**
 *
 * @author renan
 * @version 0.1
 * 
 */
public class Operacao {
    private Soma soma;
    private Multiplicacao multi;
    private Subtracao subtracao;
    private Divisao divisao;
    
    public Operacao()
    {
        soma = new Soma();
        multi = new Multiplicacao();
        subtracao = new Subtracao();
        divisao = new Divisao();
    }
    
    private int verificaQntOp(String op, String calc)
    {
        int tam = calc.length();
        int aux = 0;
        char operador = op.charAt(0);
        char[] array = calc.toCharArray();
        for(int i = 0; i < tam; i++)
        {
            if(operador == array[i])
            {
                aux++;
            }
        }
        return aux;
    }
    private int[] trataString(String op, String calc)
    {
        int[] valores = new int[2];
        try{
            //String[] aux = calc.split(op);
            //int qnt = verificaQntOp(op,calc);
            String[] aux = calc.split(op);
            int a = Integer.valueOf(aux[0]);
            int b = Integer.valueOf(aux[1]);
            valores[0] = a;
            valores[1] = b;
            return valores;
        }catch(Exception e)
        {
            System.out.println(e);
        }
        return valores;
    }
    public float verificaOperacao(String op, String calc)
    {
        float resultado;
        int[] valores = new int[2];
        switch (op)
        {
            case "\\+":
                valores = this.trataString(op, calc);
                resultado = soma.soma(valores[0], valores[1]);
                return resultado;
            
             case "\\-":
                valores = this.trataString(op, calc);
                resultado = subtracao.subtrait(valores[0], valores[1]);
                return resultado;
             
                
            case "X":
                valores = this.trataString(op, calc);
                resultado = multi.multiplica(valores[0], valores[1]);
                return resultado;
                
             case "/":
                valores = this.trataString(op, calc);
                resultado = divisao.divide(valores[0], valores[1]);
                return resultado;
            default:
                break;
        }
        return 0;
                
                
    }
    
            
}
