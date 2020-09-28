class person{
   void getDetails(){
   System.out.println("Person details");
   }
   void getJob(){
   System.out.println("person job");
   }
   }
   class Employee extends person{
	   void getJob(){
		   System.out.println("Employee Job");
	   }
	   void getDepartment(){
		   System.out.println("Department");
	   }
   }
   class Assi46{
	   public static void main(String args[]){
		   person ar[] ={new Employee(),new person()};
		   for (person p:ar){
			   if(p instanceof Employee){
				   System.out.println("Meghana");
				   Employee e = (Employee)p;
				   e.getDepartment();
			   }
			   else{
				   System.out.println("Mahajan");
				   p.getJob();
				   p.getDetails();
			   }
		   }
	   }
   }