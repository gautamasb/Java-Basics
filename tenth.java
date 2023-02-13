class Generic<T,U>{  //Classes with Generic Datatype
    T obj1;
    U obj2;
    public Generic(T obj1,U obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public void show(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
public class tenth{
    public static void main(String[] args) {
        Generic<String,Integer> gr = new Generic<String,Integer>("Gautam",20);
        gr.show();
    }
}