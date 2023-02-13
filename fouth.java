class A{
    public static void show()
    {
        System.out.println("In A show");
    }
    public final void run(){
        System.out.println("In A run");
    } 
}
class B extends A{
    public void run1(){  //cannot override final method 
        System.out.println("In B run");
    }
}
public class fouth {
    public static void main(String[] args) {
        A.show();//In static methods no need for object creation
        A a = new A();
        B b = new B();
        a.run();
        b.run();
        b.run1();
    }
}