class Employee {
   private int empNo;
   private float salary;
   private static float totalSalary;
   private static int count;

  Employee(float salary){ 
	count++;
	this.empNo=count;
	this.salary=salary;
	this.totalSalary = totalSalary+salary;
    }
  void display(){ 
	System.out.println("Total no of employees  : "+count + "\n total salaries of all employee:  "+totalSalary);
    }
  

}

class Assi38{
  public static void main(String args[]){
	Employee e = new Employee(30000.00F);
	Employee e1 = new Employee(30525.00F);
	Employee e2 = new Employee(30865.00F);
	Employee e3 = new Employee(30657.00F);
	Employee e4 = new Employee(30548.00F);
 	e4.display();

}

}