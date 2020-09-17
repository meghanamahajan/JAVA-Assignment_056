import java.util.Scanner;
class Assi10{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Temperture");
int f =sc.nextInt();
int c1 =(f-32)*5;
float c =(float)(c1/9);
System.out.println("Temperture =" +c);

        
}
}