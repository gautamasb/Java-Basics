package first;
class Hello{
    public int multiply(int a,int b)
    {
        return a*b;
    }
    public double multiply(double a,double b,double c)
    {
        return a*b*c;
    }
}
public class first {
    
    public static void main(String[] args) {
        Hello h1 = new Hello();
        int num1 = h1.multiply(34, 45);
        System.out.println(num1);
        Hello h2 = new Hello();
        double num2 = h2.multiply(12.3,1.2 , 23.6);
        System.out.println(num2);
    }
}
