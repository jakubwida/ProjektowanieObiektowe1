package main;

import java.io.*;
import java.util.Scanner;

public class ConsoleUserInterface {
    Scanner sc =new Scanner(System.in);
    Delta d = new Delta();

    public void run(){

        double a = getNumber("a");
        double b = getNumber("b");
        double c = getNumber("c");
        d.delta(a,b,c);

    }

    public Double getNumber(String name){
        System.out.println("Provide: " + name);
        return sc.nextDouble();
    }
}
