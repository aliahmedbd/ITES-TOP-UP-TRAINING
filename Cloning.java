class Demo implements Cloneable{
    int a;
    public static void main(String ... S){
        Demo d=new Demo();
        Demo d1;
        try{
            d1=(Demo)d.clone();
            System.out.println(d.a);
            System.out.println(d1.a);

            d1.a=5;
            d.a=4;
            System.out.println(d.a);
            System.out.println(d1.a);

            d1=d;
            System.out.println(d.a);
            System.out.println(d1.a);

            d.a=8;
            //d1.a=10;

            System.out.println(d.a);
            System.out.println(d1.a);
        }
        catch(Exception e){
            System.out.println("Exception");
        }



    }
}
