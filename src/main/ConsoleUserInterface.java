package main;

import java.io.*;
import java.util.Scanner;

public class ConsoleUserInterface {
    Scanner sc =new Scanner(System.in);

    public void run(){

        Double a = getNumber("a");
        Double b = getNumber("b");
        Double c = getNumber("c");


    }

    public Double getNumber(String name){
        System.out.println("Provide: " + name);
        return sc.nextDouble();
    }
}
