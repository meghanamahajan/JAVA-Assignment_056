import java.util.Scanner;
class Assi16{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number : ");
int a =sc.nextInt();

for(int i=1;i<11;i++)
{
int table = a * i;
System.out.println(a +"*" +i +"=" +table);

}
}
}