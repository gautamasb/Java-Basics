package third;
class Human {
    private int age;
    private String name;
    /**
     * 
     */
    public Human()  //default constructor
    {
        age =20;
        name="Gautam";
        System.out.println(age + " : "+name );
    }  
    public Human(int age,String name)
    {
        this.age = age;
        this.name = name;
        System.out.println(age+" : "+name);
    }
}
public class third {
    public static void main(String[] args) {
        new Human();
        
        new Human(34, "John");
        
    }
}