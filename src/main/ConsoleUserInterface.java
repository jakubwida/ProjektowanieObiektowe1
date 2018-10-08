package main;

import java.util.Scanner;

class ConsoleUserInterface {
    Scanner sc =new Scanner(System.in);
    Delta d = new Delta();

    void run(){
        double a = getNumber("a");
        double b = getNumber("b");
        double c = getNumber("c");
        d.delta(a, b, c);
    }

    private Double getNumber(String name){
        System.out.println("Provide: " + name);
        return sc.nextDouble();
    }

}
