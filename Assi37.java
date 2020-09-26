class person{
   private String name;
   private int age;

person(){
     age=18;
     name="Mahajan";
} 

person(String name,int age){
      this.name=name;
      this.age=age;
}

public String getName(){
     return name;
    }
public void setName(String name){
     this.name=name;
    }
public int getAge(){
     return age;
  }

public void setAge(int age){
      this.age=age;
  }

}
class Assi37{
public static void main(String args[]){
    person p = new person();
    System.out.println("Name ="+p.getName());
    System.out.println("Age  ="+p.getAge());

   person p1 =new person("Meghana",24);
   System.out.println("Name ="+p1.getName());
   System.out.println("Age  ="+p1.getAge());




}
}