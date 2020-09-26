import java.util.Scanner;
class Tile{
     public float edge;
  Tile(float edge){
   this.edge = edge;
    }
 }

class floor {
    private float length;
    private float width;
  floor(){}
  floor(float length,float width){
	this.length=length;
	this.width=width;

  }

   float TotalTiles(Tile t){
        float total =0;
	float area_tile = t.edge*t.edge;
	float area_floor = length * width;
        total = area_floor/area_tile;
          return total;
     } 
}
public class Assi42 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Tile Edge");
	  float el = sc.nextFloat();
          Tile t = new Tile(el);
       System.out.println("Enter Length and Breadth");
          float length = sc.nextFloat();
          float width = sc.nextFloat();
          floor f = new floor(length,width);
       float result = f.TotalTiles(t);
   System.out.println("Total No of titles ="+result );        





}
}