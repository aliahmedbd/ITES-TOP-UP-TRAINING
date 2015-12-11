class PizzaHut{
    final int price =200;
    final void show(){
        System.out.println("Shop should be red");
    }
    void chairs(){
        System.out.println("You should provide chairs");
    }
}
class MyPizza extends PizzaHut{
    void chairs(){
        System.out.println("I have square chairs");
    }
    public static void main(String ... S){
        MyPizza ob=new MyPizza();
        ob.show();
        ob.chairs();
    }
}
