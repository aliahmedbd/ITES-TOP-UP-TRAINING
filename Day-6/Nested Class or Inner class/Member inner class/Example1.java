class Outer{
    int a=5;
    void show(){
        System.out.println("From outer class");
    }
    class Inner{
        int b=6;
        void add(){
            System.out.println((a+b));
        }

        void show(){
            System.out.println("From inner");
            Outer ob=new Outer();
            ob.show();
        }
    }
    public static void main(String ... S){
        Outer ob =new Outer();
        ob.show();
        Outer.Inner i= ob.new Inner();
        i.add();
        i.show();
    }
}
