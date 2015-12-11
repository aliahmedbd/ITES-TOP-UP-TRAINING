class Outer{
    int a=5;
    static void show(){
        System.out.println("From outer class");
    }
    static class staticInner{
        void display(){
            System.out.println("From inner");
            show();
        }
    }
    public static void main(String ... S){
        Outer.staticInner ob=new Outer.staticInner();
        //ob.show();
        ob.display();
    }
}
