package ru.stqa.pft.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
    public static void main(String[] args){
        List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP");

        for(int i = 0; i < languages.size(); i++){
            System.out.println("ЯП: " + languages.get(i));
        }

        for(String l : languages){
            System.out.println("ЯП: " + l);
        }
    }
}
