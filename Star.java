import java.util.Scanner;
public class Star 
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n = sc.nextInt();
int a, b;
for (a = 0; a < n; a++) 
{
for (b = 1; b <= a; b++) 
{
System.out.print(" "+"*"+" ");
}
System.out.println();
}
}
}