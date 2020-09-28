import java.util.Scanner;
abstract class process{
	double data;
   void showData(){
     System.out.println("Data ="+data);
   }
   
   abstract void process();
 }
 class fact extends process{
	 void process(){
		 int n= 5;
		 int sum=1;
		 for(int i =1;i<=n;i++){
			 sum = sum+i;
		 }
		 data = sum; 
	  }
 }
 
 class circle extends process{
	 void process(){
		  int r=5;
		  
		  double area=3.14*r*r;
		  data =area;
	 }
 }
class Assi48{
	public static void main(String args[]){
		   process p = new fact();
		   process p1=new circle();
		   p.process();
		   p1.process();
		   p.showData();
		   p1.showData();
	}
}