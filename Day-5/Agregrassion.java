class Address{
 String country;
 String city;
 String road;
 int houseNo;
 int floorNo;

 Address(String country,String city,String road,int houseNo,int floorNo)
 {
    this.country=country;
    this.city=city;
    this.road=road;

    this.houseNo=houseNo;
    this.floorNo=floorNo;
 }
}
class Employee{
    public String id;
    public String name;
    public float salary;
    Address add;
    Employee(String id,String name,float salary,Address add){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.add=add;
    }
    Address ob=new Address("Bangladesh","Dhaka","76/a",4,2);
    public void display(){
         System.out.println("Name:" +this.name+"\n Id:"
                           +this.id+"\nSalary:"+this.salary+"\nAddress:ROAD#"+add.road+",House#"+add.houseNo);

    }

    public static void main(String ... S){
        Address ob=new Address("Bangladesh","Dhaka","76/a",4,2);
        Employee ob1=new Employee("13-23059-1","Ali Ahmed",1000,ob);
        ob1.display();
    }
}
