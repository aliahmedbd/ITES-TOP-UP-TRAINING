final class Demo{
    void show(){
        System.out.println("I am in final class");
    }

}
class Demo1 extends Demo{//Can't extends/Inheritance final class
    void show(){

        System.out.println("I am in child class");
    }
    public static void main(String ... S){
        Demo1 ob =new Demo();
        ob.show();
    }
}
