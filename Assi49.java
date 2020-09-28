import java.util.Scanner;

interface taxable{
	double salesTax =0.07;
	double incomeTax=0.10;
   void calTax();
}

class Employee implements taxable{
	int empId;
	int salary;
	String name;
	
	Employee(){}
	Employee(int empId,int salary,String name){
		this.empId=empId;
		this.salary=salary;
		this.name=name;
	}
	public void calTax(){
		double incomeTax1 = salary*incomeTax;
		System.out.println("Total Incometax1 = "+incomeTax1);
	}
}
class product implements taxable{
	int pid;
	double price;
	int quality;
	product(){}
	product(int pid,double price,int quality){
		this.pid=pid;
		this.price=price;
		this.quality=quality;
	}
	public void calTax(){
		double salesTax1 = (price*quality) *salesTax;
		System.out.println("Total SalexTax = "+salesTax1);
	}
}
	
	class Assi49{
	public static void main(String args[]){
		taxable t = new Employee(1,15000,"Meghana");
		taxable t1 = new product(1,400,5);
		t.calTax();
		t1.calTax();
		}
	}
	