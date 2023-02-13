package fifth;
class Calc {
    public int add(int a, int b)
    {
        return a+b;
    }
    public int sub(int a, int b)
    {
        return a-b;
    }
}
class AdvCalc extends Calc {  //single inheritance
    public int multiply(int a, int b)
    {
        return a*b;
    }
    public int div(int a, int b)
    {
        return a/b;
    }
}
class VeryAdvCalc extends AdvCalc {  //Multilevel inheritance
    /**
     * @param a
     * @param b
     * @return
     */
    public double pow(int a,int b)
    {
        return Math.pow(a, b);
    }
}
public class fifth {
    /**
     * @param args
     */
    public static void main(String[] args) {
        VeryAdvCalc adv = new VeryAdvCalc();
        System.out.println(adv.sub(12, 3));
        System.out.println(adv.pow(12, 3));
        System.out.println(adv.multiply(12, 3));
        System.out.println(adv.div(12, 3));
        System.out.println(adv.add(12, 3));
    }
}