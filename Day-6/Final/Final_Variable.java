class Demo{
	public void display(int a,final int b){
		//b=10;//final local variable can not initialize multiple time
		System.out.println(a);
		System.out.println(b);

	} 
	public static void main(String ... S){
		Demo ob=new Demo();
		ob.display(8,9);

	}

}