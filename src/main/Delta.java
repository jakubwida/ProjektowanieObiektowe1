package main;

class Delta {

    void delta(double a, double b, double c) {
        double delta;
        if(a == 0){
            System.out.println("Not a quadratic equation!");
        } else {
            delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("No results");
            } else if (delta == 0) {
                System.out.printf("The equation has one element: %f", (-b / (2 * a)));
            }
            if (delta > 0) {
                System.out.println("The equation has two elements:");
                System.out.println("x1 = " + (-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("x2 = " + (-b + Math.sqrt(delta)) / (2 * a));
            }
        }
    }

}
