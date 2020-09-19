import java.util.Scanner;
class Assi17{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number : ");
int a =sc.nextInt();
int rev =0;
while(a !=0)
{
   int digit = a%10;
   rev =rev * 10 +digit;
   a = a/10;
}

System.out.println("Reversed Number : " +rev);

}
}