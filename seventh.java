@FunctionalInterface
interface A{
    void show();
}
class B implements A{
    public void show(){
        System.out.println("In B show");
    }
}
class C implements A{
    public void show(){
        System.out.println("In C show");
    }
}
class D implements A{
    public void show(){
        System.out.println("In D show");
    }
}
public class seventh{
    public static void main(String[] args) {
        A a = () -> {
                System.out.println("In A Show");
            };
        a.show();
        B b=new B();
        C c=new C();
        D d=new D();
        b.show();
        c.show();
        d.show();
    }
}