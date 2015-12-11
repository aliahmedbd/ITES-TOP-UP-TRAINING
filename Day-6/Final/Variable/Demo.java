class Demo{
    int a;
    void set(final int a){
        a=5;//final can not be override multiple time.
        this.a=a;
        //System.out.println(a);

    }
    public static void main(String ... S){
        Demo ob=new Demo();

        ob.set(5);
        System.out.println(ob.a);
        ob.set(6);
        System.out.println(ob.a);
    }
}
