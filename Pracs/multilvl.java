package Pracs;

import java.util.Scanner;

class circle {
    double r;

    double accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the of radius of the sphere");
        r = sc.nextInt();
        return r;
    }

    void display(double value) {
        System.out.println("the value is:" + value);
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

class multilvl {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        volume ob = new volume();
        double radius = ob.accept();
        ob.display(radius);
        double area = ob.area();
        ob.display(area);
        double volume = ob.volume();
        ob.display(volume);
    }
}