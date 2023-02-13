package second;
class A 
{
    public void show()
    {
        System.out.println("In class A Show");
    }
}
class B extends A
{
    @Override
    public void show()
    {
        System.out.println("In B Show");
    }
}
public class Second {
    /**
     * @param args
     */
    public static void main(String[] args) {
        B b1 = new B();
        b1.show();
    }
}
