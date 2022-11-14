import java.util.Scanner;

public class ep6
{
    public static void main(String[] args) 
        {
            int a[][], b[][], sum[][], t[][];
            int r, c, i, j;

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no. of rows and columns");
            r = sc.nextInt();
            c = sc.nextInt();
            a = new int[r][c];
            b = new int[r][c];
            System.out.println("Enter first matrix");
            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                    System.out.println("Enter data :");
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter second matrix");
            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                    System.out.println("Enter data :");
                    b[i][j] = sc.nextInt();
                }
            }
            sum = new int[r][c];
            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                    sum[i][j]=a[i][j]+b[i][j];
                }
            } 
            //display
            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                System.out.print(sum[i][j]+" ");
                }
                System.out.println();
            }
            //transpose
            t=new int[r][c]; 

            for(i=0;i<c;i++)
            {
            for(j=0;j<r;j++)
            {
                t[i][j]=sum[j][i];
            }
        }
        System.out.println();
        System.out.println();
        
            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++)
                    {
                        System.out.print(t[i][j]+" ");
                    }
                    System.out.println();
            }
        }
    }

