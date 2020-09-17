import java.util.Scanner;
class Assi12{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int sal = sc.nextInt();
System.out.println("Enter Salary");

if(sal<10000){
    float HRA = (float)(0.1*sal);
    float DA =(float)(0.9*sal);
float GS = (float)(sal+DA+HRA);
System.out.println("GS ="GS);
}else{
    int HRA =2000;
    float DA = (float)(0.98*sal);
float GS = (float)(sal+DA+HRA);
System.out.println("GS = "GS);
}






        
}
}



