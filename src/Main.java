//Code to input radius of the circle and print area of the circle.

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double r=scan.nextDouble();
        //scan.close();
        double area = 3.14* r* r;
        System.out.println(area);
    }
}
