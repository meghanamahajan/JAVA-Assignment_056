class thisConst{

  thisConst(){
	 this(10);
	System.out.println("0 para");
    }
thisConst(int a){
	 this(10,20);
	System.out.println(a);
    }
thisConst(int a,int b){
	System.out.println("a ="+a+" "+"b ="+b);
    }
}
public class Assi41 {
    public static void main(String args[]){
        thisConst t = new thisConst(); 
          
    }
}