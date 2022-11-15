package Pracs;

import java.util.*;

public class Arearecandsqr {
    public static void main(String[] args){
        int i = 0;
        Scanner sc = new Scanner(System.in);
        calculations cal = new calculations();        
        while(i!=3){

            System.out.println("1.Square\n2.Rectrangle\n3.Exit\nEnter Your choice : ");
            i = sc.nextInt();
            switch(i){
                case 1:
                    Double side;
                    System.out.println("Enter Side of Square : ");
                    side = sc.nextDouble();
                    System.out.println("The area of Square is :" + cal.square(side));
                    break;

                case 2: 
                    Double lenght;
                    Double breath;
                    System.out.println("Enter Lenght and breath");
                    lenght = sc.nextDouble();
                    breath = sc.nextDouble();
                    System.out.println("Area of rectrangle is: " + cal.rectrangle(lenght, breath));
                    break;
                
                case 3:
                    i = 3;
                    break;
                
                default:
                    System.out.println("Wrong input");
                
            }
        }
        
    }
}

class calculations{
    public Double square(Double side){
        return side*side;
    }

    public Double rectrangle(Double length, Double breath){
        return(length*breath);
    }
}
