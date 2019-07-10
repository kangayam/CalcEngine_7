package com.get.calcengine;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;

            //c = a / b;
        try {
            MathEquation equation = new MathEquation(a,b);
            System.out.println("Division exception example ");
            System.out.print(" The result : ");
            System.out.println(equation.getC());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        }

}
