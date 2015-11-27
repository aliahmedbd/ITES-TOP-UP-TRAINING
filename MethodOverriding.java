class B extends Object{
    int a;
    B(){
       // System.out.println("Hello I am in B constructor");
    }
    public void Display(){
         System.out.println("Parent Class display");
         System.out.println("Value of a="+a);
    }
}
class A extends B{
    int a;
    A(){
        super.a=2;
        a=5;
    }
    public void Display(){
        System.out.println("Child Class");
        System.out.println("Value of a="+a);
        System.out.println("Value of a="+super.a);
    }

}
class Driver{
    public static void main(String ... S){
        A d=new A();
        d.Display();
        B d1=new B();
        d1.Display();
        d1=d;
        d1.Display();

    }
}
