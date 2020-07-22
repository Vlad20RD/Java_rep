package ru.stqa.pft.sandbox;

import org.w3c.dom.ls.LSOutput;

public class hello {
	public static void main(String[] args){
	    String myName = "Vladlen";
	    double a = 5, b = 7;

        System.out.println("Площадь квадрата = " + area(a));
        System.out.println("Площадь прямоугольника = " + area(a, b));

        name(myName);
	}

	public static double area(double a){
	    return a*a;
    }

    public static double area(double a, double b){
        return a*b;
    }

    public static void name(String n){
	    System.out.println("Hi " + n + "!");
    }
}