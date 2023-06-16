public class Main {
    public static void main(String args[]){
        show();
        constructorReference();
    }
public Main(){}
    //Lambda reference for constructors
    public Main(String s,int n){
        System.out.println(s);
    }
    public static void show(){
        //Syntax: class/object::method
        greet((message, num) -> System.out.println(message+num));
        greet(Main::print); //Same as above code
        //Another way of implementing this:
        Main obj=new Main();
        greet(((message, num) -> obj.print1(message,num)));
        greet(obj::print1);
    }
    public static void constructorReference(){
        greet((message, num) -> new Main(message,num));
        greet(Main::new);
    }
    public static void greet(Printer print){
        print.consolePrinter("Hello World",12);
    }

    private static void print(String message, int num) {
        System.out.println(message + num);
    }
    private  void print1(String message, int num) {
        System.out.println(message + num);
    }
}
//In lambda, this keyword refers to the object of the class Main here.
//In anonymous inner function, it refers to the anonymous class
