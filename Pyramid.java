import java.util.Scanner;
class Pyramid
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.println("enter the number to be printed:");
int x = s.nextInt();
System.out.println("max no.of times to be printed:");
int n = s.nextInt();
int i,j;
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(x+"");
}
System.out.println();
}
for(i=0;i<=n;i++)
{
for(j=n;j>i;j--)
{
System.out.print(x+"");
}
System.out.println();
}
}
}
