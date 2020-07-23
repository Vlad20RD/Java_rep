package ru.stqa.pft.sandbox;

import org.w3c.dom.ls.LSOutput;

public class hello {
	public static void main(String[] args){
	    Square s = new Square(5);
	    Rectangle r = new Rectangle(7, 5);

        System.out.println("Площадь квадрата = " + area(s));
        System.out.println("Площадь прямоугольника = " + area(r));
	}

	public static double area(Square s){
	    return s.l * s.l;
    }

    public static double area(Rectangle r){
        return r.a * r.b;
    }

}