// EXP 8

import java.util.Scanner;

class Exp8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        volume ob = new volume();
        double radius = ob.accept();
        ob.display1(radius);
        double area = ob.area();
        ob.display2(area);
        double volume = ob.volume();
        ob.display3(volume);
    }
}

class circle {
    double r;

    double accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of the Sphere:");
        r = sc.nextInt();
        return r;
    }

    void display1(double value) {
        System.out.println("The Radius is: " + value);
    }

    void display2(double value) {
        System.out.println("The Area is: " + value);
    }

    void display3(double value) {
        System.out.println("The Volume is: " + value);
    }
}

class area extends circle {
    double area;

    double area() {
        area = 3.1415 * r * r;
        return area;
    }
}

class volume extends area {
    double volume;

    double volume() {
        volume = (4 / 3) * 3.1415 * r * r * r;
        return volume;
    }
}