interface I1{
        void fun1();
        void fun2();
}
abstract class Demo1 implements I1{
    public void fun1(){
        System.out.println("From Demo1");
    }


}
class Demo2 extends Demo1{
    public void fun2(){
        System.out.println("From Demo2");
    }
    public static void main(String ...S){
        Demo d=new Demo2();
        d.fun1();
        d.fun2();
    }


}
