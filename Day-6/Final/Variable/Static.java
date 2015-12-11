class Static_variable
{
    //static final int a;//must be need to be initialize
   /* Static_variable(){
        this.a=5;
        System.out.println(this.a);
    }*/
    static int a;
    static{
        a=6;
    }

    void show(){
        System.out.println(a);
    }

    public static void main(String ... S){
        final Static_variable ob= new Static_variable();
        ob.a=5;
        ob.a=6;
        ob.show();
    }
}
