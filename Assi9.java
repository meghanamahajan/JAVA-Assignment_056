import java.util.Scanner;
class Assi9{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Days");
int days =sc.nextInt();

       int year = days / 365;
        days = days % 365;
        System.out.println("No. of years:"+year);
        int week = days / 7;
        days = days % 7;
        System.out.println("No. of weeks:"+week);
      int  day = days;
        System.out.println("No. of days:"+day);

}
}