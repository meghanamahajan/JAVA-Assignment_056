import java.util.Scanner;
class Assi7{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Marks");
int s1 = sc.nextInt();
int s2 = sc.nextInt();
int s3 = sc.nextInt();
int s4 = sc.nextInt();
int s5 = sc.nextInt();

int sum =(s1+s2+s3+s4+s5);

Float marks =(float)(sum/5);
System.out.println("Percentage Marks = "+marks +"%");
}
}