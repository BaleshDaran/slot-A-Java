import java.util.Scanner;
public class Multi
{
public static void main(String args[])
{
int n1,n2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value of n1:");
n1=sc.nextInt();
System.out.println("Enter a value of n2:");
n2=sc.nextInt();
for(int i=1;i<=n1;i++)
{

System.out.println(i + "*" + 5 + "=" + i*5);
}
System.out.println();

for(int j=1;j<=n2;j++)
{

System.out.println(j + "*" + 10 + "=" + j*10);
}
System.out.println();
}
}
