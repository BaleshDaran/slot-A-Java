import java.util.Scanner;
class Tax
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the income:");
int n=sc.nextInt();
int i;
if(n<=150000)
{
System.out.println("No tax");
}
else if((n>150000)&&(n<300000))
{
i=(n/100)*10;
System.out.println("tax:"+i);
}
else if((n>300000)&&(n<500000))
{
i=(n/100)*20;
System.out.println("Tax:"+i);
}
else
{
i=(n/100)*30;
System.out.println("Tax:"+i);
}
}
}