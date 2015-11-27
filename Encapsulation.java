class Demo{
 int a;
 /*public void set(int a){
    this.a=a;
 }
 public int get(){
    return a;
 } */
 public static void main(String ... S){
     Demo d1=new Demo();
     Demo d2=new Demo();
     d1.a=5;
     d2.a=10;
     System.out.println(d1.a);
     System.out.println(d2.a);
     d1.a=d2.a;//shallo copy
     d1.a=7;
     System.out.println(d1.a);
     System.out.println(d2.a);
     d1=d2;//deep copy
     d1.a=3;
     System.out.println(d1.a);
     System.out.println(d2.a);

 }
}
