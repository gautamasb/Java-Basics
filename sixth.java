package sixth;
abstract class A{
    public abstract void show();
} 
class B extends A{
    public void show()
    {
        System.out.println("In B show");
    }
}
public class sixth{
    public static void main(String[] args) {
        B b1 =new B();
        b1.show();
    }
}