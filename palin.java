import java.util.Scanner;
class exp7
{
    public static void main(String[] args)
    {
        palin ob = new palin();
        ob.input();
        ob.palindrome();
    }
}


class palin
{
    Scanner sc = new Scanner(System.in);
    String str;
    String rev;
    StringBuffer strl = new StringBuffer();
    void input()
    {
        System.out.println("Enter a string of your choice");
        str=sc.nextLine();
        strl.append(str);
    }
    void palindrome()
    {
        strl.reverse();
        rev=strl.toString();
        if(str.equalsIgnoreCase(rev))
        System.out.println("The given string" +str+ " is a Palindrome");
        else
        System.out.println("The given string" +str+ " is not a Palindrome");
    }
}

