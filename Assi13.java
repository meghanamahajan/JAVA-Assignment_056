import java.util.Scanner;
class Assi13{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a,b.c");
int a =sc.nextInt();
int b =sc.nextInt();
int c =sc.nextInt();
int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c); 
System.out.println("Greatest No : " +max);
        
}
}



