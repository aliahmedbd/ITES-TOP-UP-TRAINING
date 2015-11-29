public class Demo2 extends Demo{
    public void fun2(){
        System.out.println("From Demo2");
    }
    public static void main(String ...S){
        I1 d=new Demo2();
        d.fun1();
        d.fun2();
    }


}
