// EXP 10 Creds jammy
import java.util.*;

class exp10 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int[] n = new int[5];
        System.out.println("enter the elements");
        for (int i = 0; i < 5; i++) {
            n[i] = s.nextInt();
        }

        int j = 0;
        for (int i = 0; i < 5; i++) {
            try {
                if (n[i] % 2 != 0) {
                    j++;
                    throw new oddexception("Number is odd " + n[i]);
                }
            } 
            catch (oddexception e) {
                System.out.println("Caught YOU!");
            }
        }
        System.out.println("Invalid numbers are : " + j);
    }
}

class oddexception extends Exception {
    public oddexception(String message) {
        System.out.println(message);

    }
}