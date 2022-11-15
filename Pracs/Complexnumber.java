package Pracs;
 
import java.util.*;



public class Complexnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r, i;
        complex C = new complex();
        System.out.println("enter the first number:");
        r = sc.nextInt(); //5+7i
        i = sc.nextInt();
        complex A = new complex(r, i);
        A.show();
        System.out.println("enter the second number:");
        r = sc.nextInt();
        i = sc.nextInt();
        complex B = new complex(r, i);
        B.show();
        C.sum(A, B);
        C.show();
    }
}

class complex {
    double real, img;

    complex() {
        real = 0;
        img = 0;
    }

    complex(double r, double i) {
        real = r;
        img = i;
    }

    void show() {
        System.out.println("number:" + real + "imaginary:" + img + "i");
    }

    public void sum(complex A, complex B) {
        this.real = A.real + B.real;
        this.img = A.img + B.img;
    }
}
