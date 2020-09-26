import java.util.Scanner;
class students{
	 String name;
	 int rollNo;
	 int age;
	 int score;
   students(){}
   students(String name,int rollNo,int age,int score){
	this.name=name;
	this.rollNo=rollNo;
	this.age=age;
	this.score=score;
     }

	

}
class Assi40{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
students st[] = new students[10];
System.out.println("Enter Array Element");
for(int i=0;i<st.length;i++){
   String name = sc.next();
   int rollNo = sc.nextInt();
   int age =sc.nextInt();
   int score = sc.nextInt();
   st[i] = new students(name,rollNo,age,score);       
}
   for(int i =0;i<st.length;i++){
	boolean flag = false;
   	
  	for(int j =i+1;j<st.length;j++){
	   if(st[i].score > st[j].score){
               students temp = st[i];
	       st[i]=st[j];
		st[j]=temp;
		flag=true;
   }
   if(flag==false)
				{
					break;
				}
			}
		}
		for(s tudents a : st) {
				if(a.score < 50)
			System.out.println( " less than 50  name : "+a.name+" age : "+a.age+" score : " +a.score);
		
			else if( a.score < 65){
			System.out.println( " less 50-65  name : "+a.name+" age : "+a.age+" score : " +a.score);
				
			}
			else if(a.score < 80){
			System.out.println( " less 65 -80  name : "+a.name+" age : "+a.age+" score : " +a.score);
				
			}
			else {
			System.out.println( " less 80-100 name : "+a.name+" age : "+a.age+" score : " +a.score);
				
			}
			

		}
   



}

}