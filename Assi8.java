import java.util.Scanner;
class Assi8{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter P R T");
int p = sc.nextInt();
int R = sc.nextInt();
int T = sc.nextInt();

int SI1 = (p*R*T);
float SI = (float)SI1/100;

 System.out.println("Simple Intrest  ="+SI);

}
}