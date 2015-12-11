class Instance
{
    final int a;//must be need to be initialize
    Instance(){
        this.a=5;
        System.out.println(this.a);
    }

    void show(){
        System.out.println(a);
    }

    public static void main(String ... S){
        Instance ob= new Instance();
        ob.show();
    }
}
