class OneBHK{
  float roomArea;
  float hallArea;
  double price;
  OneBHK(){
        
        roomArea=10;
	hallArea=20;
	price=450.0;
         }
  OneBHK(float roomArea,float hallArea,double price){
	this.roomArea=roomArea;
	this.hallArea=hallArea;
	this.price=price;
     }
  public void show(){
	System.out.println("Room ="+roomArea+" "+"Hall ="+hallArea+" "+"Price ="+price);
     }   
 }

class TwoBHK extends OneBHK{
  float room2Area;
 
  TwoBHK(){
         super();
       room2Area=200;
      }
  TwoBHK(float roomArea,float hallArea,double price,float room2Area)
    {
        super(roomArea,hallArea,price);
        this.room2Area=room2Area;
    }
  public void show()
     {
      super.show();
        System.out.println("room2Area ="+room2Area);
      }
   
    
}
public class Assi43 {
    public static void main(String args[]){
     TwoBHK t = new TwoBHK();
	t.show();
     }
}