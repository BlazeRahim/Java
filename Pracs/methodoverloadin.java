package Pracs;

import java.util.*;

public class methodoverloadin {
    public static void main(String[] args){
        int i = 0;
        Scanner sc = new Scanner(System.in);
        calculations cal = new calculations();        
        while(i!=3){

            System.out.println("1.Square\n2.Trangle\n3.Exit\nEnter Your choice : ");
            i = sc.nextInt();
            switch(i){
                case 1:
                    Double side;
                    System.out.println("Enter Side of Square : ");
                    side = sc.nextDouble();
                    System.out.println("The area of Square is :" + cal.area(side));
                    break;

                case 2: 
                    Double hight;
                    Double breath;
                    System.out.println("Enter Hight and breath");
                    breath = sc.nextDouble();
                    hight = sc.nextDouble();
                    System.out.println("Area of Traiangle is: " + cal.area(hight, breath));
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
    public Double area(Double side){
        return side*side;
    }

    public Double area(Double hight, Double breath){
        return(0.5*hight*breath);
    }

}

