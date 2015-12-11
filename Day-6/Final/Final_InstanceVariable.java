class InstnaceVatiable{
	int a;
	final int b=5;
	InstnaceVatiable(int a,int b){
		this.a=a;
		this.b=b;//can not initilize multiple time for final instance variable

	}
	public void display(){
		//b=10;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String ... S){
		InstnaceVatiable ob =new InstnaceVatiable(5,10);
		ob.display();

	}

}