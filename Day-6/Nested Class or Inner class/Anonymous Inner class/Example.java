abstract class Demo{
    abstract void fun();
}
class Demo1{
    public static void main(String ... S){
        Demo d=new Demo(){
            void fun(){
                System.out.println("I am demo");
            }
        };
        d.fun();

    }
}
