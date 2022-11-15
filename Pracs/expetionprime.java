package Pracs;

import java.util.*;

public class expetionprime
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int[] n = new int[5];
        System.out.println("enter the prime numbers:");
        for(int i = 0 ; i<5;i++){
             n[i] = s.nextInt();
        }
       
        int j=0;
        for(int i=0; i<5; i++)
        {
            try
            {
               boolean condition = prime(n[i],false);
               if(condition==false){
                j++;
                throw new oddexception("Number is non prime:"+n[i]);
               }else{
                   System.out.println("the square of entered prime number:" + n[i] + " is " + n[i]*n[i]);
               }
              
            }
            catch(oddexception e)
            {
                 e.printStackTrace();
            }
        }
        System.out.println("Invalid numbers are : "+j);
    }
 
    

    
    static boolean prime(int num,boolean condition){
           
            int count=0;
             for(int k=num;k>0;k--){
                if(num%k==0){
                   count++;
                }
             }
             if(count==2){
                condition= true;
             }
            return condition;
    }

}

class oddexception extends Exception
{
    public oddexception(String message)
    {   
        System.out.println(message);
    
    }
}