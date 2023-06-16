public class Main {
    public static void main(String args[]){
        show();
        show1();
    }
    public static void show(){
        greet((message,num)-> System.out.println(message+num)); //Lambda expression instead of anonymous inner class
    }

    public static void show1(){   //Anonymous inner class to avoid use of separate class
        Printer print=(message,num) -> System.out.println(message+num);  //Lambda expressions are objects
        print.consolePrinter("Hi",12);
        greet(new Printer() {
            @Override
            public void consolePrinter(String message,int num) {
                System.out.println(message+num);
            }
        });
    }
    public static void greet(Printer print){
        print.consolePrinter("Hello World",12);
    }
}
