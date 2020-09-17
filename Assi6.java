import java.util.Scanner;
class Assi6{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Radius");

int r =sc.nextInt();
float Pi =3.14F;

 double A = Pi * r * r;

System.out.println("Area of Circle "+A);
}
}