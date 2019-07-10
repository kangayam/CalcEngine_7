package com.get.calcengine;

import java.sql.Statement;

public class MathEquation {

    private int a;
    private int b;
    private int c;
    String Formulae ="A/B";

    public MathEquation(){}

    public MathEquation(int a, int b) throws Exception{
       try {
           c = (a/b);
       }catch (ArithmeticException e){
           throw new InvalidStatementException("Incorrect Arithmetic", Formulae);
       }



    }
//getters
    public int getA() {return a;}
    public int getB() {return b;}
    public int getC() {return c;}
//setters
    public void setA(int a) {this.a = a;}
    public void setB(int b) {this.a = b;}
}
