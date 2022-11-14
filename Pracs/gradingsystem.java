package Pracs;

import java.util.*;

public class gradingsystem {
    public static void main(String[] args){
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your marks :");
        marks = sc.nextInt();
        sc.close();
        if((marks>=0) && (marks<40)){
            System.out.println("Fail");
        }
        else if(marks>=40 && marks<50){
            System.out.println("Pass");

        }
        else if(marks>=50 && marks<60){
            System.out.println("Second Class");

        }
        else if(marks>=60 && marks<70){
            System.out.println("First Class");

        }
        else if(marks>=70 && marks<=100){
            System.out.println("Distinction");

        }
    }
    
}
