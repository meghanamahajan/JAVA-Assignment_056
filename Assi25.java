import java.util.Scanner;
class Assi25{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

      int ar[] = new int[5];
  for(int i =0;i<ar.length;i++){
   System.out.println("Enter");
        ar[i] = sc.nextInt();
     }
        int even = 0;
        int odd = 0; 
     for(int i=0;i<ar.length;i++){
       if (i % 2 == 0) 
                even = even +ar[i]; 
            else
                odd = odd + ar[i]; 
    } 
        System.out.println("Even index positions sum: " + even); 
        System.out.println("Odd index positions sum: " + odd);
         
  
}
}
