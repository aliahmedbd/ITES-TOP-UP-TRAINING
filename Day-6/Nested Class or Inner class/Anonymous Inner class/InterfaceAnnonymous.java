interface Demo{
    void fun();
}
class Demo1{
    public static void main(String ... S){
     Demo d=new Demo(){
         public void fun(){
            System.out.println("I am in interface");
         }
     };
     d.fun();

    }
}
