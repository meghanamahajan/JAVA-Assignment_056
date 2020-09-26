import java.util.Scanner;
class CircleDemo{
  private int radius;
  private double Area;
   
 int firstInit(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius");
    
       radius = sc.nextInt();

     
       return radius;
    }
  double calArea(){
     float PI =3.14F; 
     Area =  (double)(PI*radius*radius);
       return Area;
  }
 void display(){
      System.out.println("Area ="+calArea());
    } 

}

class Assi34 {
public static void main(String args[])
{
  CircleDemo c = new CircleDemo();
  c.firstInit();
  c.display();
  
    


}
}