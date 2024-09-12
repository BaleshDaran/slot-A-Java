import java.util.Scanner;
public class Aggregate
{
public static void main(String args[])
{
int python,maths,c,java,chemistry;
Scanner sc=new Scanner(System.in);

System.out.println("Enter a marks: ");
python=sc.nextInt();

System.out.println("Enter a marks: ");
maths=sc.nextInt();


System.out.println("Enter a marks: ");
c=sc.nextInt();



System.out.println("Enter a marks: ");
java=sc.nextInt();

System.out.println("Enter a marks: ");
chemistry=sc.nextInt();


int aggregate=(python+maths+c+java+chemistry)/5;

System.out.println("aggregate = "+aggregate);
if(aggregate>=75)
{
System.out.println("Distincction");
}
else if(aggregate>=60 && aggregate<75)
{
System.out.println("First Division");
}
else if(aggregate>=50 && aggregate<60)
{
System.out.println("Second Division");
}
else if(aggregate>=40 && aggregate<50)
{
System.out.println("Third Division");
}
else
{
System.out.println("Fail");
} 
System.out.println();
}
}

