class Employee{
	public String empName;
	public int empSalary;
	public String address;
	
	public Employee(){
		this("Meghana");
	}
	public Employee(String name){
		this(name,120035);
		}
	public Employee(String name,int sal){
        this(name,sal,"Mumbai");
	}
    public Employee(String name,int sal,String addr){
        this.empName=empName;
		this.empSalary=empSalary;
		this.address=addr;
	}
	
	void disp(){
		System.out.println("Employee name: "+empName);
		System.out.println("Employee Salary: "+empSalary);
		System.out.println("Employee Address: "+address);
	}
}
class Assi47{
public	static void main(String args[]){
	Employee e = new Employee();
	e.disp();
   }
}