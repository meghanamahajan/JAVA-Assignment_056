import java.util.Scanner;
class Assi24{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
System.out.println("Enter n");
      int ar[] = new int[5];
  for(int i =0;i<ar.length;i++){
   System.out.println("Enter");
        ar[i] = sc.nextInt();
     }
 for(int i=0;i<ar.length;i++){    
            if(ar[i] == n){ 
                 System.out.println("Indexed =" +i); 
               }
          }  
        
         
}
}