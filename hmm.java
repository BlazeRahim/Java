import java.util.Scanner;
class hmm
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double r,i;
        complex C=new complex();
        System.out.println("Enter the first number:");
        r=sc.nextInt();
        i=sc.nextInt();
        complex A= new complex(r,i);
        A.show();
        System.out.println("Enter the second number:");
        r=sc.nextInt();
        i=sc.nextInt();
        complex B= new complex(r,i);
        B.show();
        C.sum(A,B);
        C.show();
    }
}
 
class complex{
double real,img;
complex(){
    real=0;
    img=0;
}
complex(double r,double i){
    real=r;
    img=i;
}
 
void show()
{
    System.out.println("number: "+real+" +  "+img+"i");
}
 
public void sum(complex A, complex B)
{
    this.real=A.real+B.real;
    this.img=A.img+B.img;
}
} 