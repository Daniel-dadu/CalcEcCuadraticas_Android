package com.example.ecuacionessegundogrado;

import java.text.NumberFormat;

public class Calculator {
    // uso la clase NumberFormat para darle formato a los números doubles y que no imprima
    // muchos decimales
    NumberFormat n = NumberFormat.getNumberInstance();

    public String calculate(int a, int b, int c){
        int raiz = b*b - 4*a*c;
        // Se establece el número de decimales que debe usar (decimal places)
        n.setMaximumFractionDigits(3);
        if(raiz < 0){
            double resA1 = Math.sqrt(-1*raiz) / (2*a);
            double resA2 = (-Math.sqrt(-1*raiz)) / (2*a);
            double resB = (double)(-b)/(2*a);
            return n.format(resB) + (resA1 > 0 ? "+" : "") + n.format(resA1) + "ix" +
                    n.format(resB) + (resA2 > 0 ? "+" : "") + n.format(resA2) + "i";
        } else{
            return n.format((double)((-b + Math.sqrt(raiz)) / (2*a))) + "x"
                    + n.format((double)((-b - Math.sqrt(raiz)) / (2*a)));
        }
    }
}
