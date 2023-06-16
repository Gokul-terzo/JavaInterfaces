public class Main {
    public static void main(String args[]){
        show();
    }
    static int number=0;
    public static void show(){
        greet((message,num)-> System.out.println(message+num+number)); //static variables can be accessed in lambda
        greet(new Printer() {
            @Override
            public void consolePrinter(String message, int num) {
                System.out.println(message+number);  //In anonymous inner class also it can be accessed
            }
        });
    }

    public static void greet(Printer print){
        print.consolePrinter("Hello World",12);
    }
}

//In lambda, this keyword refers to the object of the class Main here.
//In anonymous inner function, it refers to the anonymous class
