package Pracs;

public class primenumber_to1000 {
    public static void main(String[] args){
        int i, j, flag;
        System.out.println("The prime Number from 1-1000 is :");
        for(i = 1; i<=1000; i++){
            flag = 0;
            for(j = 2; j<=i/2; j++){
                if(i%j==0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.print(i+", ");
            }

        }
    }
}
