package methods;
public class DoSomething{
    static void doSomething(){
        System.out.println("Inside Method!!!");
        System.out.println("Still Inside!!!");
    }

    public static void main(String [] args){
        System.out.println("Before Method!!!");
        doSomething();
        System.out.println("After Method!!!");
    }
    
}