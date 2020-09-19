import java.util.Scanner;
class Assi21 {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int ar[] = new int[10];
  for(int i =0;i<ar.length;i++){
   System.out.println("Enter");
        ar[i] = sc.nextInt();
     }

        
   
        int sum =0;
        int avg =0;
     for(int a : ar){
        System.out.println(a);
             sum = sum+a; 
             avg = sum/ar.length;
    } 
System.out.println("Sum ="+ sum +" and " +"Average =" + avg);
  }
}