c.lass Outer{
    int a=5;
    final void fun(){
        System.out.println(a);
    }
    void display(int a,final int b){
        System.out.println(a+b);
        class LocalInner{
        //    a=8;
            //b=5;
            void fun1(){
                System.out.println(a+b);
                fun();
            }
        }
        LocalInner i=new LocalInner();
        i.fun1();
        i.b=5;
        System.out.println(i.b);
       // i.fun();
    }
    public static void main(String ... S){
      Outer o=new Outer();
        o.fun();
        o.display(8,9);
    }

    }
