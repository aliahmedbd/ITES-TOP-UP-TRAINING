class Outer{
	class Inner{
		void fun1(){
			System.out.println("From inner fun1");
		}
		
	}
	void display(){
		System.out.println("From outer display");
		Inner ob =new Inner();
		ob.fun1();
	}
	public static void main(String ... S){
		Outer ob =new Outer();
		//Outer.Inner ob1=new Outer.Inner();
		ob.display();
		//ob1.fun1();
	}
}