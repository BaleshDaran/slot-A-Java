import java.util.Scanner;
class Derived
{
void Define()
{
int a=200;
System.out.println("Derived =" +a);
}
}


class Base extends Derived
{
void Pass()
{
int a=100;
System.out.println("Base ="+ a);

super.Define();
}
}

class Basederived
{
public static void main(String args[])
{
Base der=new Base();
der.Pass();
}
}
