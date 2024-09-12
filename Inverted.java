import java.util.Scanner;
class Inverted
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of rows:");
int b=sc.nextInt();
for(int i=b;i>=1;--i)
{
for(int space=1;space<=b-i;++space)
{
System.out.print(" ");
}
for(int j=1;j<=2*i-1;++j)
{
System.out.print("*");
}
for(int j=0;j<i-1;++j)
{
System.out.print("*");
}
System.out.println();
}
}
}